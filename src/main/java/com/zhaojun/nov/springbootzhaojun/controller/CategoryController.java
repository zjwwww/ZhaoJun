package com.zhaojun.nov.springbootzhaojun.controller;

import com.zhaojun.nov.springbootzhaojun.service.CategoryService;
import com.zhaojun.nov.springbootzhaojun.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DELL
 * @date 2022/4/24 11:02
 */
@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 获取所有分类
     */
    @GetMapping("/getAllCategory")
    public Result getAllCategories() {
        return Result.ok().data("category",categoryService.getAllCategories());
    }
}
