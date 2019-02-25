package com.eu.front.web.customerce;

import com.eu.front.dto.Result;
import com.eu.front.entity.Admin;
import com.eu.front.entity.Customer;
import com.eu.front.service.CustomerService;
import com.eu.front.service.UserService;
import com.eu.front.utils.Constant;
import com.eu.front.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("Customerce")
public class CustomerceController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/findCustomerce")
    @ResponseBody
    public Map<String, Object> insertCustomerce(PageUtil page,String userName){
        Map<String, Object> data = new HashMap<String, Object>();
        List<Map<String,String>> info;
        try {
            info = customerService.queryCustomer(page,userName);
            data.put("info", info);
            data.put("page", page);
            data.put("result", true);
            data.put("msg", Constant.SEARCH_SUCCESS);
        } catch (Exception e) {
            data.put("msg", Constant.SEARCH_FAILURE);
            e.printStackTrace();
        }

        return data;
    }

    @RequestMapping("/addCustomerce")
    @ResponseBody
    public Result addCustomerce(Customer customer) {
        try {
            customerService.addCustomer(customer);
            return Result.success(null, Constant.ADD_SUCCESS);
        } catch (Exception e) {
            new RuntimeException(e);
        }

        return Result.failure(null, Constant.ADD_FAILURE);
    }

    @RequestMapping("/deleteCustomerce")
    @ResponseBody
    public Map<String, Object> deleteCustomerce(String id) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            customerService.deleteCustomer(id);
            result.put("msg", Constant.DELETE_SUCCESS);
            result.put("result", true);
        } catch (Exception e) {
            new RuntimeException(e);
            result.put("msg", Constant.DELETE_FAILURE);
        }
        return result;
    }



}
