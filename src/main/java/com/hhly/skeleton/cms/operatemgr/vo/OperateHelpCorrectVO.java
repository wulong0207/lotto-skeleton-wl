package com.hhly.skeleton.cms.operatemgr.vo;

import static com.hhly.skeleton.base.valid.GroupValue.UPD;

import java.util.Date;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;

/**
 * @desc
 * @author cheng chen
 * @date 2017年4月21日
 * @company 益彩网络科技公司
 * @version 1.0
 */

@SuppressWarnings("serial")
public class OperateHelpCorrectVO extends PageVO {
	
	/**
	 * 帮助意见id
	 */
	@Group({UPD})
	@NotNull(msg="主键")
	private Integer id;

	/**
	 * 来源
	 */
	private String sources;

	/**
	 * 处理状态:0未处理;1已经处理
	 */
	@Group({UPD})
	@NotNull(msg="状态")
	private Integer status;

	/**
	 * 开始创建时间
	 */
	private Date beginTime;

	/**
	 * 结束创建时间
	 * 
	 * @return
	 */
	private Date endTime;
	
	/**
	 * 创建人信息
	 */
	private String createBy;
	
	/**
	 * 修改人信息
	 */
	private String modifyBy;
	
	/**
	 * 备注
	 */
	private String remark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSources() {
		return sources;
	}

	public void setSources(String sources) {
		this.sources = sources;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
