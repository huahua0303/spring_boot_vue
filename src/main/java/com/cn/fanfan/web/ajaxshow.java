package com.cn.fanfan.web;

import com.cn.fanfan.entity.StudentEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ajaxshow {

    @RequestMapping("/")
    public String ajaxshowthymeleaf(){

        return "ajaxthymeleafaxios.html";
    }


    @RequestMapping("/ajaxshow")
    @ResponseBody
    public StudentEntity ajaxshow(String name){

        StudentEntity se = new StudentEntity();
        se.setId(1001);
        se.setName(name);
        se.setSex("男");
        se.setAge(20);
        return se;
    }

    @RequestMapping("/ajaxpost")
    @ResponseBody
    public StudentEntity ajaxShowPost(String name){

        StudentEntity se = new StudentEntity();
        se.setId(1);
        se.setName(name);
        se.setSex("女");
        se.setAge(21);

        return se;
    }
}
