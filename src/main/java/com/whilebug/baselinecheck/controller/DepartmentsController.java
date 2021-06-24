package com.whilebug.baselinecheck.controller;

import com.whilebug.baselinecheck.pojo.Departments;
import com.whilebug.baselinecheck.service.impl.DepartmentsServiceImpl;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 部门数据表(Departments)表控制层
 *
 * @author makejava
 * @since 2021-06-23 16:54:15
 * @version 1.0
 */
@RestController
@RequestMapping("/departments")
@Api(value = "部门数据表(Departments)管理",tags = "部门数据表(Departments)管理接口API")
@ApiResponses({
        @ApiResponse(code=400,message="请求参数不完整或者错误"),
        @ApiResponse(code=404,message="找不到页面"),
        @ApiResponse(code=405,message="请求方式不正确，比如后台接收是post，但前端请求的是get"),
        @ApiResponse(code=406,message="页面地址和接口名冲突"),
        @ApiResponse(code=415,message="请求格式不正确，前端可能没有把请求头修改为json，也可能前端请求的json对象没有转换为字符串"),
        @ApiResponse(code=500,message="后台服务逻辑错误")
})
public class DepartmentsController {
    /**
     * 服务对象
     */
    @Resource
    private DepartmentsServiceImpl departmentsServiceImpl;

    /**
     * 通过输入的部门名字name模糊查询多条部门信息
     * @param index  需要查询的页码
     * @param name  模糊查询的部门名字内容
     * @return 单条数据
     */
    @RequestMapping(value = "/selectForPage", method = RequestMethod.GET)
    @ApiOperation(value = "部门列表查询分页接口",notes = "部门列表查询分页接口",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "页码",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "name",value = "部门名称",paramType = "query",dataType = "String",required = false)
    })
    public Map<String, Object> selectForPage(@RequestParam(name = "page") int index, @RequestParam(name = "name")String name) {
        return this.departmentsServiceImpl.selectForPage(index, name);
    }
    
    /**
     * 查询所有部门数据
     * @return 返回所有数据
     */
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有部门数据接口",notes = "查询所有部门数据接口",httpMethod = "GET")
    public Map<String, Object> selectAll() {
        return this.departmentsServiceImpl.selectAll();
    }
    
    /**
     * 通过主键删除单条部门数据
     *
     * @param id 主键，指部门的id号，部门编号
     * @return 单条数据
     */
    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    @ApiOperation(value = "根据一个主键删除一条部门记录的接口",notes = "根据一个主键删除一条部门记录的接口",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "部门编号，主键",paramType = "query",dataType = "String",required = true),
    })
    public Map<String, Object> deleteById(@RequestParam("id") String id) {
        return this.departmentsServiceImpl.deleteById(id);
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键，指部门的id号，部门编号
     * @return 实例对象
     */
    @RequestMapping(value = "/selectById", method = RequestMethod.GET)
    @ApiOperation(value = "通过主键查询一个部门的接口",notes = "通过主键查询一个部门的接口",httpMethod = "GET")
    public Map<String, Object> selectById(Integer id) {
        return this.departmentsServiceImpl.selectById(id);
    }

    /**
     * 通过name模糊查询所有数量
     * @param name  模糊查询的内容
     * @return 单条数据
     */
    @RequestMapping(value = "/selectForCount", method = RequestMethod.GET)
    @ApiOperation(value = "模糊查询部门数量接口",notes = "模糊查询部门数量接口",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "部门名称",paramType = "query",dataType = "String",required = true)
    })
    public Map<String, Object> selectForCount(@RequestParam String name) {
        return this.departmentsServiceImpl.selectForCount(name);
    }


    /**
     * 通过主键更新单条数据
     *
     * @param departments 一个数据库对应的POJO数据对象
     * @return 单条数据
     */
    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    @ApiOperation(value = "通过主键更新一个部门的接口",notes = "通过主键更新一个部门的接口",httpMethod = "POST")
    public Map<String, Object> updateById(@RequestBody @ApiParam(name = "departments",value = "pojo模型",required = true) Departments departments) {
        return this.departmentsServiceImpl.updateById(departments);
    }
    
    /**
     * 通过一个pojo对象新增单条数据
     *
     * @param departments 一个数据库对应的POJO数据对象
     * @return 返回插入的主键id
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value = "根据完整记录新增一个部门的接口",notes = "根据完整记录新增一个部门的接口",httpMethod = "POST")
    public Map<String, Object> insert(@RequestBody @ApiParam(name = "departments",value = "pojo模型",required = true) Departments departments) {
        return this.departmentsServiceImpl.insert(departments);
    }

}