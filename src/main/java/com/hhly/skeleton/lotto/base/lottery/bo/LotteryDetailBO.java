package com.hhly.skeleton.lotto.base.lottery.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.common.LotteryEnum;

import java.util.Date;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 彩种详情实体类
 * @date 2017/11/2
 * @company 益彩网络科技公司
 */
public class LotteryDetailBO extends BaseBO {

    /**
     * 彩种id
     */
    private Integer id;

    /**
     * 当前彩期编号
     */
    private String issueCode;

    /**
     * 最新彩期编号
     */
    private String preIssueCode;

    /**
     * 彩种编码
     */
    private Integer lotteryCode;

    /**
     * 彩种名称
     */
    private String lotteryName;

    /**
     * 奖池金额
     */
    private Double jackpotAmount;

    /**
     * 当前期彩金金额
     */
    private Double preJackpotAmount;


    /**
     * 开奖号码
     */
    private String drawCode;

    /**
     * 当前期开奖号码
     */
    private String preDrawCode;

    /**
     * 试机号码
     */
    private String drawCodeTest;

    /**
     * 开奖详情链接
     */
    private String drawDetailUrl;

    /**
     * 销售状态
     */
    private Short saleStatus;

    /**
     * 开奖时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date lotteryTime;

    /**
     * 上一期开奖时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date preLotteryTime;

    /**
     * 开奖详情
     */
    private String drawDetail;

    /**
     * 当前期开奖详情
     */
    private String preDrawDetail;

    /**
     * 彩种logo的 url
     */
    private String lotteryLogoUrl;

    /**
     * 1：数字彩；2：高频彩；3：竞技彩
     */
    private Integer categoryId;

    /**
     * 高频彩开奖周期
     */
    private String sailDatCycle;

    /**
     * 彩种别名
     */
    private String typeAlias;

    /**
     * 彩种链接
     */
    private String typeUrl;

    /**
     * 运营图标:0无;1新;2热;3加奖;4其他,5 停售
     */
    private Short icon;

    /**
     * 运营文案
     */
    private String typeKey;

    /**
     * 运营文案链接
     */
    private String typeKeyUrl;

    /**
     * 彩种id
     */
    private Integer  typeId;

    /**
     * 运营图标
     */
    private String url;

    /**
     * 彩种描述
     */
    private String lotteryIntro;

    /**
     * 竞足竞篮当前可投注比赛数量
     */
    private Integer betNum;

    /**
     * 是否热门
     */
    private Short isHot;

    /**
     * 彩种已销售期数
     */
    private Integer soldNum;

    /**
     * 彩种未销售期数
     */
    private Integer noSalesNum;

    public LotteryDetailBO() {
    }

    public LotteryDetailBO(LotteryDetailBO bo, Short current) {
        if (current.equals(LotteryEnum.ConIssue.LAST_CURRENT.getValue())) {
            issueCode = bo.getPreIssueCode();
            lotteryTime = bo.getPreLotteryTime();
        }
        drawCode = bo.getPreDrawCode();
        drawCodeTest = bo.getDrawCodeTest();
        drawDetailUrl = bo.getDrawDetailUrl();
        drawDetail = bo.getPreDrawDetail();
        jackpotAmount = bo.getPreJackpotAmount();
        lotteryCode = bo.getLotteryCode();
        lotteryName = bo.getLotteryName();
        categoryId = bo.getCategoryId();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIssueCode() {
        return issueCode;
    }

    public void setIssueCode(String issueCode) {
        this.issueCode = issueCode;
    }

    public String getPreIssueCode() {
        return preIssueCode;
    }

    public void setPreIssueCode(String preIssueCode) {
        this.preIssueCode = preIssueCode;
    }

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public Double getJackpotAmount() {
        return jackpotAmount;
    }

    public void setJackpotAmount(Double jackpotAmount) {
        this.jackpotAmount = jackpotAmount;
    }

    public Double getPreJackpotAmount() {
        return preJackpotAmount;
    }

    public void setPreJackpotAmount(Double preJackpotAmount) {
        this.preJackpotAmount = preJackpotAmount;
    }

    public String getDrawCode() {
        return drawCode;
    }

    public void setDrawCode(String drawCode) {
        this.drawCode = drawCode;
    }

    public String getPreDrawCode() {
        return preDrawCode;
    }

    public void setPreDrawCode(String preDrawCode) {
        this.preDrawCode = preDrawCode;
    }

    public String getDrawCodeTest() {
        return drawCodeTest;
    }

    public void setDrawCodeTest(String drawCodeTest) {
        this.drawCodeTest = drawCodeTest;
    }

    public String getDrawDetailUrl() {
        return drawDetailUrl;
    }

    public void setDrawDetailUrl(String drawDetailUrl) {
        this.drawDetailUrl = drawDetailUrl;
    }

    public Short getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Short saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Date getLotteryTime() {
        return lotteryTime;
    }

    public void setLotteryTime(Date lotteryTime) {
        this.lotteryTime = lotteryTime;
    }

    public Date getPreLotteryTime() {
        return preLotteryTime;
    }

    public void setPreLotteryTime(Date preLotteryTime) {
        this.preLotteryTime = preLotteryTime;
    }

    public String getDrawDetail() {
        return drawDetail;
    }

    public void setDrawDetail(String drawDetail) {
        this.drawDetail = drawDetail;
    }

    public String getPreDrawDetail() {
        return preDrawDetail;
    }

    public void setPreDrawDetail(String preDrawDetail) {
        this.preDrawDetail = preDrawDetail;
    }

    public String getLotteryLogoUrl() {
        return lotteryLogoUrl;
    }

    public void setLotteryLogoUrl(String lotteryLogoUrl) {
        this.lotteryLogoUrl = lotteryLogoUrl;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getSailDatCycle() {
        return sailDatCycle;
    }

    public void setSailDatCycle(String sailDatCycle) {
        this.sailDatCycle = sailDatCycle;
    }

    public String getTypeAlias() {
        return typeAlias;
    }

    public void setTypeAlias(String typeAlias) {
        this.typeAlias = typeAlias;
    }

    public String getTypeUrl() {
        return typeUrl;
    }

    public void setTypeUrl(String typeUrl) {
        this.typeUrl = typeUrl;
    }

    public Short getIcon() {
        return icon;
    }

    public void setIcon(Short icon) {
        this.icon = icon;
    }

    public String getTypeKey() {
        return typeKey;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public String getTypeKeyUrl() {
        return typeKeyUrl;
    }

    public void setTypeKeyUrl(String typeKeyUrl) {
        this.typeKeyUrl = typeKeyUrl;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLotteryIntro() {
        return lotteryIntro;
    }

    public void setLotteryIntro(String lotteryIntro) {
        this.lotteryIntro = lotteryIntro;
    }

    public Integer getBetNum() {
        return betNum;
    }

    public void setBetNum(Integer betNum) {
        this.betNum = betNum;
    }

    public Short getIsHot() {
        return isHot;
    }

    public void setIsHot(Short isHot) {
        this.isHot = isHot;
    }

    public Integer getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(Integer soldNum) {
        this.soldNum = soldNum;
    }

    public Integer getNoSalesNum() {
        return noSalesNum;
    }

    public void setNoSalesNum(Integer noSalesNum) {
        this.noSalesNum = noSalesNum;
    }
}
