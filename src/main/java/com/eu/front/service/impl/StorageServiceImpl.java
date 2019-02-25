package com.eu.front.service.impl;

import com.eu.front.dao.StockDao;
import com.eu.front.dao.StorageDao;
import com.eu.front.entity.Storage;
import com.eu.front.service.StorageService;
import com.eu.front.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StockDao stockDao;
    @Autowired
    private StorageDao storageDao;

    @Override
    public List<Map<String, String>> queryStorage(PageUtil page, String userName) throws Exception {
        String adminReal="%"+userName+"%";
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("start", (page.getCurrentIndex() - 1) * page.getPageSize());
        data.put("end", page.getPageSize());
        data.put("storageName",adminReal);
        page.setTotalSize(storageDao.queryStorageCount());

        return storageDao.queryStorage(data);
    }
    @Override
    public List<Map<String, String>> queryStorageInfo() throws Exception {

        return storageDao.queryStorageInfo();
    }

    @Override
    public void addStorage(Storage storage) throws Exception {
        storageDao.addStorage(storage);
        //用ID替代初始化的0值
        storage.setId(0);
        stockDao.addStockCustomer(storage);
    }

    @Override
    public void deleteStorage(String id) throws Exception {
        Storage storage = storageDao.queryStorageById(id);
        stockDao.deleteStockCustomer(storage);
        storageDao.deleteStorage(id);
    }

}