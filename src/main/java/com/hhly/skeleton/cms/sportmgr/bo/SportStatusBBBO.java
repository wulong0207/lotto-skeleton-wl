package com.hhly.skeleton.cms.sportmgr.bo;


import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;
/**
 * 竞彩篮球单场子玩法状态信息
 * @author longguoyou
 * @date 2017年4月6日
 * @compay 益彩网络科技有限公司
 */
public class SportStatusBBBO extends BaseBO{
    private static final long serialVersionUID = 155181075146279262L;
    private Long id;
    /**
     * 竞技彩对阵详情表ID
     */
    private Long sportAgainstInfoId;
    /**
     * 胜负玩法 1：正常销售；2：仅售过关；3：仅售单关；4：暂停销售
     */
    private Short statusWf;
    /**
     * 让分胜负玩法 1：正常销售；2：仅售过关；3：仅售单关；4：暂停销售
     */
    private Short statusLetWf;
    /**
     *大小分固定玩法  1：正常销售；2：仅售过关；3：仅售单关；4：暂停销售
     */
    private Short statusBigSmall;
    /**
     * 胜分差玩法 1：正常销售；2：仅售过关；3：仅售单关；4：暂停销售
     */
    private Short statusScoreWf;
    /**
     * 修改人
     */
    private String modifyBy;
    /**
     * 修改时间
     */
    private Date modifyTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 创建时间
     */
    private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSportAgainstInfoId() {
		return sportAgainstInfoId;
	}

	public void setSportAgainstInfoId(Long sportAgainstInfoId) {
		this.sportAgainstInfoId = sportAgainstInfoId;
	}

	public Short getStatusWf() {
		return statusWf;
	}

	public void setStatusWf(Short statusWf) {
		this.statusWf = statusWf;
	}

	public Short getStatusLetWf() {
		return statusLetWf;
	}

	public void setStatusLetWf(Short statusLetWf) {
		this.statusLetWf = statusLetWf;
	}

	public Short getStatusBigSmall() {
		return statusBigSmall;
	}

	public void setStatusBigSmall(Short statusBigSmall) {
		this.statusBigSmall = statusBigSmall;
	}

	public Short getStatusScoreWf() {
		return statusScoreWf;
	}

	public void setStatusScoreWf(Short statusScoreWf) {
		this.statusScoreWf = statusScoreWf;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
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
	@Override
	public String toString() {
		return "statusWf:"+statusWf+",statusLetWf:"+statusLetWf+",statusBigSmall:"+statusBigSmall+",statusScoreWf:"+statusScoreWf;
	}
}