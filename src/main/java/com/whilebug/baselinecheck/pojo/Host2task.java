package com.whilebug.baselinecheck.pojo;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * (Host2task)实体类
 *
 * @author makejava
 * @since 2021-06-23 15:32:01
 * @version 1.0
 */
@ApiModel(value = "Host2task",description = "$tableInfo.comment")
public class Host2task implements Serializable {
    private static final long serialVersionUID = -40773828185630469L;
    
	@ApiModelProperty(name = "taskId",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer taskId;
    
	@ApiModelProperty(name = "hostId",notes = "${column.comment}",dataType = "Integer",required = true)
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