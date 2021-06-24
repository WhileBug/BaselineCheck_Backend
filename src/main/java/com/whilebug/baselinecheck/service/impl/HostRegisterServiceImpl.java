package com.whilebug.baselinecheck.service.impl;

import com.whilebug.baselinecheck.mapper.HostsMapper;
import com.whilebug.baselinecheck.pojo.Hosts;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class HostRegisterServiceImpl {

    @Resource
    private HostsMapper hostsMapper;

    /**
     * 主机注册
     */
    public Map<String, Object> hostRegister(Hosts hosts){
        // UUID.randomUUID()  返回内容：asd21321-ewrewrew213213-123213zsad-123asdasd这样的形态
        this.hostsMapper.insert(hosts);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);   // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
        map.put("msg", "新增成功");
        return map;
    }
}
