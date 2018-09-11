package com.hhly.skeleton.cms.lotterymgr.vo;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.Min;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.BaseVO;

@SuppressWarnings("serial")
public class LotteryBettingMulCmsVO extends BaseVO {

	private Integer id;

	private Integer lotteryCode;

	@Group({ ADD, UPD })
	@Min(value = 1, msg = "注数")
	private Integer bettindNum;

	@Group({ ADD, UPD })
	@Min(value = 1, msg = "倍数")
	private Integer multipleNum;

	@Group({ ADD, UPD })
	@NotNull(msg = "单式截止时间")
	private Integer endTime;
	// 截止时间
	private Long countdown;

	public LotteryBettingMulCmsVO() {
	}

	/**
	 * @param lotteryCode
	 *            彩种编号
	 */
	public LotteryBettingMulCmsVO(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public LotteryBettingMulCmsVO(Integer lotteryCode, Long countdown) {
		this(lotteryCode);
		this.countdown = countdown;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getCountdown() {
		return countdown;
	}

	public void setCountdown(Long countdown) {
		this.countdown = countdown;
	}

	public Integer getBettindNum() {
		return bettindNum;
	}

	public void setBettindNum(Integer bettindNum) {
		this.bettindNum = bettindNum;
	}

	public Integer getMultipleNum() {
		return multipleNum;
	}

	public void setMultipleNum(Integer multipleNum) {
		this.multipleNum = multipleNum;
	}

	public Integer getEndTime() {
		return endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }


}