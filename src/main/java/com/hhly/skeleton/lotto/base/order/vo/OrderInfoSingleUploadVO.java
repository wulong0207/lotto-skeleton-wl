package com.hhly.skeleton.lotto.base.order.vo;

import com.hhly.skeleton.base.vo.BaseVO;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 单式上传下单VO
 * @date 2017/6/12 14:25
 * @company 益彩网络科技公司
 */
public class OrderInfoSingleUploadVO extends BaseVO {

    
	private static final long serialVersionUID = 1L;

	/**
     * 用户TOKEN
     */
    private String token;

    /**
     * 竟足专有， 老足彩不需要传 isChooseMatch=1 选择场次时必传。 投注赛事系统编号，多个以,分割。
     */
    private String buyScreen;

    /**
     * 渠道ID
     */
    private String channelId;

    /**
     * 彩种子玩法ID，必传
     */
    private Integer lotteryChildCode;

    /**
     *  彩种编号
     */
    private Integer lotteryCode;

    /**
     * 彩期
     */
    private String lotteryIssue;

    /**
     * 订单总倍数,isPageModify=1时，传页面的倍数；isPageModify=2，默认传1倍
     */
    private Integer multipleNum;

    /**
     * 订单总金额 isPageModify=1时传
     */
    private Double orderAmount;

    /**
     *  立即投注方式 是否切换效果图1：是，2：否 。
     * 根据此参数判断是否是入参的方式还是直接解析文件的方式
     */
    private Short isPageModify;

    /**
     * 竟足专有， 老足彩不需要选择场次。 上传方式 1：页面选择场次 2：文件包含场次
     */
    private Short isChooseMatch;

    /**
     * 竟足专有，老足彩不需要传 isChooseMatch=1时。选择场次时需传，如：170621#星期三001/星期三002;170622#星期四001/星期四002/星期四003
     */
    private String selectedMatchs;

    /**
     * 最新的文件名称+路劲 必传
     */
    private String fileURL;

    /**
     * 第二个文件
     */
    private String newFileURL;

    /**
     * 1：代购；2：追号；3：合买
     */
    private Short buyType;

    /**
     * 投注平台:1：Web,2:Wap; 3:Android; 4:IOS
     */
    private Short platform;

    /**
     * 用户ID 后台根据token生成
     */
    private Integer userId;

    /**
     * 过关方式 R、S、B、Q、Z、M
     */
    private String playCode;

    /**
     * 转换内容。 如果有格式转换，需要传
     */
    private String shiftContent;

    /**
     * 方案详情。isPageModify=1时必传。解析文件的方式，这个内容后台自己组装
     */
    private List<OrderDetailSingleUploadVO> orderDetailSingleUploadVOList;


    public String getBuyScreen() {
        return buyScreen;
    }

    public void setBuyScreen(String buyScreen) {
        this.buyScreen = buyScreen;
    }



    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }


    public Integer getLotteryChildCode() {
        return lotteryChildCode;
    }

    public void setLotteryChildCode(Integer lotteryChildCode) {
        this.lotteryChildCode = lotteryChildCode;
    }

    public String getLotteryIssue() {
        return lotteryIssue;
    }

    public void setLotteryIssue(String lotteryIssue) {
        this.lotteryIssue = lotteryIssue;
    }

    public Integer getMultipleNum() {
        return multipleNum;
    }

    public void setMultipleNum(Integer multipleNum) {
        this.multipleNum = multipleNum;
    }

    public List<OrderDetailSingleUploadVO> getOrderDetailSingleUploadVOList() {
        return orderDetailSingleUploadVOList;
    }

    public void setOrderDetailSingleUploadVOList(List<OrderDetailSingleUploadVO> orderDetailSingleUploadVOList) {
        this.orderDetailSingleUploadVOList = orderDetailSingleUploadVOList;
    }

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Short getBuyType() {
        return buyType;
    }

    public void setBuyType(Short buyType) {
        this.buyType = buyType;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Short getPlatform() {
        return platform;
    }

    public void setPlatform(Short platform) {
        this.platform = platform;
    }

    public Short getIsChooseMatch() {
        return isChooseMatch;
    }

    public void setIsChooseMatch(Short isChooseMatch) {
        this.isChooseMatch = isChooseMatch;
    }

    public Short getIsPageModify() {
        return isPageModify;
    }

    public void setIsPageModify(Short isPageModify) {
        this.isPageModify = isPageModify;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSelectedMatchs() {
        return selectedMatchs;
    }

    public void setSelectedMatchs(String selectedMatchs) {
        this.selectedMatchs = selectedMatchs;
    }

    public String getPlayCode() {
        return playCode;
    }

    public void setPlayCode(String playCode) {
        this.playCode = playCode;
    }

    public String getShiftContent() {
        return shiftContent;
    }

    public void setShiftContent(String shiftContent) {
        this.shiftContent = shiftContent;
    }

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getNewFileURL() {
        return newFileURL;
    }

    public void setNewFileURL(String newFileURL) {
        this.newFileURL = newFileURL;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("token", token)
                .append("buyScreen", buyScreen)
                .append("channelId", channelId)
                .append("lotteryChildCode", lotteryChildCode)
                .append("lotteryCode", lotteryCode)
                .append("lotteryIssue", lotteryIssue)
                .append("multipleNum", multipleNum)
                .append("orderAmount", orderAmount)
                .append("isPageModify", isPageModify)
                .append("isChooseMatch", isChooseMatch)
                .append("selectedMatchs", selectedMatchs)
                .append("fileURL", fileURL)
                .append("newFileURL", newFileURL)
                .append("buyType", buyType)
                .append("platform", platform)
                .append("userId", userId)
                .append("playCode", playCode)
                .append("shiftContent", shiftContent)
                .append("orderDetailSingleUploadVOList", orderDetailSingleUploadVOList)
                .toString();
    }
}
