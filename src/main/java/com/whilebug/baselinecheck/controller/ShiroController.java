package com.whilebug.baselinecheck.controller;

import com.whilebug.baselinecheck.service.impl.ShiroServiceImpl;
import com.whilebug.baselinecheck.service.impl.UsersServiceImpl;
import io.swagger.annotations.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping(value = "/shiro")
@Api(value = "用户表(shiro)管理",tags = "用户表(shiro)管理接口API")
@ApiResponses({
        @ApiResponse(code=400,message="请求参数不完整或者错误"),
        @ApiResponse(code=404,message="找不到页面"),
        @ApiResponse(code=405,message="请求方式不正确，比如后台接收是post，但前端请求的是get"),
        @ApiResponse(code=406,message="页面地址和接口名冲突"),
        @ApiResponse(code=415,message="请求格式不正确，前端可能没有把请求头修改为json，也可能前端请求的json对象没有转换为字符串"),
        @ApiResponse(code=500,message="后台服务逻辑错误")
})
public class ShiroController {

    @Resource
    private UsersServiceImpl userService;
    @Resource
    private ShiroServiceImpl shiroService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "登录接口",notes = "登录接口",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "用户名",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "password",value = "密码",paramType = "query",dataType = "String",required = true)
    })
    public Map<String, Object> login(@RequestParam String username, @RequestParam String password, HttpServletRequest request) {
        System.out.println(request.getRequestURL());
        System.out.println(request.getLocalAddr());
        System.out.println(request.getRemoteAddr());
        System.out.println(request.getRequestURI());
        return shiroService.loginUser(username, password);
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ApiOperation(value = "注册接口",notes = "注册接口",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username",value = "用户名",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "password",value = "密码",paramType = "query",dataType = "String",required = true)
    })
    public Map<String, Object> registerUser(@RequestParam String username, @RequestParam String password) {
        return userService.registerUser(username, md5(username, password));
    }


    @RequiresAuthentication
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public Map<String, Object> logout() {
        return this.shiroService.logout();
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
