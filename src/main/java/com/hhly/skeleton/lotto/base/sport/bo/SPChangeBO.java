package com.hhly.skeleton.lotto.base.sport.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 赔率变化BO
 * @author zhanglei
 *
 */
public class SPChangeBO extends BaseBO{
	
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	 /**
     * 玩法ID
     */
    private String gameid;
    /**
     * 变化内容,带格式
     */
    private String changeStr;
    /**
     * 更新时间
     */
    private Date updatetime;
    
	public String getGameid() {
		return gameid;
	}
	public void setGameid(String gameid) {
		this.gameid = gameid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getChangeStr() {
		return changeStr;
	}
	public void setChangeStr(String changeStr) {
		this.changeStr = changeStr;
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
				.append("gameid", gameid)
				.append("changeStr", changeStr)
				.append("updatetime", updatetime)
				.toString();
	}
}
