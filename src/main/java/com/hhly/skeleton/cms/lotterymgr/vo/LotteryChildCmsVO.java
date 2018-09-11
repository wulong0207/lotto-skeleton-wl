package com.hhly.skeleton.cms.lotterymgr.vo;

import java.util.List;
import java.util.Set;

import com.hhly.skeleton.base.vo.BaseVO;

@SuppressWarnings("serial")
public class LotteryChildCmsVO extends BaseVO {

	private Integer id;

	private Integer lotteryChildCode;

	/**
	 * 彩种id
	 */
	private Integer lotteryId;
	/**
	 * 彩种code
	 */
	private Integer lotteryCode;
	
	/**
	 * 彩种集合,以,隔开
	 */
	private List<Integer> lotteryCodeList;

	private String childName;

	private Short saleStatus;

	// 多个子玩法
	private Set<String> lotteryChildrenCode;


	public Integer getLotteryId() {
		return lotteryId;
	}

	public void setLotteryId(Integer lotteryId) {
		this.lotteryId = lotteryId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	

	public Integer getLotteryChildCode() {
        return lotteryChildCode;
    }

    public void setLotteryChildCode(Integer lotteryChildCode) {
        this.lotteryChildCode = lotteryChildCode;
    }
    
	public List<Integer> getLotteryCodeList() {
		return lotteryCodeList;
	}

	public void setLotteryCodeList(List<Integer> lotteryCodeList) {
		this.lotteryCodeList = lotteryCodeList;
	}

	public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public Short getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(Short saleStatus) {
		this.saleStatus = saleStatus;
	}

	public Set<String> getLotteryChildrenCode() {
		return lotteryChildrenCode;
	}

	public void setLotteryChildrenCode(Set<String> lotteryChildrenCode) {
		this.lotteryChildrenCode = lotteryChildrenCode;
	}

	
}