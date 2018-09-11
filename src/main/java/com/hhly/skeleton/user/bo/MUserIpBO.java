package com.hhly.skeleton.user.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class MUserIpBO extends BaseBO {
    /**
     *
     */
    private Integer id;
    
    /**
     *
     */
    private String startipnum;
    
    /**
     *
     */
    private String startiptext;
    
    /**
     *
     */
    private String endipnum;
    
    /**
     *
     */
    private String endiptext;
    
    /**
     *
     */
    private String country;
    
    /**
     *
     */
    private String local;
    
    public Integer getId () {
        return id;
    }
    
    public void setId (Integer id) {
        this.id = id;
    }
    
    public String getStartipnum () {
        return startipnum;
    }
    
    public void setStartipnum (String startipnum) {
        this.startipnum = startipnum;
    }
    
    public String getStartiptext () {
        return startiptext;
    }
    
    public void setStartiptext (String startiptext) {
        this.startiptext = startiptext == null ? null : startiptext.trim();
    }
    
    public String getEndipnum () {
        return endipnum;
    }
    
    public void setEndipnum (String endipnum) {
        this.endipnum = endipnum;
    }
    
    public String getEndiptext () {
        return endiptext;
    }
    
    public void setEndiptext (String endiptext) {
        this.endiptext = endiptext == null ? null : endiptext.trim();
    }
    
    public String getCountry () {
        return country;
    }
    
    public void setCountry (String country) {
        this.country = country == null ? null : country.trim();
    }
    
    public String getLocal () {
        return local;
    }
    
    public void setLocal (String local) {
        this.local = local == null ? null : local.trim();
    }
}