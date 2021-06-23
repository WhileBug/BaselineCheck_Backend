package com.whilebug.baselinecheck.pojo;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * (Tasks)实体类
 *
 * @author makejava
 * @since 2021-06-23 15:32:21
 * @version 1.0
 */
@ApiModel(value = "Tasks",description = "$tableInfo.comment")
public class Tasks implements Serializable {
    private static final long serialVersionUID = 746757653308997559L;
    
	@ApiModelProperty(name = "taskId",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer taskId;
    
	@ApiModelProperty(name = "taskName",notes = "${column.comment}",dataType = "String",required = true)
    private String taskName;
    
	@ApiModelProperty(name = "description",notes = "${column.comment}",dataType = "String",required = true)
    private String description;
    
	@ApiModelProperty(name = "taskUserId",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer taskUserId;
    
	@ApiModelProperty(name = "baselineCheck",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer baselineCheck;
    
	@ApiModelProperty(name = "systemInfo",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer systemInfo;
    
	@ApiModelProperty(name = "autorun",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer autorun;
    
	@ApiModelProperty(name = "patch",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer patch;
    
	@ApiModelProperty(name = "ports",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer ports;
    
	@ApiModelProperty(name = "softwareInfo",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer softwareInfo;

        
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
        
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
        
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
        
    public Integer getTaskUserId() {
        return taskUserId;
    }

    public void setTaskUserId(Integer taskUserId) {
        this.taskUserId = taskUserId;
    }
        
    public Integer getBaselineCheck() {
        return baselineCheck;
    }

    public void setBaselineCheck(Integer baselineCheck) {
        this.baselineCheck = baselineCheck;
    }
        
    public Integer getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(Integer systemInfo) {
        this.systemInfo = systemInfo;
    }
        
    public Integer getAutorun() {
        return autorun;
    }

    public void setAutorun(Integer autorun) {
        this.autorun = autorun;
    }
        
    public Integer getPatch() {
        return patch;
    }

    public void setPatch(Integer patch) {
        this.patch = patch;
    }
        
    public Integer getPorts() {
        return ports;
    }

    public void setPorts(Integer ports) {
        this.ports = ports;
    }
        
    public Integer getSoftwareInfo() {
        return softwareInfo;
    }

    public void setSoftwareInfo(Integer softwareInfo) {
        this.softwareInfo = softwareInfo;
    }

}