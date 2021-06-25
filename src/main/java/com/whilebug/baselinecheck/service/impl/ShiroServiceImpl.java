package com.whilebug.baselinecheck.service.impl;

import com.whilebug.baselinecheck.mapper.HostsMapper;
import com.whilebug.baselinecheck.mapper.UsersMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class ShiroServiceImpl {

    @Resource
    private UsersMapper usermapper;

    public Map<String, Object> loginUser(String username, String password) {
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

    public Map<String, Object> logout() {
        //在这里执行退出系统前需要清空的数据
        Subject subject = SecurityUtils.getSubject();
        if(subject.isAuthenticated()) {
            subject.logout();
        }
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "成功退出");
        return map;
    }
}

