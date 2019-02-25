package com.eu.front.dao;

import com.eu.front.entity.Sale;
import com.eu.front.entity.Stock;

import java.util.List;
import java.util.Map;

public interface SaleDao{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> querySale(Map<String, Object> data) throws Exception;

	Long querySaleCount() throws Exception;

	/**
	 * 插入
	 *
	 * @param sale
	 */
	void addSale(Sale sale) throws Exception;

	/**
	 * 通过ID删除
	 * @param id
	 */
	void deleteSale(String id) throws Exception;


	Sale findById(String id);

	List<Map<String, String>> querySaleTen() throws Exception;

	List<Map<String, String>> findSale() ;
}