package com.eu.front.entity;
public class Stock {
    private Integer id;
    private String stockYear;
    private String stockMonth;
    private String stockCode;//代码
    private String stockCapacity;//大小
    private String stockStorageId;//型号

    public Stock() {
        super();
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockYear() {
        return this.stockYear;
    }

    public void setStockYear(String stockYear) {
        this.stockYear = stockYear;
    }

    public String getStockMonth() {
        return this.stockMonth;
    }

    public void setStockMonth(String stockMonth) {
        this.stockMonth = stockMonth;
    }

    public String getStockCode() {
        return this.stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockCapacity() {
        return this.stockCapacity;
    }

    public void setStockCapacity(String stockCapacity) {
        this.stockCapacity = stockCapacity;
    }

    public String getStockStorageId() {
        return stockStorageId;
    }

    public void setStockStorageId(String stockStorageId) {
        this.stockStorageId = stockStorageId;
    }
}
