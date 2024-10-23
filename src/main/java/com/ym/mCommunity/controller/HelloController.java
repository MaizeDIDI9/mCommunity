package com.ym.mCommunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
@author:xiaoYu
@date:2024/10/23 18:25
@version: 1.0  
@desc:前端请求控制器
*/
@Controller
public class HelloController {

    @GetMapping("/helloya")
    public String hello(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name",name);
         return "hello";
    }
}
