package com.hhly.skeleton.lotto.base.sport.vo;

import java.util.List;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * 竞技彩最新数据查询
 *
 * @author huangchengfang1219
 * @date 2018年8月7日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SportNewestDataVO extends BaseVO{

	private static final long serialVersionUID = 5828269286195050956L;

	private Integer lotteryCode;
	
	private List<String> issueCodes;

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public List<String> getIssueCodes() {
		return issueCodes;
	}

	public void setIssueCodes(List<String> issueCodes) {
		this.issueCodes = issueCodes;
	}
	
}
