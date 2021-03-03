package com.qinhailin.common.entity;

import java.util.List;

/**
 * 单位实体
 * @author Yang.Yinghai
 * @date 2014-8-19下午4:39:35
 * @Copyright(c) Beijing Seeyon Software Co.,LTD
 */
public class Account extends OrgUnit {

    /** 是否可访问或不可访问的单位id列表 */
    private List<Long> accessIds;

    /** 机构访问分级方位类型默认三个全选中 */
    private List<Integer> accessScopeLevels;

    /** 外部模块需要子单位的这个属性，只提供get方法 */
    private List<Account> childrenAccounts;

    /**
     * 获取accessIds
     * @return accessIds
     */
    public List<Long> getAccessIds() {
        return accessIds;
    }

    /**
     * 设置accessIds
     * @param accessIds accessIds
     */
    public void setAccessIds(List<Long> accessIds) {
        this.accessIds = accessIds;
    }

    /**
     * 获取accessScopeLevels
     * @return accessScopeLevels
     */
    public List<Integer> getAccessScopeLevels() {
        return accessScopeLevels;
    }

    /**
     * 设置accessScopeLevels
     * @param accessScopeLevels accessScopeLevels
     */
    public void setAccessScopeLevels(List<Integer> accessScopeLevels) {
        this.accessScopeLevels = accessScopeLevels;
    }

    /**
     * 获取childrenAccounts
     * @return childrenAccounts
     */
    public List<Account> getChildrenAccounts() {
        return childrenAccounts;
    }

    /**
     * 设置childrenAccounts
     * @param childrenAccounts childrenAccounts
     */
    public void setChildrenAccounts(List<Account> childrenAccounts) {
        this.childrenAccounts = childrenAccounts;
    }
}
