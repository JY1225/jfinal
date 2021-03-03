package com.qinhailin.common.entity;

/**
 * 应用枚举
 * @author Yang.Yinghai
 * @date 2014-8-20下午1:27:02
 * @Copyright(c) Beijing Seeyon Software Co.,LTD
 */
public enum ApplicationCategoryEnum{
    /** 全局 */
    global(0),
    /** 协同应用 */
    collaboration(1),
    /** 表单 */
    form(2),
    /** 知识管理 */
    doc(3),
    /** 公文 */
    edoc(4),
    /** 计划 */
    plan(5),
    /** 会议 */
    meeting(6),
    /** 公告 */
    bulletin(7),
    /** 新闻 */
    news(8),
    /** 讨论 */
    bbs(9),
    /** 调查 */
    inquiry(10),
    /** 日程事件 */
    calendar(11),
    /** 邮件 */
    mail(12),
    /** 组织模型 */
    organization(13),
    /** 项目 */
    project(14),
    /** 关联人员 */
    relateMember(15),
    /** 交换 */
    exchange(16),
    /** 人力资源 */
    hr(17),
    /** 博客 */
    blog(18),
    /** 发文 */
    edocSend(19),
    /** 收文 */
    edocRec(20),
    /** 签报 */
    edocSign(21),
    /** 待发送公文 */
    exSend(22),
    /** 待签收公文 */
    exSign(23),
    /** 待登记公文 */
    edocRegister(24),
    /** 在线交流 */
    communication(25),
    /** 综合办公 */
    office(26),
    /** 代理设置 */
    agent(27),
    /** 密码修改 */
    modifyPassword(28),
    /** 会议室 */
    meetingroom(29),
    /** 任务管理 */
    taskManage(30),
    /** 留言板 */
    guestbook(31),
    /** 信息报 送 */
    info(32),
    /** 信息报送统计 */
    infoStat(33),
    /** 收文分发 */
    edocRecDistribute(34),
    /** 公示板 */
    notice(35),
    /** 签到 */
    attendance(36);

    /** 标识 用于数据库存储 */
    private int key;

    /**
     * @param key
     */
    ApplicationCategoryEnum(int key) {
        this.key = key;
    }

    /**
     * 根据key得到枚举类型
     * @param key
     * @return
     */
    public static ApplicationCategoryEnum valueOf(int key) {
        ApplicationCategoryEnum[] enums = ApplicationCategoryEnum.values();
        if(enums != null) {
            for(ApplicationCategoryEnum enum1 : enums) {
                if(enum1.getKey() == key) {
                    return enum1;
                }
            }
        }
        return null;
    }

    /**
     * 获取key
     * @return key
     */
    public int getKey() {
        return key;
    }

    /**
     * 设置key
     * @param key key
     */
    public void setKey(int key) {
        this.key = key;
    }
}
