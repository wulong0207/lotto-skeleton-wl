package com.hhly.skeleton.cms.operatemgr.vo;

import static com.hhly.skeleton.base.valid.GroupValue.DEL;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

import java.util.Date;

import com.hhly.skeleton.base.bo.UploadFileBO;
import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.LenRange;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class OperateImgVO extends PageVO{
    /**
     * 主键ID
     */
	@Group({UPD})
	@NotNull
    private Integer id;

    /**
     * 名称
     */
	@Group({UPD})
	@NotNull
	@LenRange(min=1,max=50)
    private String name;

    /**
     * 分组ID:0未分组;1广告图;2球队Logo
     */
	@Group({"move"})
	@NotNull
    private Integer groupid;

    /**
     * 目录路径
     */
    private String dir;

    /**
     * 分辨率
     */
    private String resolution;

    /**
     * 大小
     */
    private String sizes;

    /**
     * null
     */
    private String modifyBy;

    /**
     * null
     */
    private Date modifyTime;

    /**
     * null
     */
    private String createBy;

    /**
     * null
     */
    private Date updateTime;

    /**
     * null
     */
    private Date createTime;
    /**
     * 删除图片
     */
    @Group({DEL,"move"})
	@NotNull(msg="编号")
    private String ids;
    /**
     * 图片访问url
     */
    private String url;
    
    public OperateImgVO(){
    	
    }

    
	public OperateImgVO(UploadFileBO bo, Integer groupid, String createBy) {
		this.name = bo.getName();
		this.groupid = groupid;
		this.dir = bo.getDir();
		this.resolution = bo.getResolution();
		this.sizes = bo.getSizes();
		this.createBy = createBy;
		this.url = bo.getUrl();
	}


	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGroupid() {
		return groupid;
	}

	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getSizes() {
		return sizes;
	}

	public void setSizes(String sizes) {
		this.sizes = sizes;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

   
}