package com.whilebug.baselinecheck.pojo;

import java.io.Serializable;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 任务task与主机host之间的对应关系(Host2task)实体类
 *
 * @author 王沛然
 * @since 2021-06-24 10:01:20
 * @version 1.0
 */
@ApiModel(value = "Host2task",description = "任务task与主机host之间的对应关系")
public class Host2task implements Serializable {
    private static final long serialVersionUID = -26402033528791583L;
    /**
    * 任务task的主键task_id
    */
	@ApiModelProperty(name = "taskId",notes = "任务task的主键task_id",dataType = "Integer",required = true)
    private Integer taskId;
    /**
    * 主机host的主键host_id
    */
	@ApiModelProperty(name = "hostId",notes = "主机host的主键host_id",dataType = "Integer",required = true)
    private Integer hostId;
    /**
    * 标识当前主机host_id的任务task_id是否完成，0 未完成 1 进行中 2已完成
    */
	@ApiModelProperty(name = "status",notes = "标识当前主机host_id的任务task_id是否完成，0 未完成 1 进行中 2已完成",dataType = "Integer",required = false)
    private Integer status;

    /**
     * 获取当前任务分析结果的json字符串
     */
    @ApiModelProperty(name = "checkResult",notes = "任务检查结果的json字符串",dataType = "JSONObject",required = false)
    private JSONObject checkResult;

        
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
        
    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }
        
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public JSONObject getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(JSONObject checkResult) {
        this.checkResult = checkResult;
    }
}