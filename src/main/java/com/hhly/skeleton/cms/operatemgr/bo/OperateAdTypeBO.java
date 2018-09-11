package com.hhly.skeleton.cms.operatemgr.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class OperateAdTypeBO extends BaseBO {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 用户类型:关联表M_TYPE
     */
    private Long mTypeId;

    /**
     * 广告ID
     */
    private Long advId;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 市场渠道对象:关联OPERATE_MARKET_CHANNEL的channel_id，类型为varchar(20)
     */
    private String channelId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getmTypeId() {
		return mTypeId;
	}

	public void setmTypeId(Long mTypeId) {
		this.mTypeId = mTypeId;
	}

	public Long getAdvId() {
		return advId;
	}

	public void setAdvId(Long advId) {
		this.advId = advId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
}