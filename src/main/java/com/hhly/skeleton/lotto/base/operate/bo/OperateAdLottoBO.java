package com.hhly.skeleton.lotto.base.operate.bo;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc   广告信息
 * @author lidecheng
 * @date 2017年3月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateAdLottoBO extends BaseBO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6113513949578611763L;

	private Integer id;
	/**
	 * 广告标题
	 */
    private String advTitle;


   /**
    * 广告图位置:1顶部横幅广告;2中部横幅广告;3左右侧边栏对联广告;4右下角广告;5弹层广告;6专题广告;7焦点图广告;8全屏背景图广告;9用户中心我的彩票广告位;10方案详情广告位;11订单结果中部横幅;12订单结果右侧上;13订单结果右侧下14图片广告
    */
    private Short position;

    /**
     * 广告图位置编号
     */
    private String positionCode;

    /**
     * 广告图位置说明
     */
    private String positionInfo;

    /**
     * 打开方式:0:_blank;1:_self 
     */
    private Short target;

    /**
     * 广告链接
     */
    private String adUrl;

    /**
     * 广告图地址
     */
    private String adImgUrl;
    
    /**
     * 广告可见次数:1每次刷新;2每小时;3每天;4每周;5可见一次
     */
    private Short display;
    
    private Integer lotteryCode;
    /**
     * 跳转类型 
     */
    private Short jumpType;
	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Short getDisplay() {
		return display;
	}

	public void setDisplay(Short display) {
		this.display = display;
	}

	public String getAdvTitle() {
		return advTitle;
	}

	public void setAdvTitle(String advTitle) {
		this.advTitle = advTitle;
	}

	public Short getPosition() {
		return position;
	}

	public void setPosition(Short position) {
		this.position = position;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public Short getJumpType() {
		return jumpType;
	}

	public void setJumpType(Short jumpType) {
		this.jumpType = jumpType;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getPositionInfo() {
		return positionInfo;
	}

	public void setPositionInfo(String positionInfo) {
		this.positionInfo = positionInfo;
	}

	public Short getTarget() {
		return target;
	}

	public void setTarget(Short target) {
		this.target = target;
	}

	public String getAdUrl() {
		return adUrl;
	}

	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}

	public String getAdImgUrl() {
		return adImgUrl;
	}

	public void setAdImgUrl(String adImgUrl) {
		this.adImgUrl = adImgUrl;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}