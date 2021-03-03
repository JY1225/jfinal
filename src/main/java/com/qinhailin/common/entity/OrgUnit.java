package com.qinhailin.common.entity;

import java.util.Map;

/**
 * @author Yang.Yinghai
 * @date 2014-8-19下午5:29:44
 * @Copyright(c) Beijing Seeyon Software Co.,LTD
 */
public class OrgUnit extends OrgEntity {

    /** 路径 */
    private String path;

    /** 简称 */
    private String shortName;

    /** 外文名称 */
    private String secondName;

    /** 是否是内部机构 */
    private Boolean isInternal;

    /** 是否是集团 */
    private Boolean isGroup;

    /** 只对type=account有效 */
    private Integer levelScope;

    /** 类型 */
    private String type;

    /** 扩展属性 */
    private Map<String, Object> properties;

    /** 上级单位Id，如果当前单位为集团则值为-1 */
    private Long superior;

    /** 上级单位名称 */
    private String superiorName;

    /**  */
    private String sortIdType;

    /** 是否可访问 */
    private Boolean isCanAccess;

    /** 父单位路径 */
    private String parentPath;

    /** 是否是集团根 */
    private Boolean group;

    /** 是否自定义登录背景 */
    private Boolean customLogin;

    /** 自定义登录背景图片 */
    private String customLoginUrl;

    /**
     * 获取path
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置path
     * @param path path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取shortName
     * @return shortName
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 设置shortName
     * @param shortName shortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * 获取secondName
     * @return secondName
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * 设置secondName
     * @param secondName secondName
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * 获取isInternal
     * @return isInternal
     */
    public Boolean getIsInternal() {
        return isInternal;
    }

    /**
     * 设置isInternal
     * @param isInternal isInternal
     */
    public void setIsInternal(Boolean isInternal) {
        this.isInternal = isInternal;
    }

    /**
     * 获取isGroup
     * @return isGroup
     */
    public Boolean getIsGroup() {
        return isGroup;
    }

    /**
     * 设置isGroup
     * @param isGroup isGroup
     */
    public void setIsGroup(Boolean isGroup) {
        this.isGroup = isGroup;
    }

    /**
     * 获取levelScope
     * @return levelScope
     */
    public Integer getLevelScope() {
        return levelScope;
    }

    /**
     * 设置levelScope
     * @param levelScope levelScope
     */
    public void setLevelScope(Integer levelScope) {
        this.levelScope = levelScope;
    }

    /**
     * 获取type
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type
     * @param type type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取properties
     * @return properties
     */
    public Map<String, Object> getProperties() {
        return properties;
    }

    /**
     * 设置properties
     * @param properties properties
     */
    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    /**
     * 获取superior
     * @return superior
     */
    public Long getSuperior() {
        return superior;
    }

    /**
     * 设置superior
     * @param superior superior
     */
    public void setSuperior(Long superior) {
        this.superior = superior;
    }

    /**
     * 获取superiorName
     * @return superiorName
     */
    public String getSuperiorName() {
        return superiorName;
    }

    /**
     * 设置superiorName
     * @param superiorName superiorName
     */
    public void setSuperiorName(String superiorName) {
        this.superiorName = superiorName;
    }

    /**
     * 获取sortIdType
     * @return sortIdType
     */
    public String getSortIdType() {
        return sortIdType;
    }

    /**
     * 设置sortIdType
     * @param sortIdType sortIdType
     */
    public void setSortIdType(String sortIdType) {
        this.sortIdType = sortIdType;
    }

    /**
     * 获取isCanAccess
     * @return isCanAccess
     */
    public Boolean getIsCanAccess() {
        return isCanAccess;
    }

    /**
     * 设置isCanAccess
     * @param isCanAccess isCanAccess
     */
    public void setIsCanAccess(Boolean isCanAccess) {
        this.isCanAccess = isCanAccess;
    }

    /**
     * 获取parentPath
     * @return parentPath
     */
    public String getParentPath() {
        return parentPath;
    }

    /**
     * 设置parentPath
     * @param parentPath parentPath
     */
    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }

    /**
     * 获取group
     * @return group
     */
    public Boolean getGroup() {
        return group;
    }

    /**
     * 设置group
     * @param group group
     */
    public void setGroup(Boolean group) {
        this.group = group;
    }

    /**
     * 获取customLogin
     * @return customLogin
     */
    public Boolean getCustomLogin() {
        return customLogin;
    }

    /**
     * 设置customLogin
     * @param customLogin customLogin
     */
    public void setCustomLogin(Boolean customLogin) {
        this.customLogin = customLogin;
    }

    /**
     * 获取customLoginUrl
     * @return customLoginUrl
     */
    public String getCustomLoginUrl() {
        return customLoginUrl;
    }

    /**
     * 设置customLoginUrl
     * @param customLoginUrl customLoginUrl
     */
    public void setCustomLoginUrl(String customLoginUrl) {
        this.customLoginUrl = customLoginUrl;
    }
}
