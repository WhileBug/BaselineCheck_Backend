package com.whilebug.baselinecheck.service;

import com.whilebug.baselinecheck.pojo.Host2task;

import java.util.Map;

/**
 * 任务task与主机host之间的对应关系(Host2task)表服务接口类
 *
 * @author makejava
 * @since 2021-06-23 16:54:22
 * @version 1.0
 */
public interface Host2taskService {
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
     * @param taskId 主键
     * @return 实例对象
     */
    Map<String, Object> selectById(Integer taskId);

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
     * @param host2task 实例对象
     * @return 实例对象
     */
    Map<String, Object> insert(Host2task host2task);

    /**
     * 通过ID查询单条数据
     *
     * @param host2task 实例对象
     * @return 实例对象
     */
    Map<String, Object> updateById(Host2task host2task);

    /**
     * 通过主键删除数据
     *
     * @param taskId 主键
     * @return 是否成功
     */
    Map<String, Object> deleteById(String taskId);

    /**
     * 通过hostID查询单条数据
     *
     * @param hostId 主键
     * @return 实例对象
     */
    Map<String, Object> selectTaskByHostId(Integer hostId);

    /**
     * 通过ID查询单条数据
     *
     * @param host2task 实例对象
     * @return 实例对象
     */
    Map<String, Object> finishById(Host2task host2task);
}