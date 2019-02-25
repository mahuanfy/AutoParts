package com.eu.front.service.impl;

import com.eu.front.dao.CustomerDao;
import com.eu.front.entity.Admin;
import com.eu.front.entity.Customer;
import com.eu.front.service.CustomerService;
import com.eu.front.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Map<String, String>> queryCustomer(PageUtil page,String userName) throws Exception {
        String adminReal="%"+userName+"%";
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("start", (page.getCurrentIndex() - 1) * page.getPageSize());
        data.put("end", page.getPageSize());
        data.put("customerName",adminReal);
        page.setTotalSize(customerDao.queryCustomerCount());

        return customerDao.queryCustomer(data);
    }

    @Override
    public void addCustomer(Customer customer) throws Exception {
        customerDao.addCustomer(customer);
    }

    @Override
    public void deleteCustomer(String id) throws Exception {
        customerDao.deleteCustomer(id);
    }

    @Override
    public List<Map<String, String>> queryCustomerceInfo() throws Exception {
       return customerDao.queryCustomerceInfo();
    }

}