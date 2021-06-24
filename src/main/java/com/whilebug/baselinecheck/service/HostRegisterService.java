package com.whilebug.baselinecheck.service;

import com.whilebug.baselinecheck.pojo.Hosts;

import java.util.Map;

/**
 * 主机注册服务接口
 */
public interface HostRegisterService {

    /**
     * 主机注册
     */
    Map<String, Object> hostRegister(Hosts hosts);
}
