package com.eu.front.web.main;

import com.eu.front.dao.PurchaseDao;
import com.eu.front.dao.SaleDao;
import com.eu.front.dao.StockDao;
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
@RequestMapping("MainController")
public class MainController {
    @Autowired
    PurchaseDao purchaseDao;
    @Autowired
    private SaleDao saleDao;

    @RequestMapping("/findMainController")
    @ResponseBody
    public Map<String, Object> findMainController(){
        Map<String, Object> data = new HashMap<String, Object>();
        List<Map<String,String>> sale;
        List<Map<String,String>> purchase;
        try {
            sale = saleDao.querySaleTen();
            purchase = purchaseDao.queryPurchaseTen();
            data.put("sale", sale);
            data.put("purchase", purchase);
            data.put("result", true);
            data.put("msg", Constant.SEARCH_SUCCESS);
        } catch (Exception e) {
            data.put("msg", Constant.SEARCH_FAILURE);
            e.printStackTrace();
        }

        return data;
    }


}
