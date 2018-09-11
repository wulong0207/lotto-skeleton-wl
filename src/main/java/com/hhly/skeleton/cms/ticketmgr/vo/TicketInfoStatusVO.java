package com.hhly.skeleton.cms.ticketmgr.vo;

import java.util.Date;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;

import  static com.hhly.skeleton.base.valid.GroupValue.UPD;
import com.hhly.skeleton.base.vo.BaseVO;

@SuppressWarnings("serial")
public class TicketInfoStatusVO extends BaseVO {
	// 订单ID
	@Group(UPD)
	@NotNull(msg="订单ID")
	private String id;
	// 状态
	@Group(UPD)
	@NotNull(msg="订单状态")
	private Short status;
	// 修改人
	private String modifyBy;
	// 出票成功时间
	private Date comeOutTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getComeOutTime() {
		return comeOutTime;
	}

	public void setComeOutTime(Date comeOutTime) {
		this.comeOutTime = comeOutTime;
	}

}
