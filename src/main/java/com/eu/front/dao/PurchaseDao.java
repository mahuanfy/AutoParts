package com.eu.front.dao;

import com.eu.front.entity.Purchase;

import java.util.List;
import java.util.Map;

public interface PurchaseDao{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> queryPurchase(Map<String, Object> data) throws Exception;

	Long queryPurchaseCount() throws Exception;

	/**
	 * 插入
	 *
	 * @param purchase
	 */
	void addPurchase(Purchase purchase) throws Exception;

	/**
	 * 通过ID删除
	 * @param id
	 */
	void deletePurchase(String id) throws Exception;

	Purchase findById(String id) throws Exception;

	List<Map<String, String>> queryPurchaseTen() throws Exception;

	/**
	 * 查找所有进货信息报表
	 * @return
	 */
	List<Map<String, String>> findRecover();
}
