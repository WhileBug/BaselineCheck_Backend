package com.whilebug.baselinecheck.service;

import com.whilebug.baselinecheck.pojo.Users;

import java.util.Map;

/**
 * 用户数据表(Users)表服务接口类
 *
 * @author 王沛然
 * @since 2021-06-23 16:54:40
 * @version 1.0
 */
public interface UsersService {
    /**
     * 根据模糊条件查询总个数
     *
     * @param name 查询条件
     * @return 返回查询到的总个数
     */
    Map<String, Object> selectForCount(String name);

    /**
     * 查询所有数据
     * 
     * @return  返回所有数据
     */
    Map<String, Object> selectAll();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Map<String, Object> selectById(Integer id);

    /**
     * 查询分页数据
     *
     * @param index 查询起始位置
     * @param name 查询条件
     * @return 对象列表
     */
    Map<String, Object> selectForPage(int index, String name);

    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    Map<String, Object> insert(Users users);

    /**
     * 通过ID查询单条数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    Map<String, Object> updateById(Users users);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    Map<String, Object> deleteById(String id);

    /**
     * 通过departmentId查询单条数据
     *
     * @param departmentId 主键
     * @return 实例对象
     */
    Map<String, Object> selectByDepartmentId(Integer departmentId);
}