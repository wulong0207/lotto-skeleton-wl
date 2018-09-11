package com.hhly.skeleton.lotto.base.operate.vo;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

import java.util.List;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.valid.Size;
import com.hhly.skeleton.base.valid.Valid;
import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class OperateFastVO extends PageVO{
	/**
	 * 自增长主键ID
	 */
	@Group({UPD})
	@NotNull(msg="主键")
  private Long id;
	
	/**
	 * 运营详情的ids,一般用于批量删除运营详情
	 */
  private List<Long> infoIds;

  /**
   * 用作后台查询 id != idNotEqual;
   */
  private Long idNotEqual;
  /**
   * 发布编号
   */
  
  private String fastCode;

  /**
   * 发布平台:1WEB;2WAP;3ANDROID;4IOS
   */
	@Group({ADD,UPD})
	@NotNull(msg="发布平台")
  private Short platform;

  /**
   * 发布状态:0暂停发布;1待发布;2发布中;3发布结束
   */
	@Group({ADD,UPD})
	@NotNull(msg="发布状态")
  private Short status;
   /**
   * 模块页面:1.主站Web首页
   */
	@Group({ADD,UPD})
	@NotNull(msg="模块页面")
  private Short position;

  /**
   * 备注说明
   */
  private String fastDesc;

  /**
   * 上线时间
   */
	@Group({ADD,UPD})
	@NotNull(msg="上线时间")
  private String onlineTime;

  /**
   * 下线时间
   */
	@Group({ADD,UPD})
	@NotNull(msg="下线时间")
  private String offlineTime;

  /**
   * 创建人真实姓名
   */
  
  private String createBy;

  /**
   * 上线时间
   */
	@Group({ADD,UPD})
	@NotNull(msg="上线星期")
  private Short onlineWeek;

  /**
   * 下线时间
   */
	@Group({ADD,UPD})
	@NotNull(msg="下线星期")
  private Short offlineWeek;

  /**
   * 修改人真实姓名
   */
  
  private String modifyBy;
  
	private Short searchTimeType;
	private String startTime;
	private String endTime;
	private Short startWeek;
	private Short endWeek;
	/**
	 * 查询日期
	 */
	private String queryDate;
	
	@Group({ADD})
	@Valid
	@NotNull
	@Size(min=1,max=20)
	private List<OperateFastInfoVO> fastInfos;
	
	private Integer publishStatus;

	
	 /***
	   * 是否默认
	   */
	@Group({ADD,UPD})
	@NotNull(msg="是否默认")
	private Short isDefault;
	
	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;
	  
	public Short getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Short isDefault) {
		this.isDefault = isDefault;
	}

	public Integer getPublishStatus() {
		return publishStatus;
	}

	public void setPublishStatus(Integer publishStatus) {
		this.publishStatus = publishStatus;
	}

	public OperateFastVO() {}

	private OperateFastVO(Builder builder) {
		this.id=builder.id;
		this.idNotEqual = builder.idNotEqual;
		this.status = builder.status;
		this.platform = builder.platform;
	}

	public Short getStartWeek() {
		return startWeek;
	}

	public void setStartWeek(Short startWeek) {
		this.startWeek = startWeek;
	}

	public Short getEndWeek() {
		return endWeek;
	}

	public void setEndWeek(Short endWeek) {
		this.endWeek = endWeek;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Long> getInfoIds() {
		return infoIds;
	}

	public void setInfoIds(List<Long> infoIds) {
		this.infoIds = infoIds;
	}

	public Long getIdNotEqual() {
		return idNotEqual;
	}

	public void setIdNotEqual(Long idNotEqual) {
		this.idNotEqual = idNotEqual;
	}

	public String getFastCode() {
		return fastCode;
	}

	public void setFastCode(String fastCode) {
		this.fastCode = fastCode;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Short getPosition() {
		return position;
	}

	public void setPosition(Short position) {
		this.position = position;
	}

	public String getFastDesc() {
		return fastDesc;
	}

	public void setFastDesc(String fastDesc) {
		this.fastDesc = fastDesc;
	}

	public String getOnlineTime() {
		return onlineTime;
	}

	public void setOnlineTime(String onlineTime) {
		this.onlineTime = onlineTime;
	}

	public String getOfflineTime() {
		return offlineTime;
	}

	public void setOfflineTime(String offlineTime) {
		this.offlineTime = offlineTime;
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

	public Short getSearchTimeType() {
		return searchTimeType;
	}

	public void setSearchTimeType(Short searchTimeType) {
		this.searchTimeType = searchTimeType;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<OperateFastInfoVO> getFastInfos() {
		return fastInfos;
	}

	public void setFastInfos(List<OperateFastInfoVO> fastInfos) {
		this.fastInfos = fastInfos;
	}

	public static class Builder {
		private Long id;
		private Long idNotEqual;
		private Short status;
		private Short platform;

		public Builder id(Long id) {
			this.id = id;
			return this;
		}

		public Builder idNotEqual(Long idNotEqual) {
			this.idNotEqual = idNotEqual;
			return this;
		}

		public Builder status(Short status) {
			this.status = status;
			return this;
		}

		public Builder platform(Short platform) {
			this.platform = platform;
			return this;
		}

		public OperateFastVO build() {
			return new OperateFastVO(this);
		}
	}

	public Short getOnlineWeek() {
		return onlineWeek;
	}

	public void setOnlineWeek(Short onlineWeek) {
		this.onlineWeek = onlineWeek;
	}

	public Short getOfflineWeek() {
		return offlineWeek;
	}

	public void setOfflineWeek(Short offlineWeek) {
		this.offlineWeek = offlineWeek;
	}

	public String getQueryDate() {
		return queryDate;
	}

	public void setQueryDate(String queryDate) {
		this.queryDate = queryDate;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	
}