package com.eu.front.entity;
public class Recovery {
    private Integer id;
    private String recoveryYear;
    private String recoveryMonth;
    private String recoveryDay;
    private String recoveryCode;//代码
    private String recoverySteelId;//名称
    private String recoveryCapacity;//大小
    private String recoveryPirce;//价格
    private String recoveryStorageId;

    public String getRecoveryDay() {
        return recoveryDay;
    }

    public void setRecoveryDay(String recoveryDay) {
        this.recoveryDay = recoveryDay;
    }

    public Recovery() {
        super();
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecoveryYear() {
        return this.recoveryYear;
    }

    public void setRecoveryYear(String recoveryYear) {
        this.recoveryYear = recoveryYear;
    }

    public String getRecoveryMonth() {
        return this.recoveryMonth;
    }

    public void setRecoveryMonth(String recoveryMonth) {
        this.recoveryMonth = recoveryMonth;
    }

    public String getRecoveryCode() {
        return this.recoveryCode;
    }

    public void setRecoveryCode(String recoveryCode) {
        this.recoveryCode = recoveryCode;
    }

    public String getRecoverySteelId() {
        return this.recoverySteelId;
    }

    public void setRecoverySteelId(String recoverySteelId) {
        this.recoverySteelId = recoverySteelId;
    }

    public String getRecoveryCapacity() {
        return this.recoveryCapacity;
    }

    public void setRecoveryCapacity(String recoveryCapacity) {
        this.recoveryCapacity = recoveryCapacity;
    }

    public String getRecoveryPirce() {
        return this.recoveryPirce;
    }

    public void setRecoveryPirce(String recoveryPirce) {
        this.recoveryPirce = recoveryPirce;
    }

    public String getRecoveryStorageId() {
        return recoveryStorageId;
    }

    public void setRecoveryStorageId(String recoveryStorageId) {
        this.recoveryStorageId = recoveryStorageId;
    }
}
