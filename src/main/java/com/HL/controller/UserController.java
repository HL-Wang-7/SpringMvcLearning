package com.HL.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *  控制器的制作
 *  2 定义controller
 *      2-1 使用@Controller来定义bean
 *      2-2 设置当前操作的访问路径
 */
@Controller
@RequestMapping("/user")
public class UserController {
    // 使用@RequestMapping来设置当前操作的访问路径
    @RequestMapping("/save")
    @ResponseBody // 把return的内容作为响应内容
    public String save(){
        System.out.println( "save user..." );
        return "{'Module' : 'springmvc'}";
    }
}
