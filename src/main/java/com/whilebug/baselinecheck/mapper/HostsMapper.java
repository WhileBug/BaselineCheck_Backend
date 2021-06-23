package com.whilebug.baselinecheck.mapper;

import com.whilebug.baselinecheck.pojo.Hosts;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 主机数据表(Hosts)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-23 16:54:29
 * @version 1.0
 */
public interface HostsMapper {

    /**
     * 查询所有数据
     * @return  返回所有数据
     */
    List<Hosts> selectAll();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Hosts selectById(@Param("id") Integer id);

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
    List<Hosts> selectForPage(@Param("index") int index, @Param("name")String name);

    /**
     * 新增数据
     *
     * @param hosts 实例对象
     */
    void insert(Hosts hosts);

    /**
     * 修改数据
     *
     * @param hosts 实例对象
     * @return 影响行数
     */
    int updateById(Hosts hosts);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(@Param("id") String id);

}