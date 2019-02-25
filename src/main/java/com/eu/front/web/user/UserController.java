package com.eu.front.web.user;

import com.eu.front.dto.Result;
import com.eu.front.entity.Admin;
import com.eu.front.service.UserService;
import com.eu.front.utils.Constant;
import com.eu.front.utils.ImgUtil;
import com.eu.front.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    @ResponseBody
    public Map<String, Object> insertProfession(PageUtil page,String adminRealname){
        Map<String, Object> data = new HashMap<String, Object>();
        List<Map<String,String>> TronClass;
        try {
            TronClass = userService.insertUser(page,adminRealname);
            data.put("user", TronClass);
            data.put("page", page);
            data.put("result", true);
            data.put("msg", Constant.SEARCH_SUCCESS);
        } catch (Exception e) {
            data.put("msg", Constant.SEARCH_FAILURE);
            e.printStackTrace();
        }

        return data;
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public Result addUser(Admin admin) {
        try {
            userService.addUser(admin);
            return Result.success(null, Constant.ADD_SUCCESS);
        } catch (Exception e) {
            new RuntimeException(e);
        }

        return Result.failure(null, Constant.ADD_FAILURE);
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public Map<String, Object> deleteUser(String id) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            userService.deleteUser(id);
            result.put("msg", Constant.DELETE_SUCCESS);
            result.put("result", true);
        } catch (Exception e) {
            new RuntimeException(e);
            result.put("msg", Constant.DELETE_FAILURE);
        }
        return result;
    }

    @RequestMapping("/userInfo")
    @ResponseBody
    public Map<String, Object> findById(int id) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            result.put("user", userService.findById(id));
            result.put("msg", Constant.SEARCH_SUCCESS);
            result.put("result", true);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", Constant.SEARCH_FAILURE);
        }

        return result;
    }
    //用户信息
    @RequestMapping("/updateInfoAjax")
    @ResponseBody
    public Map<String, Object> updateInfoAjax(Admin admin) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            userService.updateUserInfo(admin);
            result.put("msg", Constant.UPDATE_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", Constant.UPDATE_FAILURE);
        }

        return result;
    }
}
