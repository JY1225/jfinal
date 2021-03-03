package com.qinhailin.common.entity;

import java.util.Date;
import java.util.Map;

/**
 * @author Yang.Yinghai
 * @date 2014-8-20下午12:52:45
 * @Copyright(c) Beijing Seeyon Software Co.,LTD
 */
public class Event {

    /** 主键ID */
    private Long id;

    /** 提醒时间 */
    private Integer alarmDate;

    /** 提醒的标识 */
    private Boolean alarmFlag;

    /** 完成率 */
    private Integer completeRate;

    /** 提前提醒时间 */
    private Integer beforendAlarm;

    /**  */
    private Boolean attachmentsFlag;

    /** 创建时间 */
    private Date createDate;

    /** 创建者 */
    private Long createUserId;

    /**  */
    private Long periodicalId;

    /** 开始时间 */
    private Date beginDate;

    /** 结束时间 */
    private Date endDate;

    /** 事件类型 */
    private Integer eventType;

    /** 共享类型 */
    private Integer shareType;

    /** 重要程度 */
    private Integer signifyType;

    /** 事件完成类型 */
    private Integer states;

    /** 标题 */
    private String subject;

    /** 共享对象name */
    private String shareTarget;

    /** 更新时间 */
    private Date updateDate;

    /** 工作类型 */
    private String workType;

    /** 事件当前类型标识 */
    private Integer eventflag;

    /**  */
    private String tranMemberIds;

    /**  */
    private String tranMemberName;

    /**  */
    private String receiveMemberId;

    /**  */
    private String receiveMemberName;

    /** 其他模块转日程的类型 */
    private Integer fromType;

    /** 其他模块转日程的id */
    private Long fromId;

    /**  */
    private Integer periodicalStyle;

    /**  */
    private Integer calEventType;

    /**  */
    private Integer isEntrust;

    /**  */
    private Long periodicalChildId;

    /** 创建人创建事件对应的公司ID */
    private Long accountID;

    /** 优先级类型 */
    private Integer priorityType;

    /** 实际完成时间 */
    private Integer realEstimateTime;

    /** 优先级类型 */
    private Integer fromRecordId;

    /** 附件名称 */
    private String attachmentSubject;

    /** 是否是最新的 */
    private Boolean isNew;

    /** 扩展信息 */
    private Map<String, Object> extraMap;

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
     * 获取alarmDate
     * @return alarmDate
     */
    public Integer getAlarmDate() {
        return alarmDate;
    }

    /**
     * 设置alarmDate
     * @param alarmDate alarmDate
     */
    public void setAlarmDate(Integer alarmDate) {
        this.alarmDate = alarmDate;
    }

    /**
     * 获取alarmFlag
     * @return alarmFlag
     */
    public Boolean getAlarmFlag() {
        return alarmFlag;
    }

    /**
     * 设置alarmFlag
     * @param alarmFlag alarmFlag
     */
    public void setAlarmFlag(Boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }

    /**
     * 获取completeRate
     * @return completeRate
     */
    public Integer getCompleteRate() {
        return completeRate;
    }

    /**
     * 设置completeRate
     * @param completeRate completeRate
     */
    public void setCompleteRate(Integer completeRate) {
        this.completeRate = completeRate;
    }

    /**
     * 获取beforendAlarm
     * @return beforendAlarm
     */
    public Integer getBeforendAlarm() {
        return beforendAlarm;
    }

    /**
     * 设置beforendAlarm
     * @param beforendAlarm beforendAlarm
     */
    public void setBeforendAlarm(Integer beforendAlarm) {
        this.beforendAlarm = beforendAlarm;
    }

    /**
     * 获取attachmentsFlag
     * @return attachmentsFlag
     */
    public Boolean getAttachmentsFlag() {
        return attachmentsFlag;
    }

    /**
     * 设置attachmentsFlag
     * @param attachmentsFlag attachmentsFlag
     */
    public void setAttachmentsFlag(Boolean attachmentsFlag) {
        this.attachmentsFlag = attachmentsFlag;
    }

