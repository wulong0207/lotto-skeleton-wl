package com.hhly.skeleton.cms.payment.vo;

import static com.hhly.skeleton.base.valid.GroupValue.UPD;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.LenRange;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.BaseVO;

@SuppressWarnings("serial")
public class PayBankLimitVO extends BaseVO {

	private Integer id;

	private Integer bankid;

	@NotNull(msg = "单笔限额(元)")
	@Group({ UPD })
	@LenRange(min = 1, max = 10, msg = "单笔限额(元)")
	private String limittime;

	@NotNull(msg = "每日限额(元)")
	@Group({ UPD })
	@LenRange(min = 1, max = 10, msg = "每日限额(元)")
	private String limitday;

	@NotNull(msg = "每月限额(元)")
	@Group({ UPD })
	@LenRange(min = 1, max = 10, msg = "每月限额(元)")
	private String limitmonth;

	//@NotNull(msg = "需要满足的条件")
	@Group({ UPD })
	@LenRange(min = 1, max = 50, msg = "需要满足的条件")
	private String condition;

	private String remark;
	
	//@NotNull(msg = "卡类型")
	@Group({ UPD })
	private Integer cardType;

	private Integer[] ids;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBankid() {
		return bankid;
	}

	public void setBankid(Integer bankid) {
		this.bankid = bankid;
	}

	public String getLimittime() {
		return limittime;
	}

	public void setLimittime(String limittime) {
		this.limittime = limittime;
	}

	public String getLimitday() {
		return limitday;
	}

	public void setLimitday(String limitday) {
		this.limitday = limitday;
	}

	public String getLimitmonth() {
		return limitmonth;
	}

	public void setLimitmonth(String limitmonth) {
		this.limitmonth = limitmonth;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getCardType() {
		return cardType;
	}

	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}

	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

}
