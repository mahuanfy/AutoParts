package com.eu.front.dao;

import com.eu.front.entity.Steel;
import java.util.List;
import java.util.Map;

public interface SteelDao{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> querySteel(Map<String, Object> data) throws Exception;

	Long querySteelCount() throws Exception;

	/**
	 * 插入
	 *
	 * @param steel
	 */
	void addSteel(Steel steel) throws Exception;

	/**
	 * 通过ID删除
	 * @param id
	 */
	void deleteSteel(String id) throws Exception;
	/**
	 * 查询数据
	 */
	List<Map<String, String>> querySteelInfo() throws Exception;
}