    /**
     * 获取createDate
     * @return createDate
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置createDate
     * @param createDate createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取createUserId
     * @return createUserId
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置createUserId
     * @param createUserId createUserId
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取periodicalId
     * @return periodicalId
     */
    public Long getPeriodicalId() {
        return periodicalId;
    }

    /**
     * 设置periodicalId
     * @param periodicalId periodicalId
     */
    public void setPeriodicalId(Long periodicalId) {
        this.periodicalId = periodicalId;
    }

    /**
     * 获取beginDate
     * @return beginDate
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * 设置beginDate
     * @param beginDate beginDate
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * 获取endDate
     * @return endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate
     * @param endDate endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取eventType
     * @return eventType
     */
    public Integer getEventType() {
        return eventType;
    }

    /**
     * 设置eventType
     * @param eventType eventType
     */
    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    /**
     * 获取shareType
     * @return shareType
     */
    public Integer getShareType() {
        return shareType;
    }

    /**
     * 设置shareType
     * @param shareType shareType
     */
    public void setShareType(Integer shareType) {
        this.shareType = shareType;
    }

    /**
     * 获取signifyType
     * @return signifyType
     */
    public Integer getSignifyType() {
        return signifyType;
    }

    /**
     * 设置signifyType
     * @param signifyType signifyType
     */
    public void setSignifyType(Integer signifyType) {
        this.signifyType = signifyType;
    }

    /**
     * 获取states
     * @return states
     */
    public Integer getStates() {
        return states;
    }

    /**
     * 设置states
     * @param states states
     */
    public void setStates(Integer states) {
        this.states = states;
    }

    /**
     * 获取subject
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 设置subject
     * @param subject subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 获取shareTarget
     * @return shareTarget
     */
    public String getShareTarget() {
        return shareTarget;
    }

    /**
     * 设置shareTarget
     * @param shareTarget shareTarget
     */
    public void setShareTarget(String shareTarget) {
        this.shareTarget = shareTarget;
    }

    /**
     * 获取updateDate
     * @return updateDate
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置updateDate
     * @param updateDate updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取workType
     * @return workType
     */
    public String getWorkType() {
        return workType;
    }

    /**
     * 设置workType
     * @param workType workType
     */
    public void setWorkType(String workType) {
        this.workType = workType;
    }

    /**
     * 获取eventflag
     * @return eventflag
     */
    public Integer getEventflag() {
        return eventflag;
    }

    /**
     * 设置eventflag
     * @param eventflag eventflag
     */
    public void setEventflag(Integer eventflag) {
        this.eventflag = eventflag;
    }

    /**
     * 获取tranMemberIds
     * @return tranMemberIds
     */
    public String getTranMemberIds() {
        return tranMemberIds;
    }

    /**
     * 设置tranMemberIds
     * @param tranMemberIds tranMemberIds
     */
    public void setTranMemberIds(String tranMemberIds) {
        this.tranMemberIds = tranMemberIds;
    }

    /**
     * 获取tranMemberName
     * @return tranMemberName
     */
    public String getTranMemberName() {
        return tranMemberName;
    }

    /**
     * 设置tranMemberName
     * @param tranMemberName tranMemberName
     */
    public void setTranMemberName(String tranMemberName) {
        this.tranMemberName = tranMemberName;
    }

    /**
     * 获取receiveMemberId
     * @return receiveMemberId
     */
    public String getReceiveMemberId() {
        return receiveMemberId;
    }

    /**
     * 设置receiveMemberId
     * @param receiveMemberId receiveMemberId
     */
    public void setReceiveMemberId(String receiveMemberId) {
        this.receiveMemberId = receiveMemberId;
    }

    /**
     * 获取receiveMemberName
     * @return receiveMemberName
     */
    public String getReceiveMemberName() {
        return receiveMemberName;
    }

    /**
     * 设置receiveMemberName
     * @param receiveMemberName receiveMemberName
     */
    public void setReceiveMemberName(String receiveMemberName) {
        this.receiveMemberName = receiveMemberName;
    }

