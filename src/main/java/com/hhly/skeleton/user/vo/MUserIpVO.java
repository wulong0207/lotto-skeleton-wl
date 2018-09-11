package com.hhly.skeleton.user.vo;

public class MUserIpVO {
    /**
     *
     */
    private Integer id;
    
    /**
     *
     */
    private Integer startipnum;
    
    /**
     *
     */
    private String startiptext;
    
    /**
     *
     */
    private Integer endipnum;
    
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
    
    public Integer getStartipnum () {
        return startipnum;
    }
    
    public void setStartipnum (Integer startipnum) {
        this.startipnum = startipnum;
    }
    
    public String getStartiptext () {
        return startiptext;
    }
    
    public void setStartiptext (String startiptext) {
        this.startiptext = startiptext == null ? null : startiptext.trim();
    }
    
    public Integer getEndipnum () {
        return endipnum;
    }
    
    public void setEndipnum (Integer endipnum) {
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