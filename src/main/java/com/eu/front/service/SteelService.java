package com.eu.front.service;

import com.eu.front.entity.Steel;
import com.eu.front.utils.PageUtil;

import java.util.List;
import java.util.Map;

public interface SteelService{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> querySteel(PageUtil page, String userName) throws Exception;


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