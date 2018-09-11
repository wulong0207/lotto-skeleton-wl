package com.hhly.skeleton.lotto.base.sport.bo;

import java.util.Date;
import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 赔率BO
 * @author zhanglei
 *
 */
public class SPBO extends BaseBO{
	
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	/**
	 * 对阵ID
	 */
    private String matchid;
    /**
     * 球法ID
     */
    private String gameid;
    /**
     * sp内容,带格式     "胜,平,负,"
     */
    private String sp;
    /**
     * 更新时间
     */
    private Date updatetime;
    /**
     * 变化详情
     */
    private List<SPChangeBO> changeVOs;
    
    
	public List<SPChangeBO> getChangeVOs() {
		return changeVOs;
	}
	public void setChangeVOs(List<SPChangeBO> changeVOs) {
		this.changeVOs = changeVOs;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMatchid() {
		return matchid;
	}
	public void setMatchid(String matchid) {
		this.matchid = matchid;
	}
	public String getGameid() {
		return gameid;
	}
	public void setGameid(String gameid) {
		this.gameid = gameid;
	}
	public String getSp() {
		return sp;
	}
	public void setSp(String sp) {
		this.sp = sp;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("matchid", matchid)
				.append("gameid", gameid)
				.append("sp", sp)
				.append("updatetime", updatetime)
				.append("changeVOs", changeVOs)
				.toString();
	}
}
