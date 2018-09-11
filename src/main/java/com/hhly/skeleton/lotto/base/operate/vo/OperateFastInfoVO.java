package com.hhly.skeleton.lotto.base.operate.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;
import java.util.List;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

public class OperateFastInfoVO extends PageVO{

	private static final long serialVersionUID = 6532783432261838842L;

	/**
	 * 自增长主键ID
	 */
	@Group({UPD})
	@NotNull
  private Long id;

  /**
   * 栏目ID,关联operateFast的id
   */
	@Group({UPD})
	@NotNull(msg="方案编号")
  private Long fastId;

  /**
   * 彩种ID
   */
	@Group({ADD,UPD})
	@NotNull(msg="彩种编号")
  private Integer typeId;


  /**
   * 彩种类型ID:1：数字彩；2：高频彩；3：竞技彩
   */
	@Group({ADD,UPD})
	@NotNull(msg="彩种类型")
  private Byte categoryId;


  /**
   * 页签别名
   */
  private String fastAlias;

  /**
   * 页签链接
   */
  private String fastUrl;

  /**
   * 默认选中:0否;1是
   */
  private Byte fastSelected;
	
  /**
   * 默认倍数
   */
	@Group({ADD,UPD})
	@NotNull(msg="默认倍数")
  private Integer multiple;

  /**
   * 打开方式
   */
  private Date offlineTime;

  /**
   * 运营图标:0无;1新;2热;3加奖;4其他
   */
	@Group({ADD,UPD})
	@NotNull(msg="运营图标")
  private Byte icon;

  /**
   * 打开方式:0:_blank;1:_self;
   */
	@Group({ADD,UPD})
	@NotNull(msg="打开方式")
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
  
  private List<Long> ids;

  @SuppressWarnings("unused")
  private OperateFastInfoVO() {}

  public OperateFastInfoVO(Builder builder) {
	    this.ids = builder.ids;
  }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFastId() {
		return fastId;
	}

	public OperateFastInfoVO setFastId(Long fastId) {
		this.fastId = fastId;
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

	public String getFastAlias() {
		return fastAlias;
	}

	public void setFastAlias(String fastAlias) {
		this.fastAlias = fastAlias;
	}

	public String getFastUrl() {
		return fastUrl;
	}

	public void setFastUrl(String fastUrl) {
		this.fastUrl = fastUrl;
	}

	public Byte getFastSelected() {
		return fastSelected;
	}

	public void setFastSelected(Byte fastSelected) {
		this.fastSelected = fastSelected;
	}

	public Integer getMultiple() {
		return multiple;
	}

	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
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

	public OperateFastInfoVO setOrderId(Integer orderId) {
		this.orderId = orderId;
		return this;
	}

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public static class Builder {
		private List<Long> ids;

		public Builder ids(List<Long> ids) {
			this.ids = ids;
			return this;
		}

		public OperateFastInfoVO build() {
			return new OperateFastInfoVO(this);
		}
	}

}