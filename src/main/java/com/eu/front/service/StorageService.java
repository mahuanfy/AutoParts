package com.eu.front.service;

import com.eu.front.entity.Storage;
import com.eu.front.utils.PageUtil;

import java.util.List;
import java.util.Map;

public interface StorageService {
    /**
     * 分页查询数据
     */
    List<Map<String, String>> queryStorage(PageUtil page, String userName) throws Exception;

    /**
     * 查询数据
     */
    List<Map<String, String>> queryStorageInfo() throws Exception;


    /**
     * 插入
     *
     * @param storage
     */
    void addStorage(Storage storage) throws Exception;

    /**
     * 通过ID删除
     *
     * @param id
     */
    void deleteStorage(String id) throws Exception;

}