package com.whilebug.baselinecheck.pojo;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 扫描任务数据表(Tasks)实体类
 *
 * @author 王沛然
 * @since 2021-06-23 16:54:36
 * @version 1.0
 */
@ApiModel(value = "Tasks",description = "扫描任务数据表")
public class Tasks implements Serializable {
    private static final long serialVersionUID = 618554911906254014L;
    /**
    * 任务id
    */
	@ApiModelProperty(name = "id",notes = "任务id",dataType = "Integer",required = true)
    private Integer id;
    /**
    * 任务名称
    */
	@ApiModelProperty(name = "taskName",notes = "任务名称",dataType = "String",required = true)
    private String taskName;
    /**
    * 任务描述
    */
	@ApiModelProperty(name = "description",notes = "任务描述",dataType = "String",required = true)
    private String description;
    /**
    * 发布任务的用户id
    */
	@ApiModelProperty(name = "taskUserId",notes = "发布任务的用户id",dataType = "Integer",required = true)
    private Integer taskUserId;
    /**
    * 是否进行基线检查，1表示检查 0表示不检查
    */
	@ApiModelProperty(name = "baselineCheck",notes = "是否进行基线检查，1表示检查 0表示不检查",dataType = "Integer",required = true)
    private Integer baselineCheck;
    /**
    * 是否检查系统信息，1表示检查 0表示不检查
    */
	@ApiModelProperty(name = "systemInfo",notes = "是否检查系统信息，1表示检查 0表示不检查",dataType = "Integer",required = true)
    private Integer systemInfo;
    /**
    * 是否检查自启动项，1表示检查 0表示不检查
    */
	@ApiModelProperty(name = "autorun",notes = "是否检查自启动项，1表示检查 0表示不检查",dataType = "Integer",required = true)
    private Integer autorun;
    /**
    * 是否检查补丁项，1表示检查 0表示不检查
    */
	@ApiModelProperty(name = "patch",notes = "是否检查补丁项，1表示检查 0表示不检查",dataType = "Integer",required = true)
    private Integer patch;
    /**
    * 是否检查打开的端口，1表示检查 0表示不检查
    */
	@ApiModelProperty(name = "ports",notes = "是否检查打开的端口，1表示检查 0表示不检查",dataType = "Integer",required = true)
    private Integer ports;
    /**
    * 是否检查软件信息，1表示检查 0表示不检查
    */
	@ApiModelProperty(name = "softwareInfo",notes = "是否检查软件信息，1表示检查 0表示不检查",dataType = "Integer",required = true)
    private Integer softwareInfo;

        
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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