package com.eu.front.dao;

import com.eu.front.entity.Parts;
import java.util.List;
import java.util.Map;

public interface PartsDao{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> queryParts(Map<String, Object> data) throws Exception;

	Long queryPartsCount() throws Exception;

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
