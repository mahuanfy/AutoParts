package com.eu.front.dao;

import com.eu.front.entity.Storage;

import java.util.List;
import java.util.Map;

public interface StorageDao{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> queryStorage(Map<String, Object> data) throws Exception;

	Long queryStorageCount() throws Exception;

	/**
	 * 插入
	 *
	 * @param storage
	 */
	void addStorage(Storage storage) throws Exception;

	/**
	 * 通过ID删除
	 * @param id
	 */
	void deleteStorage(String id) throws Exception;


	/**
	 * 查询数据
	 */
	List<Map<String, String>> queryStorageInfo() throws Exception;

	Storage queryStorageById(String id);


}