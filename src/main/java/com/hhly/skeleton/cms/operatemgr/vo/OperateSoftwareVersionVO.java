package com.hhly.skeleton.cms.operatemgr.vo;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

import java.util.Date;
import java.util.List;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;


/**
 * @desc    
 * @author  cheng chen
 * @date    2017年4月21日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OperateSoftwareVersionVO extends PageVO {
	
    /**
     * 主键ID
     */
	@Group({UPD})
	@NotNull(msg = "主键")
    private Integer id;

    /**
     * 版本号
     */
	@Group({ADD,UPD})
	@NotNull(msg = "版本号")
    private Integer code;
	
	/**
	 * 版本名称
	 */
	private String name;
	
	/**
	 * 移动端类型; 1:ios; 2:android;
	 */
	@Group({ADD,UPD})
	@NotNull(msg = "类型")	
	private Short type;

    /**
     * 是否最新版本
     */
	@Group({ADD,UPD})
	@NotNull(msg = "是否最新版本")
    private Short isnew;

    /**
     * 是否强制更新
     */
	@Group({ADD,UPD})
	@NotNull(msg = "是否最新版本")	
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
	@Group({ADD,UPD})
	@NotNull(msg = "下载地址")    
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
	 * 开始创建时间
	 */
	private Date beginTime;

	/**
	 * 结束创建时间
	 * 
	 * @return
	 */
	private Date endTime;    


	/**
	 * 渠道id
	 */
	@Group({ADD,UPD})
	@NotNull(msg = "渠道Id")   
	private Integer channelId;
	
	/**
	 * APP功能隐藏板块，APP前端将不会展示
	 */
	private String hide;

	/**
	 * 购彩板块隐藏区域，如"深圳,广西"
	 */
	private String hideArea;
	
	/**
	 * 审核状态0:审核中;1已通过
	 */
	private Integer status;
	
	/**
	 * 用于查询 id !=xxx
	 */
	private Integer negativeId;
	
	/**
	 * 购彩状态 0:已关闭; 1:已开启
	 */
	private Integer lotteryStatus;
	
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
	private Date switchModifyTime;
	
	/**
	 * 判断版本所是否有重新上传
	 */
	private boolean reupload;
	
	/**
	 * "是否强制更新"或"版本更新说明"或"是否为最新"有变化
	 */
	private boolean changeUpdateOrNewOrDesc;
	
	/**
	 * '是否最新版本'是否有变化
	 */
	private boolean changeIsNew;
	
	/**
	 * 要排除的id
	 */
	private Integer nagativeId;
	
	 /**
	 * 当重新上传包时，用来记录原来的版本号，以便删除版本记录
	 */
	private Integer oldCode;
	
	private List<Short> channelIds;
	
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
    
    
    public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
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

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
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

	public Integer getNegativeId() {
		return negativeId;
	}

	public void setNegativeId(Integer negativeId) {
		this.negativeId = negativeId;
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

	public boolean isReupload() {
		return reupload;
	}

	public void setReupload(boolean reupload) {
		this.reupload = reupload;
	}

	public boolean isChangeUpdateOrNewOrDesc() {
		return changeUpdateOrNewOrDesc;
	}

	public void setChangeUpdateOrNewOrDesc(boolean changeUpdateOrNewOrDesc) {
		this.changeUpdateOrNewOrDesc = changeUpdateOrNewOrDesc;
	}

	public boolean isChangeIsNew() {
		return changeIsNew;
	}

	public void setChangeIsNew(boolean changeIsNew) {
		this.changeIsNew = changeIsNew;
	}

	public Integer getNagativeId() {
		return nagativeId;
	}

	public void setNagativeId(Integer nagativeId) {
		this.nagativeId = nagativeId;
	}

	public Integer getOldCode() {
		return oldCode;
	}

	public void setOldCode(Integer oldCode) {
		this.oldCode = oldCode;
	}

	public List<Short> getChannelIds() {
		return channelIds;
	}

	public void setChannelIds(List<Short> channelIds) {
		this.channelIds = channelIds;
	}

	public String getHideArea() {
		return hideArea;
	}

	public void setHideArea(String hideArea) {
		this.hideArea = hideArea;
	}
}