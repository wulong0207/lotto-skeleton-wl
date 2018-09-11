package com.hhly.skeleton.cms.sportmgr.vo;

import java.util.Date;

/**
 * Created by lgs on 2016/12/16.
 */
public class WFDataVO extends  SportDataBaseVO{
    private static final long serialVersionUID = -3547028495886321873L;
    private Long sportStatusWfId;

    private Short statusLetWf;

    private Long sportDrawWfId;

    private Double letNum;

    private Short letSf;

    private Double spLetWf;

    private Date drawTime;

    public Double getLetNum() {
        return letNum;
    }

    public void setLetNum(Double letNum) {
        this.letNum = letNum;
    }

    public Long getSportStatusWfId() {
        return sportStatusWfId;
    }

    public void setSportStatusWfId(Long sportStatusWfId) {
        this.sportStatusWfId = sportStatusWfId;
    }

    public Short getStatusLetWf() {
        return statusLetWf;
    }

    public void setStatusLetWf(Short statusLetWf) {
        this.statusLetWf = statusLetWf;
    }

    public Long getSportDrawWfId() {
        return sportDrawWfId;
    }

    public void setSportDrawWfId(Long sportDrawWfId) {
        this.sportDrawWfId = sportDrawWfId;
    }

    public Short getLetSf() {
        return letSf;
    }

    public void setLetSf(Short letSf) {
        this.letSf = letSf;
    }

    public Double getSpLetWf() {
        return spLetWf;
    }

    public void setSpLetWf(Double spLetWf) {
        this.spLetWf = spLetWf;
    }

    public Date getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(Date drawTime) {
        this.drawTime = drawTime;
    }
}
