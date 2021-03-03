package com.qinhailin.common.entity;

/**
 * 岗位实体
 * @author Yang.Yinghai
 * @date 2014-8-19下午4:20:12
 * @Copyright(c) Beijing Seeyon Software Co.,LTD
 */
public class Post extends OrgEntity {

    /** 类型ID */
    private Integer typeId;

    /**
     * 获取typeId
     * @return typeId
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 设置typeId
     * @param typeId typeId
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
