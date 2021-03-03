package com.qinhailin.common.entity;

import java.util.Date;

/**
 * 组织机构实体对象基类
 * @author Yang.Yinghai
 * @date 2014-8-19下午4:23:37
 * @Copyright(c) Beijing Seeyon Software Co.,LTD
 */
public class OrgEntity {

    /** 所属单位ID */
    private Long orgAccountId;

    /** 实体对象ID */
    private Long id;

    /** 实体对象名称 */
    private String name;

    /** 实体对象代码 */
    private String code;

    /** 创建时间 */
    private Date createTime;

    /** 更改时间 */
    private Date updateTime;

    /** 排序号 */
    private Long sortId;

    /** 是否被删除 */
    private Boolean isDeleted;

    /** 是否启用 */
    private Boolean enabled;

    /** 状态 */
    private Integer status;

    /** 描述信息 */
    private String description;

    /** 实体类型 */
    private String entityType;

    /** 是否合法 */
    private Boolean valid;

    /**
     * 获取orgAccountId
     * @return orgAccountId
     */
    public Long getOrgAccountId() {
        return orgAccountId;
    }

    /**
     * 设置orgAccountId
     * @param orgAccountId orgAccountId
     */
    public void setOrgAccountId(Long orgAccountId) {
        this.orgAccountId = orgAccountId;
    }

    /**
     * 获取id
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取code
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code
     * @param code code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取createTime
     * @return createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime
     * @param createTime createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取updateTime
     * @return updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置updateTime
     * @param updateTime updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取sortId
     * @return sortId
     */
    public Long getSortId() {
        return sortId;
    }

    /**
     * 设置sortId
     * @param sortId sortId
     */
    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    /**
     * 获取isDeleted
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置isDeleted
     * @param isDeleted isDeleted
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取enabled
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 设置enabled
     * @param enabled enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取status
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置status
     * @param status status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取entityType
     * @return entityType
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * 设置entityType
     * @param entityType entityType
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * 获取valid
     * @return valid
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * 设置valid
     * @param valid valid
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}
