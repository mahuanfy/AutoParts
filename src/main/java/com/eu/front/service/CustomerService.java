package com.eu.front.service;

import com.eu.front.entity.Customer;
import com.eu.front.utils.PageUtil;

import java.util.List;
import java.util.Map;

public interface CustomerService {
    /**
     * 分页查询数据
     */
    List<Map<String, String>> queryCustomer(PageUtil page, String userName) throws Exception;

    /**
     * 查询数据
     */
    List<Map<String, String>> queryCustomerceInfo() throws Exception;


    /**
     * 插入
     *
     * @param customer
     */
    void addCustomer(Customer customer) throws Exception;

    /**
     * 通过ID删除
     *
     * @param id
     */
    void deleteCustomer(String id) throws Exception;

}