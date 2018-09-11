package com.hhly.skeleton.cms.lotterymgr.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

/**
 * 彩种期号
 * 
 * @author HouXB
 *
 */
@SuppressWarnings("serial")
public class LotteryIssueCmsVO extends PageVO {

	/**
	 * 查询记录数(eg：查近8期)
	 */
	private int qryCount;

	private Short lotteryCategory;
	
	private Integer lotteryId;
	
	@Group("audit")
	@NotNull
	private Integer id;

	private Integer lotteryCode;

	private String issueCode;

	private String lotteryName;

	private Short currentIssue;

	private Short saleStatus;

	private Date officialEndTime;

	private Date lotteryTime;

	private Date saleTime;

	private Date saleEndTime;

	private Long salesAmount;

	private Long jackpotAmount;
	
	@Group("audit")
	@NotNull(msg="开奖号码")
	private String drawCode;
	
	private String drawCodeTest;

	private String drawDetail;

	private String createBy;

	private String modifyBy;

	private String remark;

	/**
	 * 是否最新开奖 0:否, 1:是
	 */
	private Integer issueLastest;
	/**
	 * 查询类型，0 预售期，1截止期
	 */
	private Integer type;
	

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public LotteryIssueCmsVO() {
	}

	/**
	 * @param lotteryCode
	 *            彩种
	 */
	public LotteryIssueCmsVO(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	/**
	 * @param lotteryCode
	 *            彩种
	 * @param qryCount
	 *            查询记录数
	 */
	public LotteryIssueCmsVO(Integer lotteryCode, int qryCount) {
		this(lotteryCode);
		this.qryCount = qryCount;
	}

	/**
	 * @param lotteryCode
	 *            彩种
	 * @param issueCode
	 *            彩期
	 */
	public LotteryIssueCmsVO(Integer lotteryCode, String issueCode) {
		this(lotteryCode);
		this.issueCode = issueCode;
	}
	
	/**
	 * @param lotteryCode
	 *            彩种
	 * @param currentIssue
	 *            是否当前期 0-否 1-是
	 */
	public LotteryIssueCmsVO(Integer lotteryCode, short currentIssue) {
		this(lotteryCode);
		this.currentIssue = currentIssue;
	}

	public Short getLotteryCategory() {
		return lotteryCategory;
	}

	public void setLotteryCategory(Short lotteryCategory) {
		this.lotteryCategory = lotteryCategory;
	}

	public int getQryCount() {
		return qryCount;
	}

	public void setQryCount(int qryCount) {
		this.qryCount = qryCount;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public Short getCurrentIssue() {
		return currentIssue;
	}

	public void setCurrentIssue(Short currentIssue) {
		this.currentIssue = currentIssue;
	}

	public Short getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(Short saleStatus) {
		this.saleStatus = saleStatus;
	}

	public Date getOfficialEndTime() {
		return officialEndTime;
	}

	public void setOfficialEndTime(Date officialEndTime) {
		this.officialEndTime = officialEndTime;
	}

	public Date getLotteryTime() {
		return lotteryTime;
	}

	public void setLotteryTime(Date lotteryTime) {
		this.lotteryTime = lotteryTime;
	}

	public Date getSaleTime() {
		return saleTime;
	}

	public void setSaleTime(Date saleTime) {
		this.saleTime = saleTime;
	}

	public Date getSaleEndTime() {
		return saleEndTime;
	}

	public void setSaleEndTime(Date saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	public Long getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(Long salesAmount) {
		this.salesAmount = salesAmount;
	}

	public Long getJackpotAmount() {
		return jackpotAmount;
	}

	public void setJackpotAmount(Long jackpotAmount) {
		this.jackpotAmount = jackpotAmount;
	}

	public String getDrawCode() {
		return drawCode;
	}

	public void setDrawCode(String drawCode) {
		this.drawCode = drawCode;
	}

	public String getDrawDetail() {
		return drawDetail;
	}

	public void setDrawDetail(String drawDetail) {
		this.drawDetail = drawDetail;
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

	public Integer getLotteryId() {
		return lotteryId;
	}

	public void setLotteryId(Integer lotteryId) {
		this.lotteryId = lotteryId;
	}

	public Integer getIssueLastest() {
		return issueLastest;
	}

	public void setIssueLastest(Integer issueLastest) {
		this.issueLastest = issueLastest;
	}

	/**
	 * @return the drawCodeTest
	 */
	public String getDrawCodeTest() {
		return drawCodeTest;
	}

	/**
	 * @param drawCodeTest the drawCodeTest to set
	 */
	public void setDrawCodeTest(String drawCodeTest) {
		this.drawCodeTest = drawCodeTest;
	}
}
