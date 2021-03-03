package com.qinhailin.common.entity;

/**
 * 职务级别实体
 * @author Yang.Yinghai
 * @date 2014-8-19下午4:34:42
 * @Copyright(c) Beijing Seeyon Software Co.,LTD
 */
public class Level extends OrgEntity {

    /** 职务级别序号 */
    private Integer levelId;

    /** 映射的集团职务级别号 */
    private Long groupLevelId;

    /**
     * 获取levelId
     * @return levelId
     */
    public Integer getLevelId() {
        return levelId;
    }

    /**
     * 设置levelId
     * @param levelId levelId
     */
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    /**
     * 获取groupLevelId
     * @return groupLevelId
     */
    public Long getGroupLevelId() {
        return groupLevelId;
    }

    /**
     * 设置groupLevelId
     * @param groupLevelId groupLevelId
     */
    public void setGroupLevelId(Long groupLevelId) {
        this.groupLevelId = groupLevelId;
    }
}
