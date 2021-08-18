package com.pentac.tmall_springboot.controller;


import com.pentac.tmall_springboot.entity.Category;
import com.pentac.tmall_springboot.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pentaC
 * @since 2021-08-16
 */
@RestController
@Component
public class CategoryController {

    @Autowired
    CategoryServiceImpl categoryServiceImpl;

    @GetMapping("/categories")
    public List<Category> list() throws Exception{
        categoryServiceImpl.list().forEach(System.out::println);
        return categoryServiceImpl.list();
    }
}

