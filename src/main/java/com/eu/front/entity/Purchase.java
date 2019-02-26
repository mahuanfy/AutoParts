package com.eu.front.entity;
public class Purchase {
    private Integer id;
    private String purchaseYear;
    private String purchaseMonth;
    private String purchaseDay;
    private String purchaseCode;//代码
    private String purchasePartsId;//名称
    private String purchaseCapacity;//大小
    private String purchasePirce;//价格
    private String purchaseStorageId;

    public String getPurchaseDay() {
        return purchaseDay;
    }

    public void setPurchaseDay(String purchaseDay) {
        this.purchaseDay = purchaseDay;
    }

    public Purchase() {
        super();
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPurchaseYear() {
        return this.purchaseYear;
    }

    public void setPurchaseYear(String purchaseYear) {
        this.purchaseYear = purchaseYear;
    }

    public String getPurchaseMonth() {
        return this.purchaseMonth;
    }

    public void setPurchaseMonth(String purchaseMonth) {
        this.purchaseMonth = purchaseMonth;
    }

    public String getPurchaseCode() {
        return this.purchaseCode;
    }

    public void setPurchaseCode(String purchaseCode) {
        this.purchaseCode = purchaseCode;
    }

    public String getPurchasePartsId() {
        return this.purchasePartsId;
    }

    public void setPurchasePartsId(String purchasePartsId) {
        this.purchasePartsId = purchasePartsId;
    }

    public String getPurchaseCapacity() {
        return this.purchaseCapacity;
    }

    public void setPurchaseCapacity(String purchaseCapacity) {
        this.purchaseCapacity = purchaseCapacity;
    }

    public String getPurchasePirce() {
        return this.purchasePirce;
    }

    public void setPurchasePirce(String purchasePirce) {
        this.purchasePirce = purchasePirce;
    }

    public String getPurchaseStorageId() {
        return purchaseStorageId;
    }

    public void setPurchaseStorageId(String purchaseStorageId) {
        this.purchaseStorageId = purchaseStorageId;
    }
}
