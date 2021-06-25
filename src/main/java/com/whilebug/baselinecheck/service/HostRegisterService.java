package com.whilebug.baselinecheck.service;

import com.whilebug.baselinecheck.pojo.Hosts;
import com.whilebug.baselinecheck.pojo.Users;
import org.apache.catalina.User;

import java.util.Map;

/**
 * 主机注册服务接口
 */
public interface HostRegisterService {

    /**
     * 用户登录
     * @param user
     * @return
     */

    Map<String, Object> loginUser(Users user);

    /**
     * 主机注册
     */
    Map<String, Object> hostRegister(Hosts hosts);

    /**
     * 返回用户PID,才能用
     */
    Map<String, Object> getPID(User user);
}
