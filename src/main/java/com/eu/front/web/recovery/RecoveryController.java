package com.eu.front.web.recovery;

import com.eu.front.dto.Result;
import com.eu.front.entity.Recovery;
import com.eu.front.service.CustomerService;
import com.eu.front.service.RecoveryService;
import com.eu.front.service.SteelService;
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
@RequestMapping("Recovery")
public class RecoveryController {
    @Autowired
    private RecoveryService recoveryService;
    @Autowired
    private SteelService steelService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private StorageService storageService;

    @RequestMapping("/findRecovery")
    @ResponseBody
    public Map<String, Object> insertRecovery(PageUtil page,String userName){
        Map<String, Object> data = new HashMap<String, Object>();
        List<Map<String,String>> info;
        try {
            info = recoveryService.queryRecovery(page,userName);
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

    @RequestMapping("/addRecovery")
    @ResponseBody
    public Result addRecovery(Recovery recovery) {
        try {
            recoveryService.addRecovery(recovery);
            return Result.success(null, Constant.ADD_SUCCESS);
        } catch (Exception e) {
            new RuntimeException(e);
        }

        return Result.failure(null, Constant.ADD_FAILURE);
    }

    @RequestMapping("/deleteRecovery")
    @ResponseBody
    public Map<String, Object> deleteRecovery(String id) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            recoveryService.deleteRecovery(id);
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
            List<Map<String,String>> steel = steelService.querySteelInfo();
            List<Map<String,String>> customerce  = customerService.queryCustomerceInfo();
            List<Map<String,String>> storage  = storageService.queryStorageInfo();
            result.put("steel", steel);
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
