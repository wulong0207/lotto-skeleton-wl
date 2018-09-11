package com.hhly.skeleton.cms.operatemgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc    
 * @author  cheng chen
 * @date    2017年4月21日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OperateSoftwareVersionBO extends BaseBO {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 版本号
     */
    private Integer code;
    
	/**
	 * 版本名称
	 */
	private String name; 
	
	/**
	 * 移动端类型; 1:ios; 2:android;
	 */
	private Short type;	

    /**
     * 是否最新版本
     */
    private Short isnew;

    /**
     * 是否强制更新
     */
    private Short isupdate;
    
	/**
	 * 版本大小
	 */
	private String size;    

    /**
     * 版本更新说明
     */
    private String describe;

    /**
     * 下载地址
     */
    private String url;
    
    /**
     * 移动端访问地址
     */
    private String appUrl;

    /**
     * 备注
     */
    private String remark;

    /**
     * null
     */
    private String createBy;

    /**
     * null
     */
    private String modifyBy;

    /**
     * null
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * null
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;

	/**
	 * 渠道id
	 */
	private Integer channelId;
	
	/**
	 * APP功能隐藏板块，APP前端将不会展示
	 */
	private String hide;

	/**
	 * 购彩功能隐藏区域
	 */
	private String hideArea;
	
	/**
	 * 审核状态0:审核中;1已通过
	 */
	private Integer status;
	
	/**
	 * 购彩状态 0:已关闭; 1:已开启
	 */
	private Integer lottteryStatus;
	
	/**
	 * 是否与官方同步更新 0：否；1：是
	 */
	private Integer synOfficial;
	
	/**
	 * 审核开关备注
	 */
	private String switchRemark;
	/**
	 * 审核修改人
	 */
	private String switchModifyBy;
	/**
	 * 审核开关修改时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date switchModifyTime;
	
	/**
	 * 购彩状态，若所有购彩功能都屏蔽则为关闭状态，否则为开启状态
	 */
	private Integer lotteryStatus;
	
	private Integer parentChannelId;
	
	private Integer terminalPlatform;
	
	private String hideContent;
	
	private String channelName;
	
	/**
	 * operate_market_channel表中的app_url
	 */
	private String newAppUrl;
    
    /**
     * 主键ID
     * @return ID 主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键ID
     * @param id 主键ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 版本号
     * @return CODE 版本号
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 版本号
     * @param code 版本号
     */
    public void setCode(Integer code) {
        this.code = code;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	/**
     * 是否最新版本
     * @return ISNEW 是否最新版本
     */
    public Short getIsnew() {
        return isnew;
    }

    /**
     * 是否最新版本
     * @param isnew 是否最新版本
     */
    public void setIsnew(Short isnew) {
        this.isnew = isnew;
    }

    /**
     * 是否强制更新
     * @return ISUPDATE 是否强制更新
     */
    public Short getIsupdate() {
        return isupdate;
    }

    /**
     * 是否强制更新
     * @param isupdate 是否强制更新
     */
    public void setIsupdate(Short isupdate) {
        this.isupdate = isupdate;
    }

    public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	/**
     * 版本更新说明
     * @return DESCRIBE 版本更新说明
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 版本更新说明
     * @param describe 版本更新说明
     */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    /**
     * 下载地址
     * @return URL 下载地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 下载地址
     * @param url 下载地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    
    public String getAppUrl() {
		return appUrl;
	}

	public void setAppUrl(String appUrl) {
		this.appUrl = appUrl == null ? null : appUrl.trim();
	}

	/**
     * 备注
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * null
     * @return CREATE_BY null
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * null
     * @param createBy null
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * null
     * @return MODIFY_BY null
     */
    public String getModifyBy() {
        return modifyBy;
    }

    /**
     * null
     * @param modifyBy null
     */
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    /**
     * null
     * @return CREATE_TIME null
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * null
     * @param createTime null
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * null
     * @return MODIFY_TIME null
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * null
     * @param modifyTime null
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

	public String getHide() {
		return hide;
	}

	public void setHide(String hide) {
		this.hide = hide;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getLottteryStatus() {
		return lottteryStatus;
	}

	public void setLottteryStatus(Integer lottteryStatus) {
		this.lottteryStatus = lottteryStatus;
	}

	public Integer getSynOfficial() {
		return synOfficial;
	}

	public void setSynOfficial(Integer synOfficial) {
		this.synOfficial = synOfficial;
	}

	public String getSwitchRemark() {
		return switchRemark;
	}

	public void setSwitchRemark(String switchRemark) {
		this.switchRemark = switchRemark;
	}

	public String getSwitchModifyBy() {
		return switchModifyBy;
	}

	public void setSwitchModifyBy(String switchModifyBy) {
		this.switchModifyBy = switchModifyBy;
	}

	public Date getSwitchModifyTime() {
		return switchModifyTime;
	}

	public void setSwitchModifyTime(Date switchModifyTime) {
		this.switchModifyTime = switchModifyTime;
	}

	public Integer getLotteryStatus() {
		return lotteryStatus;
	}

	public void setLotteryStatus(Integer lotteryStatus) {
		this.lotteryStatus = lotteryStatus;
	}

	public String getHideContent() {
		return hideContent;
	}

	public void setHideContent(String hideContent) {
		this.hideContent = hideContent;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Integer getTerminalPlatform() {
		return terminalPlatform;
	}

	public void setTerminalPlatform(Integer terminalPlatform) {
		this.terminalPlatform = terminalPlatform;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public Integer getParentChannelId() {
		return parentChannelId;
	}

	public void setParentChannelId(Integer parentChannelId) {
		this.parentChannelId = parentChannelId;
	}

	public String getNewAppUrl() {
		return newAppUrl;
	}

	public void setNewAppUrl(String newAppUrl) {
		this.newAppUrl = newAppUrl;
	}

	public String getHideArea() {
		return hideArea;
	}

	public void setHideArea(String hideArea) {
		this.hideArea = hideArea;
	}
}