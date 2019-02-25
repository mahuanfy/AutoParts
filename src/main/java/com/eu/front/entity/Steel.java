package com.eu.front.entity;
public class Steel {
    private Integer id;
    private String steelVersion;//型号
    private String steelName;//名称
    private Double steelPrice;//单价
    public Steel() {
        super();
    }
    public Steel(Integer id,String steelVersion,String steelName,Double steelPrice) {
        super();
        this.id = id;
        this.steelVersion = steelVersion;
        this.steelName = steelName;
        this.steelPrice = steelPrice;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSteelVersion() {
        return this.steelVersion;
    }

    public void setSteelVersion(String steelVersion) {
        this.steelVersion = steelVersion;
    }

    public String getSteelName() {
        return this.steelName;
    }

    public void setSteelName(String steelName) {
        this.steelName = steelName;
    }

    public Double getSteelPrice() {
        return this.steelPrice;
    }

    public void setSteelPrice(Double steelPrice) {
        this.steelPrice = steelPrice;
    }

}
