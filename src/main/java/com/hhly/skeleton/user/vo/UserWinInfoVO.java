
package com.hhly.skeleton.user.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc    
 * @author  cheng chen
 * @date    2017年9月23日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class UserWinInfoVO extends PageVO {
	
	private static final long serialVersionUID = -3533034434725193827L;

	private Integer userId;

	private Integer lotteryCode;

	private String lotteryCodes;

	private List<String> codeList = new ArrayList<>();

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getLotteryCodes() {
		return lotteryCodes;
	}

	public void setLotteryCodes(String lotteryCodes) {
		this.lotteryCodes = lotteryCodes;
	}

	public List<String> getCodeList() {
		return codeList;
	}

	public void setCodeList(List<String> codeList) {
		this.codeList = codeList;
	}
}
