package com.eu.front.web.parts;

import com.eu.front.service.StockService;
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
@RequestMapping("Stock")
public class StockController {
    @Autowired
    private StockService stockService;

    @RequestMapping("/findStock")
    @ResponseBody
    public Map<String, Object> insertStock(PageUtil page,String userName){
        Map<String, Object> data = new HashMap<String, Object>();
        List<Map<String,String>> info;
        try {
            info = stockService.queryStock(page,userName);
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
}
