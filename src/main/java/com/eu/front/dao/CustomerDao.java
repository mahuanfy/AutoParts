package com.eu.front.dao;

import com.eu.front.entity.Customer;
import java.util.List;
import java.util.Map;

public interface CustomerDao{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> queryCustomer(Map<String, Object> data) throws Exception;

	Long queryCustomerCount() throws Exception;

	/**
	 * 插入
	 *
	 * @param customer
	 */
	void addCustomer(Customer customer) throws Exception;

	/**
	 * 通过ID删除
	 * @param id
	 */
	void deleteCustomer(String id) throws Exception;
	/**
	 * 查询数据
	 */
	List<Map<String, String>> queryCustomerceInfo() throws Exception;
}