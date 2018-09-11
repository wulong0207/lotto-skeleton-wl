package com.hhly.skeleton.lotto.base.sport.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author lgs on
 * @version 1.0
 * @desc 竞彩老足彩SP值
 * @date 2017/3/3.
 * @company 益彩网络科技有限公司
 */
public class JcOldDataSpBO extends BaseBO {

    private static final long serialVersionUID = -6911133782857677688L;

    /**
     * 胜的SP值
     */
    private Float spWin;
    /**
     * 平的SP值
     */
    private Float spDraw;
    /**
     * 负的SP值
     */
    private Float spFail;

    private String officialId;

    public Float getSpWin() {
        return spWin;
    }

    public void setSpWin(Float spWin) {
        this.spWin = spWin;
    }

    public Float getSpDraw() {
        return spDraw;
    }

    public void setSpDraw(Float spDraw) {
        this.spDraw = spDraw;
    }

    public Float getSpFail() {
        return spFail;
    }

    public void setSpFail(Float spFail) {
        this.spFail = spFail;
    }

    public String getOfficialId() {
        return officialId;
    }

    public void setOfficialId(String officialId) {
        this.officialId = officialId;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("spWin", spWin)
                .append("spDraw", spDraw)
                .append("spFail", spFail)
                .append("officialId", officialId)
                .toString();
    }
}
