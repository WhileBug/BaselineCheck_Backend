package com.whilebug.baselinecheck.pojo;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 部门数据表(Departments)实体类
 *
 * @author 王沛然
 * @since 2021-06-23 16:54:17
 * @version 1.0
 */
@ApiModel(value = "Departments",description = "部门数据表")
public class Departments implements Serializable {
    private static final long serialVersionUID = -85324857520485149L;
    /**
    * 部门的id，是部门表的主键
    */
	@ApiModelProperty(name = "id",notes = "部门的id，是部门表的主键",dataType = "Integer",required = true)
    private Integer id;
    /**
    * 部门名称
    */
	@ApiModelProperty(name = "departmentName",notes = "部门名称",dataType = "String",required = true)
    private String departmentName;
    /**
    * 部门的描述
    */
	@ApiModelProperty(name = "description",notes = "部门的描述",dataType = "String",required = true)
    private String description;
    /**
    * 部门领导人的user_id，与users表中的主键user_id对应
    */
	@ApiModelProperty(name = "leaderId",notes = "部门领导人的user_id，与users表中的主键user_id对应",dataType = "Integer",required = true)
    private Integer leaderId;

        
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
        
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
        
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
        
    public Integer getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

}