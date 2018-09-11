package com.hhly.skeleton.lotto.base.trend.bo;

import java.util.List;

import com.hhly.skeleton.lotto.base.trend.vo.NumTimeVo;

@SuppressWarnings("serial")
public class X115ColdHotOmitBo extends ColdHotOmitBo {
	
	
	//遗漏
	private List<NumTimeVo> qx3List;
	private List<NumTimeVo> r5List;
	private List<NumTimeVo> r7List;
	private List<NumTimeVo> r8List;


	public List<NumTimeVo> getQx3List() {
		return qx3List;
	}

	public void setQx3List(List<NumTimeVo> qx3List) {
		this.qx3List = qx3List;
	}

	public List<NumTimeVo> getR5List() {
		return r5List;
	}

	public void setR5List(List<NumTimeVo> r5List) {
		this.r5List = r5List;
	}

	public List<NumTimeVo> getR7List() {
		return r7List;
	}

	public void setR7List(List<NumTimeVo> r7List) {
		this.r7List = r7List;
	}

	public List<NumTimeVo> getR8List() {
		return r8List;
	}

	public void setR8List(List<NumTimeVo> r8List) {
		this.r8List = r8List;
	}

}
