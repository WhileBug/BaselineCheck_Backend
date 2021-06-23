package com.whilebug.baselinecheck.mapper;

import com.whilebug.baselinecheck.pojo.Users;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 用户数据表(Users)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-23 16:54:42
 * @version 1.0
 */
public interface UsersMapper {

    /**
     * 查询所有数据
     * @return  返回所有数据
     */
    List<Users> selectAll();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Users selectById(@Param("id") Integer id);

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
    List<Users> selectForPage(@Param("index") int index, @Param("name")String name);

    /**
     * 新增数据
     *
     * @param users 实例对象
     */
    void insert(Users users);

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 影响行数
     */
    int updateById(Users users);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(@Param("id") String id);

    /**
     * 通过部门号departmentID查询单条数据
     *
     * @param departmentId 主键
     * @return 实例对象
     */
    List<Users> selectByDepartmentId(@Param("departmentId") Integer departmentId);
}