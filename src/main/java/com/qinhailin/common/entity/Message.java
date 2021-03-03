package com.qinhailin.common.entity;

import java.util.Date;
import java.util.Map;

/**
 * 消息实体
 * @author Yang.Yinghai
 * @date 2014-8-20下午1:17:46
 * @Copyright(c) Beijing Seeyon Software Co.,LTD
 */
public class Message {

    /** 消息主键，唯一标示消息 */
    private Long id;

    /** 创建时间 */
    private Date creationDate;

    /** 主对象ID，例如此处为调查对象的ID */
    private Long referenceId;

    /** 消息所属应用类型，应用类型请查看应用类型枚举说明 */
    private Integer messageCategory;

    /** 消息内容 */
    private String messageContent;

    /** 消息类型，目前只有系统消息一种 */
    private Integer messageType;

    /** 发送者ID */
    private Long senderId;

    /** 接收者ID */
    private Long receiverId;

    /** 消息接收人Id */
    private Long userId;

    /** 发送者名称 */
    private String senderName;

    /**  */
    private String senderAccountShortname;

    /**  */
    private String receiverName;

    /** 链接类型 */
    private String linkType;

    /** 链接的打开方式，0：新窗口打开；1：工作区打开 */
    private Integer openType;

    /** 链接参数0 */
    private String linkParam0;

    /** 链接参数1 */
    private String linkParam1;

    /** 链接参数2 */
    private String linkParam2;

    /** 链接参数3 */
    private String linkParam3;

    /** 链接参数4 */
    private String linkParam4;

    /** 链接参数5 */
    private String linkParam5;

    /** 链接参数6 */
    private String linkParam6;

    /** 链接参数7 */
    private String linkParam7;

    /** 链接参数8 */
    private String linkParam8;

    /** 链接参数9 */
    private String linkParam9;

    /** 是否已读 */
    private Boolean isRead;

    /** 重要紧急程度 */
    private Integer importantLevel;

    /** 链接 */
    private String link;

    /** 是否是最新的 */
    private Boolean isNew;

    /** 扩展属性 */
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
     * 获取creationDate
     * @return creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * 设置creationDate
     * @param creationDate creationDate
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * 获取referenceId
     * @return referenceId
     */
    public Long getReferenceId() {
        return referenceId;
    }

