package com.qinhailin.common.entity;

import java.util.List;

/**
 * 部门实体
 * @author Yang.Yinghai
 * @date 2014-8-19下午5:15:14
 * @Copyright(c) Beijing Seeyon Software Co.,LTD
 */
public class Department extends OrgUnit {

    /** 部门管理员 */
    private String depManager;

    /** 部门主管 */
    private String depAdmin;

    /** 部门岗位 */
    private List<Post> posts;

    /**
     * 获取depManager
     * @return depManager
     */
    public String getDepManager() {
        return depManager;
    }

    /**
     * 设置depManager
     * @param depManager depManager
     */
    public void setDepManager(String depManager) {
        this.depManager = depManager;
    }

    /**
     * 获取depAdmin
     * @return depAdmin
     */
    public String getDepAdmin() {
        return depAdmin;
    }

    /**
     * 设置depAdmin
     * @param depAdmin depAdmin
     */
    public void setDepAdmin(String depAdmin) {
        this.depAdmin = depAdmin;
    }

    /**
     * 获取posts
     * @return posts
     */
    public List<Post> getPosts() {
        return posts;
    }

    /**
     * 设置posts
     * @param posts posts
     */
    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
