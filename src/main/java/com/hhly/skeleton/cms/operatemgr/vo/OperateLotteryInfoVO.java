package com.hhly.skeleton.cms.operatemgr.vo;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

import java.util.Date;
import java.util.List;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;

public class OperateLotteryInfoVO extends PageVO {
	private static final long serialVersionUID = -8772370817118402770L;

	/**
	 * 自增长主键ID
	 */
	@Group({ UPD })
	@NotNull
	private Long id;

	/**
	 * 后于sql作 in (id1,id2,..)条件
	 */
	private List<Long> ids;

	/**
	 * 栏目ID,关联operateLottery的id
	 */
	@Group({ UPD })
	@NotNull(msg = "方案编号")
	private Long lotteryId;

	/**
	 * 彩种ID
	 */
	@Group({ ADD, UPD })
	@NotNull(msg = "彩种编号")
	private Integer typeId;

	/**
	 * 彩种类型ID:1：数字彩；2：高频彩；3：竞技彩
	 */
	@Group({ ADD, UPD })
	@NotNull(msg = "彩种类型")
	private Byte categoryId;

	/**
	 * 彩种别名
	 */
	@Group({ ADD, UPD })
	@NotNull(msg = "彩种别名")
	private String typeAlias;

	/**
	 * 彩种链接
	 */
	private String typeUrl;

	/**
	 * 是否显示:0否;1是;2设定时间下线
	 */
	@Group({ ADD, UPD })
	@NotNull(msg = "显示方式")
	private Byte display;

	/**
	 * 下线时间
	 */
	private Date offlineTime;

	/**
	 * 运营图标:0无;1新;2热;3加奖;4其他
	 */
	@Group({ ADD, UPD })
	@NotNull(msg = "运营图标")
	private Byte icon;

	/**
	 * 打开方式:0:_blank;1:_self;
	 */
	@Group({ ADD, UPD })
	@NotNull(msg = "打开方式")
	private Byte target;

	/**
	 * 运营文案
	 */
	private String typeKey;

	/**
	 * 文案链接
	 */
	private String typeKeyUrl;

	/**
	 * 排序
	 */
	private Integer orderId;

	/**
	 * 颜色
	 */
	private String color;

	private String url;
	
	/**
	 * 子玩法
	 */
	private Integer lotteryChildCode;
	
	/**
	 * 彩种描述
	 */
	private String lotteryDescribe;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@SuppressWarnings("unused")
	private OperateLotteryInfoVO() {
	}

	public OperateLotteryInfoVO(Builder builder) {
		this.ids = builder.ids;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLotteryId() {
		return lotteryId;
	}

	public OperateLotteryInfoVO setLotteryId(Long lotteryId) {
		this.lotteryId = lotteryId;
		return this;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Byte getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Byte categoryId) {
		this.categoryId = categoryId;
	}

	public String getTypeAlias() {
		return typeAlias;
	}

	public void setTypeAlias(String typeAlias) {
		this.typeAlias = typeAlias;
	}

	public String getTypeUrl() {
		return typeUrl;
	}

	public void setTypeUrl(String typeUrl) {
		this.typeUrl = typeUrl;
	}

	public Byte getDisplay() {
		return display;
	}

	public void setDisplay(Byte display) {
		this.display = display;
	}

	public Date getOfflineTime() {
		return offlineTime;
	}

	public void setOfflineTime(Date offlineTime) {
		this.offlineTime = offlineTime;
	}

	public Byte getIcon() {
		return icon;
	}

	public void setIcon(Byte icon) {
		this.icon = icon;
	}

	public Byte getTarget() {
		return target;
	}

	public void setTarget(Byte target) {
		this.target = target;
	}

	public String getTypeKey() {
		return typeKey;
	}

	public void setTypeKey(String typeKey) {
		this.typeKey = typeKey;
	}

	public String getTypeKeyUrl() {
		return typeKeyUrl;
	}

	public void setTypeKeyUrl(String typeKeyUrl) {
		this.typeKeyUrl = typeKeyUrl;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public OperateLotteryInfoVO setOrderId(Integer orderId) {
		this.orderId = orderId;
		return this;
	}

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public String getLotteryDescribe() {
		return lotteryDescribe;
	}

	public void setLotteryDescribe(String lotteryDescribe) {
		this.lotteryDescribe = lotteryDescribe;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public static class Builder {
		private List<Long> ids;

		public Builder ids(List<Long> ids) {
			this.ids = ids;
			return this;
		}

		public OperateLotteryInfoVO build() {
			return new OperateLotteryInfoVO(this);
		}
	}

}