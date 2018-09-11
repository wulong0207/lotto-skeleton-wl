package com.hhly.skeleton.cms.operatemgr.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.valid.Size;
import com.hhly.skeleton.base.valid.Valid;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;
import java.util.List;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

public class OperateLotteryVO extends PageVO{
	
	private static final long serialVersionUID = 4525410059258784411L;
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
  //@JsonIgnore
  private String releaseCode;

  /**
   * 发布平台:1WEB;2WAP;3ANDROID;4IOS
   */
	@Group({ADD,UPD})
	@NotNull(msg="发布平台")
  private Byte platform;

  /**
   * 状态:1启用 2禁用
   */
	@Group({ADD,UPD})
	@NotNull(msg="状态")
  private Byte status;

  /**
   * 备注说明
   */
  private String lotteryDesc;

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
  //@JsonIgnore
  private String createBy;

  /**
   * 修改人真实姓名
   */
  //@JsonIgnore
  private String modifyBy;
  
  
	private Short searchTimeType;
	private Date startTime;
	private Date endTime;
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
	private Short startWeek;
	private Short endWeek;
	@Group({ADD})
	@Valid
	@NotNull
	@Size(min=1,max=20,msg="彩种显示信息条数必须{0}和{1}之间")
	private List<OperateLotteryInfoVO> lotteryInfos;
	
	
	private Integer publishStatus;
	 /***
	   * 是否默认
	   */
	@Group({ADD,UPD})
	@NotNull(msg="是否默认")
	private Short isDefault;
	  
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

	private OperateLotteryVO() {}

	private OperateLotteryVO(Builder builder) {
		this.id=builder.id;
		this.idNotEqual = builder.idNotEqual;
		this.status = builder.status;
		this.platform = builder.platform;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReleaseCode() {
		return releaseCode;
	}

	public void setReleaseCode(String releaseCode) {
		this.releaseCode = releaseCode;
	}

	public Byte getPlatform() {
		return platform;
	}

	public void setPlatform(Byte platform) {
		this.platform = platform;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public String getLotteryDesc() {
		return lotteryDesc;
	}

	public void setLotteryDesc(String lotteryDesc) {
		this.lotteryDesc = lotteryDesc;
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

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<OperateLotteryInfoVO> getLotteryInfos() {
		return lotteryInfos;
	}

	public void setLotteryInfos(List<OperateLotteryInfoVO> lotteryInfos) {
		this.lotteryInfos = lotteryInfos;
	}

	public Long getIdNotEqual() {
		return idNotEqual;
	}

	public void setIdNotEqual(Long idNotEqual) {
		this.idNotEqual = idNotEqual;
	}

	public List<Long> getInfoIds() {
		return infoIds;
	}

	public void setInfoIds(List<Long> infoIds) {
		this.infoIds = infoIds;
	}
	
	public static class Builder {
		private Long id;
		private Long idNotEqual;
		private Byte status;
		private Byte platform;

		public Builder id(Long id) {
			this.id = id;
			return this;
		}

		public Builder idNotEqual(Long idNotEqual) {
			this.idNotEqual = idNotEqual;
			return this;
		}

		public Builder status(Byte status) {
			this.status = status;
			return this;
		}

		public Builder platform(Byte platform) {
			this.platform = platform;
			return this;
		}

		public OperateLotteryVO build() {
			return new OperateLotteryVO(this);
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
}