package com.whilebug.baselinecheck.service;

import com.whilebug.baselinecheck.pojo.Hosts;
import com.whilebug.baselinecheck.pojo.Users;
import org.apache.catalina.User;

import java.util.Map;

/**
 * 主机注册服务接口
 *
 * @author 王沛然
 * @since 2021-06-23 16:54:29
 * @version 1.0
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
     * @param hosts
     * @return
     */
    Map<String, Object> hostRegister(Hosts hosts);

    /**
     * 返回用户PID,才能用
     * @param user
     * @return
     */
    Map<String, Object> getPID(User user);

    /**
     * 根据据ip得到Mac的值
     * @param Mac
     * @return
     */
    Map<String, Object> getHostByMac(String Mac);
}
