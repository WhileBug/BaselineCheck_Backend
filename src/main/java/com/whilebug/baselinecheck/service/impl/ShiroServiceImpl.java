package com.whilebug.baselinecheck.service.impl;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ShiroServiceImpl {
    public Map<String, Object> selectUser(String username, String password) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 506);
        map.put("msg", "用户认证不成功");
        Subject currentUser = SecurityUtils.getSubject();                                     // shiro权限认证主体对象
        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken upToken = new UsernamePasswordToken(username, password);    // shiro权限认证类型
            upToken.setRememberMe(true);                                                     // 用户登录时效性
            try {
                currentUser.login(upToken);    // 调用realm认证用户权限
                map.put("code", 200);
                map.put("msg", "登录成功");
            } catch (IncorrectCredentialsException ice) {
                map.put("code", 501);
                map.put("msg", "用户名/密码不匹配！");
                System.out.println("用户名/密码不匹配！");
            } catch (LockedAccountException lae) {
                map.put("code", 501);
                map.put("msg", "账户已被冻结！");
                System.out.println("账户已被冻结！");
            } catch (UnknownAccountException uae) {
                map.put("code", 501);
                map.put("msg", "账户不存在!");
                System.out.println("账户不存在");
            } catch (AuthenticationException ae) {
                map.put("code", 501);
                map.put("msg", "额外的错误");
                System.out.println("额外的错误");
                System.out.println(ae.getMessage());
            }
        }
        return map;
    }
}

