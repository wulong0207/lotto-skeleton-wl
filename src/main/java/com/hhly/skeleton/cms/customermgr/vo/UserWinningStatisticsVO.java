package com.hhly.skeleton.cms.customermgr.vo;

import java.util.List;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.LenRange;
import com.hhly.skeleton.base.valid.MatchPattern;
import com.hhly.skeleton.base.valid.Pattern;
import com.hhly.skeleton.base.vo.PageVO;
/**
 * 
 * @desc 用户中奖信息
 * @author jiangwei
 * @date 2017年4月24日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class UserWinningStatisticsVO extends PageVO{
    
	private String accountName;
    
    @Group("search")
    @Pattern(value=MatchPattern.PHONE,msg="手机号码")
    private Long cusMobile;
    
    @Group("search")
    @Pattern(value=MatchPattern.MAIL,msg="邮箱")
    private String cusMail;
    
    private String nickName;
    
    @Group("search")
    @LenRange(min=15,max=18,msg = "身份证位数")
    private String idNum;
    
    private String actualName;
    
    //用于上传文件查询
    //查询类型
    private String type;
    //值
    private List<String> values;
    
    

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Long getCusMobile() {
		return cusMobile;
	}

	public void setCusMobile(Long cusMobile) {
		this.cusMobile = cusMobile;
	}

	public String getCusMail() {
		return cusMail;
	}

	public void setCusMail(String cusMail) {
		this.cusMail = cusMail;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getActualName() {
		return actualName;
	}

	public void setActualName(String actualName) {
		this.actualName = actualName;
	}
    
    
}