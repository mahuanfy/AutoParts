package com.eu.front.entity;
public class Storage {
    private Integer id;
    private String storageCode;
    private String storageName;
    private String storageCapacity;
    public Storage() {
        super();
    }
    public Storage(Integer id,String storageCode,String storageName,String storageCapacity) {
        super();
        this.id = id;
        this.storageCode = storageCode;
        this.storageName = storageName;
        this.storageCapacity = storageCapacity;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStorageCode() {
        return this.storageCode;
    }

    public void setStorageCode(String storageCode) {
        this.storageCode = storageCode;
    }

    public String getStorageName() {
        return this.storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public String getStorageCapacity() {
        return this.storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

}
