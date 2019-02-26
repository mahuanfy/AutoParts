package com.eu.front.service;

import com.eu.front.entity.Parts;
import com.eu.front.utils.PageUtil;

import java.util.List;
import java.util.Map;

public interface PartsService{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> queryParts(PageUtil page, String userName) throws Exception;


	/**
	 * 插入
	 *
	 * @param parts
	 */
	void addParts(Parts parts) throws Exception;

	/**
	 * 通过ID删除
	 * @param id
	 */
	void deleteParts(String id) throws Exception;

	/**
	 * 查询数据
	 */
	List<Map<String, String>> queryPartsInfo() throws Exception;

}
