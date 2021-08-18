package com.pentac.tmall_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//所有的后台页面跳转都放在 AdminPageController 这个控制器,返回字符串，专门处理HTML这种
@Controller
public class AdminPageController {

    @GetMapping( "/admin")
    public String admin(){
        System.out.println("admin控制器");
        return "redirect:admin_category_list";
    }

    @GetMapping("/admin_category_list")
    public String listCategory(){
        System.out.println("/admin_category_list控制器");
        return "admin/listCategory";
    }

}
