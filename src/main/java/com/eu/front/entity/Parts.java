package com.eu.front.entity;
public class Parts {
    private Integer id;
    private String partsVersion;//型号
    private String partsName;//名称
    private Double partsPrice;//单价
    public Parts() {
        super();
    }
    public Parts(Integer id,String partsVersion,String partsName,Double partsPrice) {
        super();
        this.id = id;
        this.partsVersion = partsVersion;
        this.partsName = partsName;
        this.partsPrice = partsPrice;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartsVersion() {
        return this.partsVersion;
    }

    public void setPartsVersion(String partsVersion) {
        this.partsVersion = partsVersion;
    }

    public String getPartsName() {
        return this.partsName;
    }

    public void setPartsName(String partsName) {
        this.partsName = partsName;
    }

    public Double getPartsPrice() {
        return this.partsPrice;
    }

    public void setPartsPrice(Double partsPrice) {
        this.partsPrice = partsPrice;
    }

}
