package com.hhly.skeleton.cms.transmgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.vo.PageVO;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

public class TransRemittingBO extends PageVO{
    private Integer id;

    private Integer userId;

    private Integer remittingBank;

    private Double remittingAmount;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date commitTime;

    private Integer status;

    private String screenshot;

    private Date createTime;

    private Date modifyTime;

    private String createBy;

    private String modifyBy;

    private String nickName;
    private String accountName;
    private String cusMobile;
    private String actualName;

    private MultipartFile img;

    private Date startTime;

    private Date endTime;

    private Integer userSearchType;
    private String userSearchValue;

    private String token;

    private List<Integer> ids;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }

    public String getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot == null ? null : screenshot.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Integer getRemittingBank() {
        return remittingBank;
    }

    public void setRemittingBank(Integer remittingBank) {
        this.remittingBank = remittingBank;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getUserSearchType() {
        return userSearchType;
    }

    public void setUserSearchType(Integer userSearchType) {
        this.userSearchType = userSearchType;
    }

    public String getUserSearchValue() {
        return userSearchValue;
    }

    public void setUserSearchValue(String userSearchValue) {
        this.userSearchValue = userSearchValue;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getCusMobile() {
        return cusMobile;
    }

    public void setCusMobile(String cusMobile) {
        this.cusMobile = cusMobile;
    }

    public String getActualName() {
        return actualName;
    }

    public void setActualName(String actualName) {
        this.actualName = actualName;
    }

    public MultipartFile getImg() {
        return img;
    }

    public void setImg(MultipartFile img) {
        this.img = img;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Double getRemittingAmount() {
        return remittingAmount;
    }

    public void setRemittingAmount(Double remittingAmount) {
        this.remittingAmount = remittingAmount;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "TransRemittingBO{" +
                "id=" + id +
                ", userId=" + userId +
                ", remittingBank=" + remittingBank +
                ", remittingAmount=" + remittingAmount +
                ", commitTime=" + commitTime +
                ", status=" + status +
                ", screenshot='" + screenshot + '\'' +
                ", createTime=" + createTime +
                ", createBy='" + createBy + '\'' +
                '}';
    }
}