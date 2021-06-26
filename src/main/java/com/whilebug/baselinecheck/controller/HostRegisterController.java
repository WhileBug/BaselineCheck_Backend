package com.whilebug.baselinecheck.controller;


import com.whilebug.baselinecheck.pojo.Hosts;
import com.whilebug.baselinecheck.pojo.Users;
import com.whilebug.baselinecheck.service.impl.HostRegisterServiceImpl;
import com.whilebug.baselinecheck.service.impl.HostsServiceImpl;
import com.whilebug.baselinecheck.service.impl.UsersServiceImpl;
import io.swagger.annotations.*;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 注册主机
 *
 * @author 李奕轩
 * @since 2021-06-23 16:54:29
 * @version 1.0
 */
@RestController
@RequestMapping("/hostregister")
@Api(value = "客户机注册",tags = "客户机注册接口API")
@ApiResponses({
        @ApiResponse(code=400,message="请求参数不完整或者错误"),
        @ApiResponse(code=404,message="找不到页面"),
        @ApiResponse(code=405,message="请求方式不正确，比如后台接收是post，但前端请求的是get"),
        @ApiResponse(code=406,message="页面地址和接口名冲突"),
        @ApiResponse(code=415,message="请求格式不正确，前端可能没有把请求头修改为json，也可能前端请求的json对象没有转换为字符串"),
        @ApiResponse(code=500,message="后台服务逻辑错误")
})
public class HostRegisterController {
    /**
     * 服务对象
     */
    @Resource
    private HostRegisterServiceImpl hostRegisterServiceImpl;
    @Resource
    private HostsServiceImpl hostsServiceImpl;

    /**
     * GUI登录接口
     * @param username  用户名
     * @param password  密码
     * @return 用户对象id
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "GUI登录接口",notes = "GUI登录接口",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "用户名",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "password",value = "密码",paramType = "query",dataType = "String",required = true)
    })
    public Map<String, Object> login(@RequestParam(name = "username",required = true) String username, @RequestParam(name = "password",required = true)String password) {

        return this.hostRegisterServiceImpl.loginUser(new Users(username, md5(username,password)));
    }

    /**
     * 设备注册接口-GUI
     * @param  host 客户机实例
     * @return 用户对象id
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ApiOperation(value = "设备注册接口",notes = "设备注册接口",httpMethod = "POST")
    public Map<String, Object> register(@RequestBody @ApiParam(name = "host",value = "pojo模型",required = true) Hosts host) {

        return this.hostRegisterServiceImpl.hostRegister(host);
    }

    /**
     * web页面判断是否注册成功
     * @param  host 客户机实例
     * @return json 提示信息
     */
    @RequestMapping(value = "/successornot", method = RequestMethod.POST)
    @ApiOperation(value = "web判断设备是否注册成功",notes = "判断设备是否注册成功",httpMethod = "POST")
    public Map<String, Object> successOrNot(@RequestBody @ApiParam(name = "host",value = "pojo模型",required = true) Hosts host) {
        Map<String, Object> map = this.hostRegisterServiceImpl.getHostByMac(host.getHostMac());
        if (map != null) {
            if (map.get("code").equals(200)){
                return this.hostsServiceImpl.updateByMac(host);
            }
        }
        return this.hostRegisterServiceImpl.getHostByMac(host.getHostMac());
    }

    /**
     * 获取用户唯一标识PID
     * @param  username 用户名
     * @return PID
     */
    @RequestMapping(value = "/getpid", method = RequestMethod.POST)
    @ApiOperation(value = "获取用户唯一标识接口",notes = "用户唯一标识接口接口",httpMethod = "POST")
    public Map<String, Object> getPID(@RequestParam @ApiParam(name = "username",required = true) String username) {
        return this.hostRegisterServiceImpl.getPID(new Users(username,null));
    }
    // 注册时，进行shiro加密，返回加密后的结果，如果在加入shiro之前，存在用户密码不是此方式加密的，那么将无法登录
    // 使用用户名作为盐值
    // 123456 -> md5加密会转换成一个  32位长度 16进制的值  1Fa2R34dDRGm123iADn...   账号是admin
    // 不管是md5还是shiro，加密之后的数据，是不可逆向的
    private String md5(String username, String password){
        String hashAlgorithmName = "MD5";                   // 加密方式
        ByteSource salt = ByteSource.Util.bytes(username);  // 以账号作为盐值
        int hashIterations = 11;                            // 加密11次
        return new SimpleHash(hashAlgorithmName, password, salt, hashIterations).toString();
    }


}
