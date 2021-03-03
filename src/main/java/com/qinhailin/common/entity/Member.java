package com.qinhailin.common.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Member extends OrgEntity {

    private Long orgLevelId;

    private Long orgPostId;

    private Long orgDepartmentId;

    private Integer type;

    private Boolean isInternal;

    private Boolean isLoginable;

    private Boolean isVirtual;

    private Boolean isAssigned;

    private Boolean isAdmin;

    private Boolean isValid;

    private Integer state;

    private Map<String, Object> properties;

    private List<Post> second_post;

    private List<Post> concurrent_post;

    private String address;

    private String loginName;

    private String emailAddress;

    private String officeNum;

    private String postalcode;

    private String telNumber;

    private Date birthday;

    private String weibo;

    private String weixin;

    private String idNum;

    private String degree;

    private String postAddress;

    private String gender;

    private String blog;

    private String website;

    /**
     * 获取orgLevelId
     * @return orgLevelId
     */
    public Long getOrgLevelId() {
        return orgLevelId;
    }

    /**
     * 设置orgLevelId
     * @param orgLevelId orgLevelId
     */
    public void setOrgLevelId(Long orgLevelId) {
        this.orgLevelId = orgLevelId;
    }

    /**
     * 获取orgPostId
     * @return orgPostId
     */
    public Long getOrgPostId() {
        return orgPostId;
    }

    /**
     * 设置orgPostId
     * @param orgPostId orgPostId
     */
    public void setOrgPostId(Long orgPostId) {
        this.orgPostId = orgPostId;
    }

    /**
     * 获取orgDepartmentId
     * @return orgDepartmentId
     */
    public Long getOrgDepartmentId() {
        return orgDepartmentId;
    }

    /**
     * 设置orgDepartmentId
     * @param orgDepartmentId orgDepartmentId
     */
    public void setOrgDepartmentId(Long orgDepartmentId) {
        this.orgDepartmentId = orgDepartmentId;
    }

    /**
     * 获取type
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置type
     * @param type type
     */
    public void setType(Integer type) {
        this.type = type;
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
     * 获取isLoginable
     * @return isLoginable
     */
    public Boolean getIsLoginable() {
        return isLoginable;
    }

    /**
     * 设置isLoginable
     * @param isLoginable isLoginable
     */
    public void setIsLoginable(Boolean isLoginable) {
        this.isLoginable = isLoginable;
    }

    /**
     * 获取isVirtual
     * @return isVirtual
     */
    public Boolean getIsVirtual() {
        return isVirtual;
    }

    /**
     * 设置isVirtual
     * @param isVirtual isVirtual
     */
    public void setIsVirtual(Boolean isVirtual) {
        this.isVirtual = isVirtual;
    }

    /**
     * 获取isAssigned
     * @return isAssigned
     */
    public Boolean getIsAssigned() {
        return isAssigned;
    }

    /**
     * 设置isAssigned
     * @param isAssigned isAssigned
     */
    public void setIsAssigned(Boolean isAssigned) {
        this.isAssigned = isAssigned;
    }

    /**
     * 获取isAdmin
     * @return isAdmin
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * 设置isAdmin
     * @param isAdmin isAdmin
     */
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * 获取isValid
     * @return isValid
     */
    public Boolean getIsValid() {
        return isValid;
    }

    /**
     * 设置isValid
     * @param isValid isValid
     */
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    /**
     * 获取state
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置state
     * @param state state
     */
    public void setState(Integer state) {
        this.state = state;
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
     * 获取second_post
     * @return second_post
     */
    public List<Post> getSecond_post() {
        return second_post;
    }

    /**
     * 设置second_post
     * @param second_post second_post
     */
    public void setSecond_post(List<Post> second_post) {
        this.second_post = second_post;
    }

    /**
     * 获取concurrent_post
     * @return concurrent_post
     */
    public List<Post> getConcurrent_post() {
        return concurrent_post;
    }

    /**
     * 设置concurrent_post
     * @param concurrent_post concurrent_post
     */
    public void setConcurrent_post(List<Post> concurrent_post) {
        this.concurrent_post = concurrent_post;
    }

    /**
     * 获取address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address
     * @param address address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取loginName
     * @return loginName
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置loginName
     * @param loginName loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取emailAddress
     * @return emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 设置emailAddress
     * @param emailAddress emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * 获取officeNum
     * @return officeNum
     */
    public String getOfficeNum() {
        return officeNum;
    }

    /**
     * 设置officeNum
     * @param officeNum officeNum
     */
    public void setOfficeNum(String officeNum) {
        this.officeNum = officeNum;
    }

    /**
     * 获取postalcode
     * @return postalcode
     */
    public String getPostalcode() {
        return postalcode;
    }

    /**
     * 设置postalcode
     * @param postalcode postalcode
     */
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    /**
     * 获取telNumber
     * @return telNumber
     */
    public String getTelNumber() {
        return telNumber;
    }

    /**
     * 设置telNumber
     * @param telNumber telNumber
     */
    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    /**
     * 获取birthday
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置birthday
     * @param birthday birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取weibo
     * @return weibo
     */
    public String getWeibo() {
        return weibo;
    }

    /**
     * 设置weibo
     * @param weibo weibo
     */
    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    /**
     * 获取weixin
     * @return weixin
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * 设置weixin
     * @param weixin weixin
     */
    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    /**
     * 获取idNum
     * @return idNum
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * 设置idNum
     * @param idNum idNum
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * 获取degree
     * @return degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * 设置degree
     * @param degree degree
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * 获取postAddress
     * @return postAddress
     */
    public String getPostAddress() {
        return postAddress;
    }

    /**
     * 设置postAddress
     * @param postAddress postAddress
     */
    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    /**
     * 获取gender
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置gender
     * @param gender gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取blog
     * @return blog
     */
    public String getBlog() {
        return blog;
    }

    /**
     * 设置blog
     * @param blog blog
     */
    public void setBlog(String blog) {
        this.blog = blog;
    }

    /**
     * 获取website
     * @return website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 设置website
     * @param website website
     */
    public void setWebsite(String website) {
        this.website = website;
    }
}
