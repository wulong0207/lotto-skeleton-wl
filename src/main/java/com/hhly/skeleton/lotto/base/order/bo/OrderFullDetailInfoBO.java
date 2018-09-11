package com.hhly.skeleton.lotto.base.order.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.bo.PagingBO;

import java.util.Date;
import java.util.List;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 方案详情页面全部信息
 * @date 2017/3/17 16:28
 * @company 益彩网络科技公司
 */
public class OrderFullDetailInfoBO extends BaseBO {

    //用户信息
    /**
     * 用户Id
     */
    private Integer userId;

    /**
     * 帐户名
     */
    private String account;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 头像URL
     */
    private String headUrl;

    /**
     * 服务端当前系统时间（可以用来和其他时间做判断和对比）
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date sysDate = new Date();

    /**
     * 文件下载url
     */
    private String downloadUrl;

    /**
     * 订单基本信息
     */
    private OrderBaseInfoBO orderBaseInfoBO;

    /**
     * 竞技彩方案详情结果集
     */
    private List<OrderMatchInfoBO> orderMatchInfoBOs;

    /**
     * 单式上传详情
     */
    private List<OrderDetailInfoBO> singleUploadDeatailList;


    /**
     * 数字彩方案详情
     *
     */
    private PagingBO<UserNumOrderDetailBO> userNumPage;

    /**
     * 追号计划方案详情投注内容分页对象
     *
     */
    private PagingBO<UserNumOrderDetailBO> pageContentData;

    /**
     * 追号计划方案详情期数分页内容
     */
    private PagingBO<UserChaseDetailBO> addDetailBOPagingBO;

    /**
     * 订单中奖状态
     */
    @JsonIgnore
    private Integer winStatus;

    public Integer getWinStatus() {
        return winStatus;
    }

    public void setWinStatus(Integer winStatus) {
        this.winStatus = winStatus;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public OrderBaseInfoBO getOrderBaseInfoBO() {
        return orderBaseInfoBO;
    }

    public void setOrderBaseInfoBO(OrderBaseInfoBO orderBaseInfoBO) {
        this.orderBaseInfoBO = orderBaseInfoBO;
    }

    public List<OrderMatchInfoBO> getOrderMatchInfoBOs() {
        return orderMatchInfoBOs;
    }

    public void setOrderMatchInfoBOs(List<OrderMatchInfoBO> orderMatchInfoBOs) {
        this.orderMatchInfoBOs = orderMatchInfoBOs;
    }

    public PagingBO<UserNumOrderDetailBO> getUserNumPage() {
        return userNumPage;
    }

    public void setUserNumPage(PagingBO<UserNumOrderDetailBO> userNumPage) {
        this.userNumPage = userNumPage;
    }


    public PagingBO<UserChaseDetailBO> getAddDetailBOPagingBO() {
        return addDetailBOPagingBO;
    }

    public void setAddDetailBOPagingBO(PagingBO<UserChaseDetailBO> addDetailBOPagingBO) {
        this.addDetailBOPagingBO = addDetailBOPagingBO;
    }

    public Date getSysDate() {
        return sysDate;
    }

    public void setSysDate(Date sysDate) {
        this.sysDate = sysDate;
    }

    public PagingBO<UserNumOrderDetailBO> getPageContentData() {
        return pageContentData;
    }

    public void setPageContentData(PagingBO<UserNumOrderDetailBO> pageContentData) {
        this.pageContentData = pageContentData;
    }

    public List<OrderDetailInfoBO> getSingleUploadDeatailList() {
        return singleUploadDeatailList;
    }

    public void setSingleUploadDeatailList(List<OrderDetailInfoBO> singleUploadDeatailList) {
        this.singleUploadDeatailList = singleUploadDeatailList;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
