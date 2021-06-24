package com.whilebug.baselinecheck.controller;


import com.whilebug.baselinecheck.pojo.Hosts;
import com.whilebug.baselinecheck.service.impl.HostRegisterServiceImpl;
import com.whilebug.baselinecheck.service.impl.UsersServiceImpl;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 注册主机
 *
 * @author makejava
 * @since 2021-06-23 16:54:29
 * @version 1.0
 */
@RestController
@RequestMapping("/hostregister")
@Api(value = "主机数据表(Hosts)管理",tags = "主机数据表(Hosts)管理接口API")
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
    private UsersServiceImpl usersServiceImpl;

    /**
     * 通过主键查询单条数据
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
    public Integer Login(@RequestParam(name = "username") String username, @RequestParam(name = "password")String password) {

        return this.usersServiceImpl.getUser(username).getId();
    }

    /**
     * 通过主键查询单条数据
     * @param  host 客户机实例
     * @return 用户对象id
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ApiOperation(value = "设备注册接口",notes = "设备注册接口",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "host",value = "客户机pojo对象",paramType = "query",dataType = "Json",required = true),
    })
    public Map<String, Object> Register(@RequestBody @ApiParam(name = "host",value = "pojo模型",required = true) Hosts host) {

        return this.hostRegisterServiceImpl.hostRegister(host);
    }

}
