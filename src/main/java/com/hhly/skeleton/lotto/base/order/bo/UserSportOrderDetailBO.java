package com.hhly.skeleton.lotto.base.order.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 用户数字彩方案明细
 * @author huangb
 * @date 2017年4月10日
 * @company 益彩网络
 * @version v1.0
 */
public class UserSportOrderDetailBO extends BaseBO {

	private static final long serialVersionUID = 7621567527052358716L;
	
	/**
	 * 彩种
	 */
	private Integer lotteryCode;
	
	/**
	 * 彩期
	 */
	private String lotteryIssue;
	/**
	 * 数字彩，低频彩所选的投注号码；若为上传，需要保存选好方式。 竞彩：存放投注内容字符串
	 */
	private String planContent;
	
    /**
     * 过关方式
     */
    private String passway;
    
	/**
	 * 单个方案的购买倍数
	 */
	private Integer multiple;
	
	/**
	 * 子玩法名称
	 */
	private String playIntro;
	
	/**
	 * 子玩法彩种编码
	 */
	private Integer lotteryChildCode;
	
	/**
	 * 中奖金额
	 */
	private Double preBonus;
	
	/**
	 * 竞技彩赛事详情
	 */
	private List<OrderMatchInfoBO> OrderMatchInfoBOList;

	public String getPlanContent() {
		return planContent;
	}

	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}
	
    public String getPassway() {
    	if(planContent.indexOf("^") > -1 && planContent.lastIndexOf("^") > -1)
    		return planContent.substring(planContent.indexOf("^") + 1, planContent.lastIndexOf("^"));
        return passway;
    }

	public void setPassway(String passway) {
		this.passway = passway;
	}

	public Integer getMultiple() {
		return multiple;
	}

	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

	public String getPlayIntro() {
		return playIntro;
	}

	public void setPlayIntro(String playIntro) {
		this.playIntro = playIntro;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public Double getPreBonus() {
		return preBonus;
	}

	public void setPreBonus(Double preBonus) {
		this.preBonus = preBonus;
	}

	public List<OrderMatchInfoBO> getOrderMatchInfoBOList() {
		return OrderMatchInfoBOList;
	}

	public void setOrderMatchInfoBOList(List<OrderMatchInfoBO> orderMatchInfoBOList) {
		OrderMatchInfoBOList = orderMatchInfoBOList;
	}	
}
