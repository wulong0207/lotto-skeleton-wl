package com.hhly.skeleton.cms.sportmgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;

import java.util.Date;

/**
 * Created by lgs on 2016/12/5.
 */
public class SportDataFBOldBO extends BaseBO{

    private static final long serialVersionUID = -7231055010669415553L;
    @ExcelHeader("序号")
    private Long id;

    private Integer sportDataFbOldId;

    @JsonSerialize(using = CustomDoubleSerialize.class)
    private Double spWin;

    @JsonSerialize(using = CustomDoubleSerialize.class)
    private Double spDraw;

    @JsonSerialize(using = CustomDoubleSerialize.class)
    private Double spFail;

    private Short spType;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date releaseTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSportDataFbOldId() {
        return sportDataFbOldId;
    }

    public void setSportDataFbOldId(Integer sportDataFbOldId) {
        this.sportDataFbOldId = sportDataFbOldId;
    }

    public Double getSpWin() {
        return spWin;
    }

    public void setSpWin(Double spWin) {
        this.spWin = spWin;
    }

    public Double getSpDraw() {
        return spDraw;
    }

    public void setSpDraw(Double spDraw) {
        this.spDraw = spDraw;
    }

    public Double getSpFail() {
        return spFail;
    }

    public void setSpFail(Double spFail) {
        this.spFail = spFail;
    }

    public Short getSpType() {
        return spType;
    }

    public void setSpType(Short spType) {
        this.spType = spType;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }
}
