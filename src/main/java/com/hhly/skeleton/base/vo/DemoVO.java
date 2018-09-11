package com.hhly.skeleton.base.vo;

import java.util.List;

import com.hhly.skeleton.base.valid.Valid;
import com.hhly.skeleton.cms.dicmgr.vo.DicDataVO;

@SuppressWarnings("serial")
@Valid
public class DemoVO extends BaseVO{

	
//	@NotNull(msg="用户名")
//    @LenRange(min=6,max=15,msg="用户名")
//	@Pattern(value=MatchPattern.MAIL,msg = "用户名(必须是邮箱)")
	private String userName;
	
	private String password;
	
//	@Group({"upd"})
//	@NotNull
	private int age;
	
//	@Valid
	private DicDataVO dicDataVO;
	
//	@Size(min=1,max=2,msg="nubers的合法个数为{0}到{1}")
	private List<Integer> numbers;
	
	@Valid
	private List<DicDataVO> dics;
	
	public DicDataVO getDicDataVO() {
		return dicDataVO;
	}
	public void setDicDataVO(DicDataVO dicDataVO) {
		this.dicDataVO = dicDataVO;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Integer> getNumbers() {
		return numbers;
	}
	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}
	public List<DicDataVO> getDics() {
		return dics;
	}
	public void setDics(List<DicDataVO> dics) {
		this.dics = dics;
	}
	
}
