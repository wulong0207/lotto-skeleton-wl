package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.ticket.bo.BetContentBO;

import java.util.List;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2017/3/16 14:36
 * @company 益彩网络科技公司
 */
public class OrderMatchInfoBO extends BaseBO {

    /** 对阵id*/
    private Long id;

    /**
     * 官方赛事编号 例如 周二015
     */
    private String officalMatchCode;
    
    /**
     * 北京单场官方编号
     */
    private String bjNum;

    /**
     * 系统编号
     */
    private String systemCode;

    /**
     * 主队名称
     */
    private String homeName;

    /**
     * 客队名称
     */
    private String visitiName;

    /**
     * 赛事简称
     */
    private String matchShortName;

    /***
     * 足球玩法相关
     */
    private OrderMatchZQBO orderMatchZQBO;

    /**
     * 篮球玩法相关
     */
    private OrderMatchLQBO orderMatchLQBO;

    /**
     * 老足彩相关
     */
    private OrderMatchLZCBO orderMatchLZCBO;
    
    /**
     * 北京单场相关
     */
    private OrderMatchBJBO orderMatchBJBO;

    /**
     * 每场赛事的投注内容，和投注内容格式一致。取系统编号后面的内容,让分值，大小分值，SP值，如果是混合，玩法也从此取前端从此处截取
     */
    private String betGameContent;

    /**
     * 1：等待比赛；2：比赛中；3：已完场；4：延期；5：取消
     其它竞技彩赛事状态：6：暂定赛程；7：未开售；8：预售中；9：销售中；
     10：暂停销售；11：销售截止；12：比赛进行中；13：延期；14：取消；15：已开奖；
     16：已派奖；17：已审核；数据从官方抓取，暂停销售为我们自己系统的状态，若为暂停销售，则数据抓取获得的状态不能改变此赛事状态。
     */
    private Integer matchStatus;

    /**
     * 是否是胆 0：不是，1：是
     */
    private Integer isDan = 0;

    /**
     * 老足彩比如任九：14场比赛选择九场，还有五场是没有投注的，
     * 因为返回了15场赛事，此字段区分本场赛事是否是投注的赛事 1：是 2 ：不是
     */
    private Integer isChooseMatchInfo=1;

    /**
     * 比赛日期 yyyy-MM-dd
     */
    private String date;

    /**
     * 比赛时间 HH:mm
     */
    private String time;

    /**
     * 主队图片
     */
    private String homeLogo;

    /**
     * 客队图片
     */
    private String guestLogo;

    /**
     * 彩果信息
     */
    private List<BetContentBO> betContentBOs;

    /**
     * 竞彩篮球客队比赛结束得分
     */
    private Integer guestScore;
    /**
     * 竞彩篮球主队比赛结束得分
     */
    private Integer homeScore;

    /**
     * 冠亚军专用 彩果状态 1：已淘汰 2 ：已中奖（彩果显示对于的对阵,并且标红）3 ：彩果为空
     */
    private Integer caiGuoStatus;

    public Integer getGuestScore() {
        return guestScore;
    }

    public void setGuestScore(Integer guestScore) {
        this.guestScore = guestScore;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public String getOfficalMatchCode() {
        return officalMatchCode;
    }

    public void setOfficalMatchCode(String officalMatchCode) {
        this.officalMatchCode = officalMatchCode;
    }
    
    public String getBjNum() {
		return bjNum;
	}

	public void setBjNum(String bjNum) {
		this.bjNum = bjNum;
	}

	public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getVisitiName() {
        return visitiName;
    }

    public void setVisitiName(String visitiName) {
        this.visitiName = visitiName;
    }

    public Integer getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(Integer matchStatus) {
        this.matchStatus = matchStatus;
    }

    public String getBetGameContent() {
        return betGameContent;
    }

    public void setBetGameContent(String betGameContent) {
        this.betGameContent = betGameContent;
    }

    public Integer getIsDan() {
        return isDan;
    }

    public void setIsDan(Integer isDan) {
        this.isDan = isDan;
    }

    public OrderMatchZQBO getOrderMatchZQBO() {
        return orderMatchZQBO;
    }

    public void setOrderMatchZQBO(OrderMatchZQBO orderMatchZQBO) {
        this.orderMatchZQBO = orderMatchZQBO;
    }

    public OrderMatchLZCBO getOrderMatchLZCBO() {
        return orderMatchLZCBO;
    }

    public void setOrderMatchLZCBO(OrderMatchLZCBO orderMatchLZCBO) {
        this.orderMatchLZCBO = orderMatchLZCBO;
    }

    public OrderMatchLQBO getOrderMatchLQBO() {
        return orderMatchLQBO;
    }

    public void setOrderMatchLQBO(OrderMatchLQBO orderMatchLQBO) {
        this.orderMatchLQBO = orderMatchLQBO;
    }
    
	public OrderMatchBJBO getOrderMatchBJBO() {
		return orderMatchBJBO;
	}

	public void setOrderMatchBJBO(OrderMatchBJBO orderMatchBJBO) {
		this.orderMatchBJBO = orderMatchBJBO;
	}

	public Integer getIsChooseMatchInfo() {
        return isChooseMatchInfo;
    }

    public void setIsChooseMatchInfo(Integer isChooseMatchInfo) {
        this.isChooseMatchInfo = isChooseMatchInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMatchShortName() {
        return matchShortName;
    }

    public void setMatchShortName(String matchShortName) {
        this.matchShortName = matchShortName;
    }

    public String getHomeLogo() {
        return homeLogo;
    }

    public void setHomeLogo(String homeLogo) {
        this.homeLogo = homeLogo;
    }

    public String getGuestLogo() {
        return guestLogo;
    }

    public void setGuestLogo(String guestLogo) {
        this.guestLogo = guestLogo;
    }

    public List<BetContentBO> getBetContentBOs() {
        return betContentBOs;
    }

    public void setBetContentBOs(List<BetContentBO> betContentBOs) {
        this.betContentBOs = betContentBOs;
    }

    public Integer getCaiGuoStatus() {
        return caiGuoStatus;
    }

    public void setCaiGuoStatus(Integer caiGuoStatus) {
        this.caiGuoStatus = caiGuoStatus;
    }
}
