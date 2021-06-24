package com.whilebug.baselinecheck.service.impl;

import com.whilebug.baselinecheck.mapper.HostsMapper;
import com.whilebug.baselinecheck.mapper.UsersMapper;
import com.whilebug.baselinecheck.pojo.Hosts;
import com.whilebug.baselinecheck.pojo.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Service
public class HostRegisterServiceImpl {

    @Resource
    private HostsMapper hostsMapper;

    @Resource
    private UsersMapper usersMapper;

    /**
     * 用户登录
     */
    public Map<String, Object> loginUser(Users user){
        //从数据库中查数据
        Users dbUser = usersMapper.getUser(user.getUserName());

        if (dbUser == null) {

            //说明用户不存在
//            return new JsonData(1001,"用户不存在");
//            throw new LoginException(1001,"用户不存在");

            Map<String, Object> map = new HashMap<>();
            map.put("code", 1001);   // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
            map.put("msg", "用户不存在");
            return map;
        }

        //判断状态
        if(dbUser.getUserStatus()!=null && !(dbUser.getUserStatus().equals(0))){
//            return new JsonData(1001,"用户被锁定,联系管理员");
//            throw new LoginException(1002,"用户被锁定,联系管理员");
            Map<String, Object> map = new HashMap<>();
            map.put("code", 1002);   // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
            map.put("msg", "用户被锁定");
            return map;

        }

        //判断密码正确
        if(!dbUser.getUserPasswrod().equals(user.getUserPasswrod())){
//            return new JsonData(1001,"密码错误");
//            throw new LoginException(1003,"密码错误");
            Map<String, Object> map = new HashMap<>();
            map.put("code", 1003);   // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
            map.put("msg", "密码错误");
            return map;
        }

        //更新用户最后登录时间
        dbUser.setLastLoginTime(new Timestamp(System.currentTimeMillis()));

        //dbAdmin没有问题
        System.out.println(dbUser.toString());

        usersMapper.updateById(dbUser);


        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);   // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
        map.put("msg", "登录正常");
        map.put("uid",dbUser.getId());
        return map;
    }


    /**
     * 主机注册
     */
    public Map<String, Object> hostRegister(Hosts hosts){
        // UUID.randomUUID()  返回内容：asd21321-ewrewrew213213-123213zsad-123asdasd这样的形态

        Integer uid = hosts.getUserId();
        Users users = usersMapper.selectById(uid);
        if (users == null) {
            Map<String, Object> map = new HashMap<>();
            map.put("code", 101);   // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
            map.put("msg", "该用户id不存在");
            return map;
        }
        if(users.getPID().equals(hosts.getPID())){
            this.hostsMapper.insert(hosts);
            Map<String, Object> map = new HashMap<>();
            map.put("code", 200);   // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
            map.put("msg", "新增成功");
            return map;
        }
        else{
            Map<String, Object> map = new HashMap<>();
            map.put("code", 100);   // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
            map.put("msg", "用户PID不正确,请重新输入");
            return map;
        }

    }


    /**
     * 返回用户PID,才能用
     */
    public Map<String, Object> getPID(Users user){
        Users userpid = usersMapper.getUser(user.getUserName());
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);   // 前端端分离时，前端人员会首先判断code值是否满足200，如果不是200，则提醒用户失败
        map.put("PID", userpid.getPID());
        return map;
    }
}
