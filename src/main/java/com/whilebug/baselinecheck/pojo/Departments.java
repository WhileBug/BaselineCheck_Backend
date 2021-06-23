package com.whilebug.baselinecheck.pojo;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * (Departments)实体类
 *
 * @author makejava
 * @since 2021-06-23 15:18:11
 * @version 1.0
 */
@ApiModel(value = "Departments",description = "$tableInfo.comment")
public class Departments implements Serializable {
    private static final long serialVersionUID = 494775256790458493L;
    
	@ApiModelProperty(name = "departmentId",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer departmentId;
    
	@ApiModelProperty(name = "departmentName",notes = "${column.comment}",dataType = "String",required = true)
    private String departmentName;
    
	@ApiModelProperty(name = "description",notes = "${column.comment}",dataType = "String",required = true)
    private String description;
    
	@ApiModelProperty(name = "leaderId",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer leaderId;

        
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
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