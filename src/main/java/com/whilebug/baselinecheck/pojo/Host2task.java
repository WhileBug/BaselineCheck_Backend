package com.whilebug.baselinecheck.pojo;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 任务task与主机host之间的对应关系(Host2task)实体类
 *
 * @author makejava
 * @since 2021-06-23 16:54:24
 * @version 1.0
 */
@ApiModel(value = "Host2task",description = "任务task与主机host之间的对应关系")
public class Host2task implements Serializable {
    private static final long serialVersionUID = 175967111190881964L;
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

}