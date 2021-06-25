package com.whilebug.baselinecheck.controller;

import com.whilebug.baselinecheck.pojo.Host2task;
import com.whilebug.baselinecheck.service.impl.Host2taskServiceImpl;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 任务task与主机host之间的对应关系(Host2task)表控制层
 *
 * @author makejava
 * @since 2021-06-23 16:54:23
 * @version 1.0
 */
@RestController
@RequestMapping("/host2task")
@Api(value = "任务task与主机host之间的对应关系(Host2task)管理",tags = "任务task与主机host之间的对应关系(Host2task)管理接口API")
@ApiResponses({
        @ApiResponse(code=400,message="请求参数不完整或者错误"),
        @ApiResponse(code=404,message="找不到页面"),
        @ApiResponse(code=405,message="请求方式不正确，比如后台接收是post，但前端请求的是get"),
        @ApiResponse(code=406,message="页面地址和接口名冲突"),
        @ApiResponse(code=415,message="请求格式不正确，前端可能没有把请求头修改为json，也可能前端请求的json对象没有转换为字符串"),
        @ApiResponse(code=500,message="后台服务逻辑错误")
})
public class Host2taskController {
    /**
     * 服务对象
     */
    @Resource
    private Host2taskServiceImpl host2taskServiceImpl;

    /**
     * 通过主键模糊查询多条数据
     * @param index  需要查询的页码
     * @param name  模糊查询的内容
     * @return 单条数据
     */
    @RequestMapping(value = "/selectForPage", method = RequestMethod.GET)
    @ApiOperation(value = "列表查询分页接口（已废弃）",notes = "列表查询分页接口（已废弃）",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "页码",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "name",value = "**名称",paramType = "query",dataType = "String",required = false)
    })
    public Map<String, Object> selectForPage(@RequestParam(name = "page") int index, String name) {
        return this.host2taskServiceImpl.selectForPage(index, name);
    }
    
    /**
     * 查询所有任务主机映射关系数据
     * @return 返回所有数据
     */
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有任务主机映射关系数据接口",notes = "查询所有任务主机映射关系数据接口",httpMethod = "GET")
    public Map<String, Object> selectAll() {
        return this.host2taskServiceImpl.selectAll();
    }
    
    /**
     * 通过主键删除单条任务主机映射关系数据
     *
     * @param id 主键，任务编号
     * @return 单条数据
     */
    @RequestMapping(value = "/deleteByTaskId", method = RequestMethod.POST)
    @ApiOperation(value = "根据一个主键删除一条任务主机映射关系记录的接口",notes = "根据一个主键删除一条任务主机映射关系记录的接口",httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "taskId",value = "任务编号主键",paramType = "query",dataType = "String",required = true),
    })
    public Map<String, Object> deleteById(@RequestParam("id") String id) {
        return this.host2taskServiceImpl.deleteById(id);
    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param taskId 主键，任务编号
     * @return 实例对象
     */
    @RequestMapping(value = "/selectByTaskId", method = RequestMethod.GET)
    @ApiOperation(value = "通过任务编号主键查询一个任务主机映射关系的接口",notes = "通过任务编号主键查询一个任务主机映射关系的接口",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "taskId",value = "任务编号主键",paramType = "query",dataType = "String",required = true),
    })
    public Map<String, Object> selectById(Integer taskId) {
        return this.host2taskServiceImpl.selectById(taskId);
    }
    
    /**
     * 通过主键更新单条数据
     *
     * @param host2task 一个数据库对应的POJO数据对象
     * @return 单条数据
     */
    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    @ApiOperation(value = "通过主键更新一个任务主机映射关系的接口",notes = "通过主键更新一个任务主机映射关系的接口",httpMethod = "POST")
    public Map<String, Object> updateById(@RequestBody @ApiParam(name = "host2task",value = "pojo模型",required = true) Host2task host2task) {
        return this.host2taskServiceImpl.updateById(host2task);
    }
    
    /**
     * 通过一个任务主机映射关系pojo对象新增单条数据
     *
     * @param host2task 一个数据库对应的任务主机映射关系POJO数据对象
     * @return 返回插入的主键id
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value = "根据完整记录新增一个任务主机映射关系的接口",notes = "根据完整记录新增一个任务主机映射关系的接口",httpMethod = "POST")
    public Map<String, Object> insert(@RequestBody @ApiParam(name = "host2task",value = "pojo模型",required = true) Host2task host2task) {
        return this.host2taskServiceImpl.insert(host2task);
    }

    /**
     * 通过hostID，主机编号查询单条数据
     *
     * @param hostId 主键,主机编号
     * @return 实例对象
     */
    @RequestMapping(value = "/selectByHostId", method = RequestMethod.GET)
    @ApiOperation(value = "通过主机编号主键查询一个任务主机映射关系的接口",notes = "通过主机编号主键查询一个任务主机映射关系的接口",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "hostId",value = "主机编号主键",paramType = "query",dataType = "String",required = true),
    })
    public Map<String, Object> selectByHostId(Integer hostId) {
        return this.host2taskServiceImpl.selectByHostId(hostId);
    }

    @RequestMapping(value = "/selectTaskByHostId", method = RequestMethod.GET)
    @ApiOperation(value = "通过主机编号主键查询主机所有未完成任务的接口",notes = "通过主机编号主键查询主机所有未完成任务的接口",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "hostId",value = "主机编号主键",paramType = "query",dataType = "String",required = true),
    })
    public Map<String, Object> selectTaskByHostId(Integer hostId) {
        return this.host2taskServiceImpl.selectTaskByHostId(hostId);
    }

    @RequestMapping(value = "/finishById", method = RequestMethod.POST)
    @ApiOperation(value = "通过任务编号和主机编号主键更新一个主机所有未完成任务的接口",notes = "通过任务编号和主机编号主键更新一个主机所有未完成任务的接口",httpMethod = "POST")
    public Map<String, Object> finishById(@RequestBody @ApiParam(name = "host2task",value = "pojo模型",required = true) Host2task host2task){//, @ApiParam(name = "analysisResult",required = false) String analysisResult) {
        return this.host2taskServiceImpl.finishById(host2task);
    }

    @RequestMapping(value = "/getCheckResult", method = RequestMethod.GET)
    @ApiOperation(value = "获取检查分析结果的接口",notes = "获取检查分析结果的接口",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "hostId",value = "主机编号主键",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "taskId",value = "任务编号主键",paramType = "query",dataType = "String",required = true)
    })
    public Map<String, Object> getCheckResult(String hostId, String taskId) {
        return this.host2taskServiceImpl.getCheckResult(hostId, taskId);
    }

}