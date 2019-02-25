package com.eu.front.web;

import com.eu.front.entity.Admin;
import com.eu.front.service.LoginService;
import com.eu.front.service.UserService;
import com.eu.front.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("")
public class LoginController extends HttpServlet {
    @Autowired
    private UserService userService;
    @Autowired
    private LoginService loginService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Object> login(HttpSession session, Admin admin) {
        Map<String, Object> data = new HashMap<String, Object>();

        Admin userInfo = loginService.login(admin);
        if (userInfo != null) {

            session.setAttribute("user", userInfo);
            data.put("result", true);

        } else {
            data.put("result", false);
        }
        return data;
    }

    //判断是否有session
    @RequestMapping("/session")
    @ResponseBody
    public Map<String, Object> session(HttpSession session) {
        Map<String, Object> result = new HashMap<String, Object>();
        Boolean haveSession=true;
        try {
            Admin user = (Admin) session.getAttribute("user");
            if(user == null){
                haveSession = false;
            }
            result.put("haveSession",haveSession);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    //登出
    @RequestMapping("/outSession")
    @ResponseBody
    public Map<String, Object> out(HttpSession session) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            session.removeAttribute("user");
            result.put("msg", Constant.ACCOUNT_OUT);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    @RequestMapping("/userInfo")
    @ResponseBody
    public Map<String, Object> findById(HttpSession session) {
        Map<String, Object> result = new HashMap<String, Object>();
        int id = ((Admin)session.getAttribute("user")).getId();

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
}
