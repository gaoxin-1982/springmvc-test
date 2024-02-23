package com.dcits.controller;

import com.dcits.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author gaoxin
 * @Date: 2022/9/23 9:02
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test1(){
        return "test";
    }

    @RequestMapping("/test2")
    public String test2(Map<String,Object> map){
        map.put("msg","<h1>Hello, Thymeleaf</h1>");
        return "test2";
    }

    @RequestMapping("/test3")
    public String test3(Map<String,Object> map){
        ArrayList<String> list = new ArrayList<>();
        list.add("tom");
        list.add("jack");
        map.put("users", list);
        return "test3";
    }

    @RequestMapping("/test4")
    public String test4(Model model){
        List<Users> list = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            Users users = new Users("小明",18,"浑南区");
            list.add(users);
        }
        model.addAttribute("listUsers",list);
        return "test4";
    }
}