    /**
     * 设置referenceId
     * @param referenceId referenceId
     */
    public void setReferenceId(Long referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * 获取messageCategory
     * @return messageCategory
     */
    public Integer getMessageCategory() {
        return messageCategory;
    }

    /**
     * 设置messageCategory
     * @param messageCategory messageCategory
     */
    public void setMessageCategory(Integer messageCategory) {
        this.messageCategory = messageCategory;
    }

    /**
     * 获取messageContent
     * @return messageContent
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * 设置messageContent
     * @param messageContent messageContent
     */
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    /**
     * 获取messageType
     * @return messageType
     */
    public Integer getMessageType() {
        return messageType;
    }

    /**
     * 设置messageType
     * @param messageType messageType
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    /**
     * 获取senderId
     * @return senderId
     */
    public Long getSenderId() {
        return senderId;
    }

    /**
     * 设置senderId
     * @param senderId senderId
     */
    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    /**
     * 获取receiverId
     * @return receiverId
     */
    public Long getReceiverId() {
        return receiverId;
    }

    /**
     * 设置receiverId
     * @param receiverId receiverId
     */
    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    /**
     * 获取userId
     * @return userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置userId
     * @param userId userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取senderName
     * @return senderName
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * 设置senderName
     * @param senderName senderName
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * 获取senderAccountShortname
     * @return senderAccountShortname
     */
    public String getSenderAccountShortname() {
        return senderAccountShortname;
    }

    /**
     * 设置senderAccountShortname
     * @param senderAccountShortname senderAccountShortname
     */
    public void setSenderAccountShortname(String senderAccountShortname) {
        this.senderAccountShortname = senderAccountShortname;
    }

    /**
     * 获取receiverName
     * @return receiverName
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置receiverName
     * @param receiverName receiverName
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * 获取linkType
     * @return linkType
     */
    public String getLinkType() {
        return linkType;
    }

    /**
     * 设置linkType
     * @param linkType linkType
     */
    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    /**
     * 获取openType
     * @return openType
     */
    public Integer getOpenType() {
        return openType;
    }

    /**
     * 设置openType
     * @param openType openType
     */
    public void setOpenType(Integer openType) {
        this.openType = openType;
    }

    /**
     * 获取linkParam0
     * @return linkParam0
     */
    public String getLinkParam0() {
        return linkParam0;
    }

    /**
     * 设置linkParam0
     * @param linkParam0 linkParam0
     */
    public void setLinkParam0(String linkParam0) {
        this.linkParam0 = linkParam0;
    }

    /**
     * 获取linkParam1
     * @return linkParam1
     */
    public String getLinkParam1() {
        return linkParam1;
    }

    /**
     * 设置linkParam1
     * @param linkParam1 linkParam1
     */
    public void setLinkParam1(String linkParam1) {
        this.linkParam1 = linkParam1;
    }

    /**
     * 获取linkParam2
     * @return linkParam2
     */
    public String getLinkParam2() {
        return linkParam2;
    }

    /**
     * 设置linkParam2
     * @param linkParam2 linkParam2
     */
    public void setLinkParam2(String linkParam2) {
        this.linkParam2 = linkParam2;
    }

    /**
     * 获取linkParam3
     * @return linkParam3
     */
    public String getLinkParam3() {
        return linkParam3;
    }

    /**
     * 设置linkParam3
     * @param linkParam3 linkParam3
     */
    public void setLinkParam3(String linkParam3) {
        this.linkParam3 = linkParam3;
    }

    /**
     * 获取linkParam4
     * @return linkParam4
     */
    public String getLinkParam4() {
        return linkParam4;
    }

    /**
     * 设置linkParam4
     * @param linkParam4 linkParam4
     */
    public void setLinkParam4(String linkParam4) {
        this.linkParam4 = linkParam4;
    }

    /**
     * 获取linkParam5
     * @return linkParam5
     */
    public String getLinkParam5() {
        return linkParam5;
    }

    /**
     * 设置linkParam5
     * @param linkParam5 linkParam5
     */
    public void setLinkParam5(String linkParam5) {
        this.linkParam5 = linkParam5;
    }

    /**
     * 获取linkParam6
     * @return linkParam6
     */
    public String getLinkParam6() {
        return linkParam6;
    }

    /**
     * 设置linkParam6
     * @param linkParam6 linkParam6
     */
    public void setLinkParam6(String linkParam6) {
        this.linkParam6 = linkParam6;
    }

    /**
     * 获取linkParam7
     * @return linkParam7
     */
    public String getLinkParam7() {
        return linkParam7;
    }

    /**
     * 设置linkParam7
     * @param linkParam7 linkParam7
     */
    public void setLinkParam7(String linkParam7) {
        this.linkParam7 = linkParam7;
    }

    /**
     * 获取linkParam8
     * @return linkParam8
     */
    public String getLinkParam8() {
        return linkParam8;
    }

    /**
     * 设置linkParam8
     * @param linkParam8 linkParam8
     */
    public void setLinkParam8(String linkParam8) {
        this.linkParam8 = linkParam8;
    }

    /**
     * 获取linkParam9
     * @return linkParam9
     */
    public String getLinkParam9() {
        return linkParam9;
    }

    /**
     * 设置linkParam9
     * @param linkParam9 linkParam9
     */
    public void setLinkParam9(String linkParam9) {
        this.linkParam9 = linkParam9;
    }

    /**
     * 获取isRead
     * @return isRead
     */
    public Boolean getIsRead() {
        return isRead;
    }

    /**
     * 设置isRead
     * @param isRead isRead
     */
    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    /**
     * 获取importantLevel
     * @return importantLevel
     */
    public Integer getImportantLevel() {
        return importantLevel;
    }

    /**
     * 设置importantLevel
     * @param importantLevel importantLevel
     */
    public void setImportantLevel(Integer importantLevel) {
        this.importantLevel = importantLevel;
    }

    /**
     * 获取link
     * @return link
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置link
     * @param link link
     */
    public void setLink(String link) {
        this.link = link;
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
}
