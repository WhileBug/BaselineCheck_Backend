package com.whilebug.baselinecheck.pojo;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * (Hosts)实体类
 *
 * @author makejava
 * @since 2021-06-23 15:32:11
 * @version 1.0
 */
@ApiModel(value = "Hosts",description = "$tableInfo.comment")
public class Hosts implements Serializable {
    private static final long serialVersionUID = -28514023216286743L;
    
	@ApiModelProperty(name = "hostId",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer hostId;
    
	@ApiModelProperty(name = "hostName",notes = "${column.comment}",dataType = "String",required = true)
    private String hostName;
    
	@ApiModelProperty(name = "hostIp",notes = "${column.comment}",dataType = "String",required = true)
    private String hostIp;
    
	@ApiModelProperty(name = "hostMac",notes = "${column.comment}",dataType = "String",required = true)
    private String hostMac;
    
	@ApiModelProperty(name = "hostUserName",notes = "${column.comment}",dataType = "String",required = true)
    private String hostUserName;
    
	@ApiModelProperty(name = "hostUserPassword",notes = "${column.comment}",dataType = "String",required = true)
    private String hostUserPassword;
    
	@ApiModelProperty(name = "hostUserPort",notes = "${column.comment}",dataType = "String",required = true)
    private String hostUserPort;
    
	@ApiModelProperty(name = "hostUserProtocol",notes = "${column.comment}",dataType = "String",required = true)
    private String hostUserProtocol;
    
	@ApiModelProperty(name = "createTime",notes = "${column.comment}",dataType = "Date",required = true)
    private Date createTime;
    
	@ApiModelProperty(name = "lastUpdateTime",notes = "${column.comment}",dataType = "Date",required = true)
    private Date lastUpdateTime;
    
	@ApiModelProperty(name = "userId",notes = "${column.comment}",dataType = "Integer",required = true)
    private Integer userId;

        
    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }
        
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
        
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }
        
    public String getHostMac() {
        return hostMac;
    }

    public void setHostMac(String hostMac) {
        this.hostMac = hostMac;
    }
        
    public String getHostUserName() {
        return hostUserName;
    }

    public void setHostUserName(String hostUserName) {
        this.hostUserName = hostUserName;
    }
        
    public String getHostUserPassword() {
        return hostUserPassword;
    }

    public void setHostUserPassword(String hostUserPassword) {
        this.hostUserPassword = hostUserPassword;
    }
        
    public String getHostUserPort() {
        return hostUserPort;
    }

    public void setHostUserPort(String hostUserPort) {
        this.hostUserPort = hostUserPort;
    }
        
    public String getHostUserProtocol() {
        return hostUserProtocol;
    }

    public void setHostUserProtocol(String hostUserProtocol) {
        this.hostUserProtocol = hostUserProtocol;
    }
        
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
        
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
        
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}