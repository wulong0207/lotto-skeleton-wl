package com.hhly.skeleton.draw.home.vo;

import java.util.List;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc 开奖主页查询最新开奖彩种
 * @author huangchengfang1219
 * @date 2017年10月11日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class DrawHomeLotteryIssueVO extends BaseVO {

	private static final long serialVersionUID = 8297010400473822629L;

	private Integer lotteryCategory;

	private Integer lotteryCode;

	private List<Integer> lotteryCodeList;

	public Integer getLotteryCategory() {
		return lotteryCategory;
	}

	public void setLotteryCategory(Integer lotteryCategory) {
		this.lotteryCategory = lotteryCategory;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public List<Integer> getLotteryCodeList() {
		return lotteryCodeList;
	}

	public void setLotteryCodeList(List<Integer> lotteryCodeList) {
		this.lotteryCodeList = lotteryCodeList;
	}

}
