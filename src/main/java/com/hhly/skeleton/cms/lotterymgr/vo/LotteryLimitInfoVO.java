package com.hhly.skeleton.cms.lotterymgr.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

/**
 * @desc 彩种限号内容
 * @author huangb
 * @date 2017年2月14日
 * @company 益彩网络
 * @version v1.0
 */
public class LotteryLimitInfoVO extends PageVO {
	private static final long serialVersionUID = -9134728626879458512L;
	/**
	 * 增长ID
	 */
	private Integer id;
	/**
	 * 限号表关联id
	 */
	private Integer limitId;
	/**
	 * 限号内容
	 */
	@Group({ "add", "upd" })
	@NotNull(msg = "限号内容")
	private String limitContent;
	/**
	 * 状态；；0：禁用；1：启用
	 */
	@Group({ "add", "upd" })
	@NotNull(msg = "限号内容状态")
	private Short status;
	/**
	 * 彩种子玩法关联code
	 */
	@Group({ "add", "upd" })
	@NotNull(msg = "限号玩法")
	private Integer lotteryChildCode;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 创建时间
	 */
	private Date createTime;

	public LotteryLimitInfoVO() {
	}

	/**
	 * 构造方法
	 * 
	 * @param id
	 *            数据编号
	 */
	public LotteryLimitInfoVO(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLimitId() {
		return limitId;
	}

	public void setLimitId(Integer limitId) {
		this.limitId = limitId;
	}

	public String getLimitContent() {
		return limitContent;
	}

	public void setLimitContent(String limitContent) {
		this.limitContent = limitContent;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
