package com.eu.front.web.storage;

import com.eu.front.dto.Result;
import com.eu.front.entity.Storage;
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
@RequestMapping("Storage")
public class StorageController {
    @Autowired
    private StorageService storageService;

    @RequestMapping("/findStorage")
    @ResponseBody
    public Map<String, Object> insertStorage(PageUtil page,String userName){
        Map<String, Object> data = new HashMap<String, Object>();
        List<Map<String,String>> info;
        try {
            info = storageService.queryStorage(page,userName);
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

    @RequestMapping("/addStorage")
    @ResponseBody
    public Result addStorage(Storage storage) {
        try {
            storageService.addStorage(storage);
            return Result.success(null, Constant.ADD_SUCCESS);
        } catch (Exception e) {
            new RuntimeException(e);
        }

        return Result.failure(null, Constant.ADD_FAILURE);
    }

    @RequestMapping("/deleteStorage")
    @ResponseBody
    public Map<String, Object> deleteStorage(String id) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            storageService.deleteStorage(id);
            result.put("msg", Constant.DELETE_SUCCESS);
            result.put("result", true);
        } catch (Exception e) {
            new RuntimeException(e);
            result.put("msg", Constant.DELETE_FAILURE);
        }
        return result;
    }



}
