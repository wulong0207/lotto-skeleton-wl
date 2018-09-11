package com.hhly.skeleton.activity.bo;

import java.util.List;
import java.util.Objects;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.MathUtil;

@SuppressWarnings("serial")
public class ActivityAwardBO  extends BaseBO { 
	/***
	 * 官方加奖的金额
	 */
	private Double officialBonus;
	/**
	 * 本站加奖的金额
	 */
	private Double localBonus;
	/**
	 * 红包编号
	 */
	private String redCode;
	/**
	 * 合买信息
	 */
	private List<OrderGroupContentBO> groupList ;
	
	
	public List<OrderGroupContentBO> getGroupList() {
		return groupList;
	}
	public void setGroupList(List<OrderGroupContentBO> groupList) {
		this.groupList = groupList;
	}
	public Double getOfficialBonus() {
		return officialBonus;
	}
	public void setOfficialBonus(Double officialBonus) {
		this.officialBonus = officialBonus;
	}
	public Double getLocalBonus() {
		return localBonus;
	}
	public void setLocalBonus(Double localBonus) {
		this.localBonus = localBonus;
	}
	public String getRedCode() {
		return redCode;
	}
	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}
	public String toString(){
		return "官方加奖的金额"+officialBonus+"本站加奖的金额"+localBonus+"红包编号"+redCode;
	}
	/**
	 * 信息赋值，将金额相加
	 */
	public	void setAwardBo(ActivityAwardBO awardBo){
		if(awardBo!=null){
			if(awardBo.getLocalBonus()!=null){
				this.localBonus=this.localBonus==null?awardBo.getLocalBonus():MathUtil.add(this.getLocalBonus(), awardBo.getLocalBonus());
			}
			if(awardBo.getOfficialBonus()!=null){
				this.officialBonus=this.officialBonus==null?awardBo.getOfficialBonus(): MathUtil.add(this.getOfficialBonus(), awardBo.getOfficialBonus());
			}
			String reds =  this.getRedCode();
			if(this.getRedCode()!=null){
				reds=awardBo.getRedCode()==null?reds:this.getRedCode()+","+awardBo.getRedCode();
			}else{
				reds=awardBo.getRedCode()==null?reds:awardBo.getRedCode();
			}
			this.redCode = reds;
			if(awardBo.getGroupList()!=null){
				if(this.groupList==null){
					this.groupList = awardBo.getGroupList();
				}else{
					for(OrderGroupContentBO gropBO:groupList){
						for(int i=0;i< awardBo.getGroupList().size();i++){
							OrderGroupContentBO outgropBO=awardBo.getGroupList().get(i);
							if(Objects.equals(gropBO.getId(),outgropBO.getId())){
								if(outgropBO.getAddedBonus()!=null){
									gropBO.setAddedBonus(gropBO.getAddedBonus()==null?outgropBO.getAddedBonus():MathUtil.add(outgropBO.getAddedBonus(), gropBO.getAddedBonus()));
								}
								if(outgropBO.getSiteAddedBonus()!=null){
									gropBO.setSiteAddedBonus(gropBO.getSiteAddedBonus()==null?outgropBO.getSiteAddedBonus(): MathUtil.add(outgropBO.getSiteAddedBonus(), gropBO.getSiteAddedBonus()));
								}
								String redCodes =  gropBO.getRedCode();
								if(gropBO.getRedCode()!=null){
									redCodes=outgropBO.getRedCode()==null?redCodes:gropBO.getRedCode()+","+outgropBO.getRedCode();
								}else{
									redCodes=outgropBO.getRedCode()==null?redCodes:outgropBO.getRedCode();
								}	
								gropBO.setRedCode(redCodes);
							}
						}
					}
				}
			}
		}
	}
}
