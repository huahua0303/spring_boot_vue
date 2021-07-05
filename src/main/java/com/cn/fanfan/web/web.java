package com.cn.fanfan.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class web {
    @RequestMapping("/eshow")
    public String eventshow(){

        return "vmodel";
    }
}
