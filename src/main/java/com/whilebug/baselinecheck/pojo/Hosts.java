package com.whilebug.baselinecheck.pojo;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 主机数据表(Hosts)实体类
 *
 * @author 王沛然
 * @since 2021-06-23 16:54:30
 * @version 1.0
 */
@ApiModel(value = "Hosts",description = "主机数据表")
public class Hosts implements Serializable {
    private static final long serialVersionUID = -20796224218000932L;
    /**
     * 用户唯一标识，验证码
     */
    @ApiModelProperty(name = "pid",notes = "用户唯一标识",dataType = "String",required = true)
    private String pid;
    /**
    * 主机host的主键host_id
    */
	@ApiModelProperty(name = "id",notes = "主机host的主键host_id",dataType = "Integer",required = true)
    private Integer id;
    /**
    * 主机host的主机名host_name
    */
	@ApiModelProperty(name = "hostName",notes = "主机host的主机名host_name",dataType = "String",required = false)
    private String hostName;
    /**
    * 主机host的ip地址
    */
	@ApiModelProperty(name = "hostIp",notes = "主机host的ip地址",dataType = "String",required = true)
    private String hostIp;
    /**
    * 主机host的mac地址host_mac
    */
	@ApiModelProperty(name = "hostMac",notes = "主机host的mac地址host_mac",dataType = "String",required = false)
    private String hostMac;
    /**
    * 主机host的用户名host_user_name，一般为root
    */
	@ApiModelProperty(name = "hostUserName",notes = "主机host的用户名host_user_name，一般为root",dataType = "String",required = false)
    private String hostUserName;
    /**
    * 主机host的用户的密码host_user_password
    */
	@ApiModelProperty(name = "hostUserPassword",notes = "主机host的用户的密码host_user_password",dataType = "String",required = false)
    private String hostUserPassword;
    /**
    * 主机host的打开端口host_user_protocol
    */
	@ApiModelProperty(name = "hostUserPort",notes = "主机host的打开端口host_user_protocol",dataType = "String",required = false)
    private String hostUserPort;
    /**
    * 主机host的协议host_user_protocol
    */
	@ApiModelProperty(name = "hostUserProtocol",notes = "主机host的协议host_user_protocol",dataType = "String",required = false)
    private String hostUserProtocol;
    /**
    * 主机host的创建时间create_time
    */
	@ApiModelProperty(name = "createTime",notes = "主机host的创建时间create_time",dataType = "Date",required = false)
    private Date createTime;
    /**
    * 主机host的最后更新时间last_update_time
    */
	@ApiModelProperty(name = "lastUpdateTime",notes = "主机host的最后更新时间last_update_time",dataType = "Date",required = false)
    private Date lastUpdateTime;
    /**
    * 主机host的拥有者id，user_id，同时是users数据表的主键user_id
    */
	@ApiModelProperty(name = "userId",notes = "主机host的拥有者id，user_id，同时是users数据表的主键user_id",dataType = "Integer",required = true)
    private Integer userId;


    public String getPID() {
        return pid;
    }

    public void setPID(String PID) {
        this.pid = PID;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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