    /**
     * 获取fromType
     * @return fromType
     */
    public Integer getFromType() {
        return fromType;
    }

    /**
     * 设置fromType
     * @param fromType fromType
     */
    public void setFromType(Integer fromType) {
        this.fromType = fromType;
    }

    /**
     * 获取fromId
     * @return fromId
     */
    public Long getFromId() {
        return fromId;
    }

    /**
     * 设置fromId
     * @param fromId fromId
     */
    public void setFromId(Long fromId) {
        this.fromId = fromId;
    }

    /**
     * 获取periodicalStyle
     * @return periodicalStyle
     */
    public Integer getPeriodicalStyle() {
        return periodicalStyle;
    }

    /**
     * 设置periodicalStyle
     * @param periodicalStyle periodicalStyle
     */
    public void setPeriodicalStyle(Integer periodicalStyle) {
        this.periodicalStyle = periodicalStyle;
    }

    /**
     * 获取calEventType
     * @return calEventType
     */
    public Integer getCalEventType() {
        return calEventType;
    }

    /**
     * 设置calEventType
     * @param calEventType calEventType
     */
    public void setCalEventType(Integer calEventType) {
        this.calEventType = calEventType;
    }

    /**
     * 获取isEntrust
     * @return isEntrust
     */
    public Integer getIsEntrust() {
        return isEntrust;
    }

    /**
     * 设置isEntrust
     * @param isEntrust isEntrust
     */
    public void setIsEntrust(Integer isEntrust) {
        this.isEntrust = isEntrust;
    }

    /**
     * 获取periodicalChildId
     * @return periodicalChildId
     */
    public Long getPeriodicalChildId() {
        return periodicalChildId;
    }

    /**
     * 设置periodicalChildId
     * @param periodicalChildId periodicalChildId
     */
    public void setPeriodicalChildId(Long periodicalChildId) {
        this.periodicalChildId = periodicalChildId;
    }

    /**
     * 获取accountID
     * @return accountID
     */
    public Long getAccountID() {
        return accountID;
    }

    /**
     * 设置accountID
     * @param accountID accountID
     */
    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    /**
     * 获取priorityType
     * @return priorityType
     */
    public Integer getPriorityType() {
        return priorityType;
    }

    /**
     * 设置priorityType
     * @param priorityType priorityType
     */
    public void setPriorityType(Integer priorityType) {
        this.priorityType = priorityType;
    }

    /**
     * 获取realEstimateTime
     * @return realEstimateTime
     */
    public Integer getRealEstimateTime() {
        return realEstimateTime;
    }

    /**
     * 设置realEstimateTime
     * @param realEstimateTime realEstimateTime
     */
    public void setRealEstimateTime(Integer realEstimateTime) {
        this.realEstimateTime = realEstimateTime;
    }

    /**
     * 获取fromRecordId
     * @return fromRecordId
     */
    public Integer getFromRecordId() {
        return fromRecordId;
    }

    /**
     * 设置fromRecordId
     * @param fromRecordId fromRecordId
     */
    public void setFromRecordId(Integer fromRecordId) {
        this.fromRecordId = fromRecordId;
    }

    /**
     * 获取attachmentSubject
     * @return attachmentSubject
     */
    public String getAttachmentSubject() {
        return attachmentSubject;
    }

    /**
     * 设置attachmentSubject
     * @param attachmentSubject attachmentSubject
     */
    public void setAttachmentSubject(String attachmentSubject) {
        this.attachmentSubject = attachmentSubject;
    }

    /**
     * 获取extraMap
     * @return extraMap
     */
    public Map<String, Object> getExtraMap() {
        return extraMap;
    }

    /**
     * 设置extraMap
     * @param extraMap extraMap
     */
    public void setExtraMap(Map<String, Object> extraMap) {
        this.extraMap = extraMap;
    }

    /**
     * 获取isNew
     * @return isNew
     */
    public Boolean getIsNew() {
        return isNew;
    }

    /**
     * 设置isNew
     * @param isNew isNew
     */
    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }
}
