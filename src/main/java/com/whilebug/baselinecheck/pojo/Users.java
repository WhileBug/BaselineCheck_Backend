package com.whilebug.baselinecheck.pojo;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户数据表(Users)实体类
 *
 * @author makejava
 * @since 2021-06-23 16:54:42
 * @version 1.0
 */
@ApiModel(value = "Users",description = "用户数据表")
public class Users implements Serializable {
    private static final long serialVersionUID = -82001230880895871L;
    
	@ApiModelProperty(name = "id",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer id;
    /**
    * 密码
    */
	@ApiModelProperty(name = "userPasswrod",notes = "密码",dataType = "String",required = true)
    private String userPasswrod;
    /**
    * 用户名
    */
	@ApiModelProperty(name = "userName",notes = "用户名",dataType = "String",required = true)
    private String userName;
    
	@ApiModelProperty(name = "userStatus",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer userStatus;
    
	@ApiModelProperty(name = "userPhone",notes = "${column.comment}",dataType = "String",required = true)
    private String userPhone;
    
	@ApiModelProperty(name = "userEmail",notes = "${column.comment}",dataType = "String",required = true)
    private String userEmail;
    
	@ApiModelProperty(name = "userImgAddr",notes = "${column.comment}",dataType = "String",required = true)
    private String userImgAddr;
    
	@ApiModelProperty(name = "lastLoginTime",notes = "${column.comment}",dataType = "Date",required = true)
    private Date lastLoginTime;
    
	@ApiModelProperty(name = "registerTime",notes = "${column.comment}",dataType = "Date",required = true)
    private Date registerTime;
    
	@ApiModelProperty(name = "userAuth",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer userAuth;
    
	@ApiModelProperty(name = "departmentId",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer departmentId;

        
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
        
    public String getUserPasswrod() {
        return userPasswrod;
    }

    public void setUserPasswrod(String userPasswrod) {
        this.userPasswrod = userPasswrod;
    }
        
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
        
    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
        
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
        
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
        
    public String getUserImgAddr() {
        return userImgAddr;
    }

    public void setUserImgAddr(String userImgAddr) {
        this.userImgAddr = userImgAddr;
    }
        
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
        
    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
        
    public Integer getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(Integer userAuth) {
        this.userAuth = userAuth;
    }
        
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

}