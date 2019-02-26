package com.eu.front.web.purchase;

import com.eu.front.dto.Result;
import com.eu.front.entity.Purchase;
import com.eu.front.service.CustomerService;
import com.eu.front.service.PurchaseService;
import com.eu.front.service.PartsService;
import com.eu.front.service.StorageService;
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
@RequestMapping("Purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;
    @Autowired
    private PartsService partsService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private StorageService storageService;

    @RequestMapping("/findPurchase")
    @ResponseBody
    public Map<String, Object> insertPurchase(PageUtil page,String userName){
        Map<String, Object> data = new HashMap<String, Object>();
        List<Map<String,String>> info;
        try {
            info = purchaseService.queryPurchase(page,userName);
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

    @RequestMapping("/addPurchase")
    @ResponseBody
    public Result addPurchase(Purchase purchase) {
        try {
            purchaseService.addPurchase(purchase);
            return Result.success(null, Constant.ADD_SUCCESS);
        } catch (Exception e) {
            new RuntimeException(e);
        }

        return Result.failure(null, Constant.ADD_FAILURE);
    }

    @RequestMapping("/deletePurchase")
    @ResponseBody
    public Map<String, Object> deletePurchase(String id) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            purchaseService.deletePurchase(id);
            result.put("msg", Constant.DELETE_SUCCESS);
            result.put("result", true);
        } catch (Exception e) {
            new RuntimeException(e);
            result.put("msg", Constant.DELETE_FAILURE);
        }
        return result;
    }

    @RequestMapping("/foreignKey")
    @ResponseBody
    public Map<String, Object> foreignKey() {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            List<Map<String,String>> parts = partsService.queryPartsInfo();
            List<Map<String,String>> customerce  = customerService.queryCustomerceInfo();
            List<Map<String,String>> storage  = storageService.queryStorageInfo();
            result.put("parts", parts);
            result.put("customerce", customerce);
            result.put("storage", storage);
            result.put("result", true);
        } catch (Exception e) {
            new RuntimeException(e);
            result.put("msg", Constant.DELETE_FAILURE);
        }
        return result;
    }



}
