package com.test.webservice.controller;

import com.test.webservice.dao.IUserMapper;
import com.test.webservice.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/mainController")  // 指定唯一一个请求关联到该Controller
public class MainController {

    @Autowired
    public IUserMapper userMapper;

    @RequestMapping
    public String myHello(Model model) {
        String userData = "";
        try {
            List<UserBean> users = userMapper.selectAllUser();
            userData = users.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("hello", "i am ok");
        model.addAttribute("data", userData);
        return "hello";
    }

    @RequestMapping(params = "method=1", method = RequestMethod.POST)
    public String testLogin2(String username, String password) {
        // 依据params的参数method的值来区分不同的调用方法
        // 可以指定页面请求方式的类型，默认为get请求

        if (!"admin".equals(username) || !"admin".equals(password)) {
            return "loginError";
        }
        return "loginSuccess";
    }

    @RequestMapping(params = "method=2")
    public String testLogin3(String username, String password, int age) {
        if (!"admin".equals(username) || !"admin".equals(password) || age < 5) {
            return "loginError";
        }
        return "loginSuccess";
    }
}
