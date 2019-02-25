package com.eu.front.entity;
public class Sale {
    private Integer id;
    private String saleYear;//时间
    private String saleMonth;
    private String saleDay;
    private String saleCode;
    private String saleSteelId;
    private String saleCapacity;
    private String salePirce;
    private String saleCustomerId;//客户id
    private String saleStorageId;

    public String getSaleDay() {
        return saleDay;
    }

    public void setSaleDay(String saleDay) {
        this.saleDay = saleDay;
    }

    public Sale() {
        super();
    }

    public String getSaleYear() {
        return saleYear;
    }

    public void setSaleYear(String saleYear) {
        this.saleYear = saleYear;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getSaleMonth() {
        return this.saleMonth;
    }

    public void setSaleMonth(String saleMonth) {
        this.saleMonth = saleMonth;
    }

    public String getSaleCode() {
        return this.saleCode;
    }

    public void setSaleCode(String saleCode) {
        this.saleCode = saleCode;
    }

    public String getSaleSteelId() {
        return this.saleSteelId;
    }

    public void setSaleSteelId(String saleSteelId) {
        this.saleSteelId = saleSteelId;
    }

    public String getSaleCapacity() {
        return this.saleCapacity;
    }

    public void setSaleCapacity(String saleCapacity) {
        this.saleCapacity = saleCapacity;
    }

    public String getSalePirce() {
        return this.salePirce;
    }

    public void setSalePirce(String salePirce) {
        this.salePirce = salePirce;
    }

    public String getSaleCustomerId() {
        return this.saleCustomerId;
    }

    public void setSaleCustomerId(String saleCustomerId) {
        this.saleCustomerId = saleCustomerId;
    }

    public String getSaleStorageId() {
        return this.saleStorageId;
    }

    public void setSaleStorageId(String saleStorageId) {
        this.saleStorageId = saleStorageId;
    }

}
