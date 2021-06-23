package com.whilebug.baselinecheck.mapper;

import com.whilebug.baselinecheck.pojo.Host2task;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 任务task与主机host之间的对应关系(Host2task)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-23 16:54:24
 * @version 1.0
 */
public interface Host2taskMapper {

    /**
     * 查询所有数据
     * @return  返回所有数据
     */
    List<Host2task> selectAll();

    /**
     * 通过ID查询单条数据
     *
     * @param taskId 主键
     * @return 实例对象
     */
    Host2task selectById(@Param("taskId") Integer taskId);

    /**
     * 根据模糊条件查询总个数
     *
     * @return 返回查询到的总个数
     */
    int selectForCount(String name);

    /**
     * 通过实体作为筛选条件查询
     * 
     * @param index 查询起始位置
     * @param name  查询条件
     * @return 对象列表
     */
    List<Host2task> selectForPage(@Param("index") int index, @Param("name")String name);

    /**
     * 新增数据
     *
     * @param host2task 实例对象
     */
    void insert(Host2task host2task);

    /**
     * 修改数据
     *
     * @param host2task 实例对象
     * @return 影响行数
     */
    int updateById(Host2task host2task);

    /**
     * 通过主键删除数据
     *
     * @param taskId 主键
     * @return 影响行数
     */
    int deleteById(@Param("taskId") String taskId);

    /**
     * 通过ID查询单条数据
     *
     * @param hostId 主键
     * @return 实例对象
     */
    List<Host2task> selectByHostId(@Param("hostId") Integer hostId);
}