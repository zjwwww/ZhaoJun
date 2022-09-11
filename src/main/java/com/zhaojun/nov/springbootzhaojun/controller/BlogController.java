package com.zhaojun.nov.springbootzhaojun.controller;

import com.zhaojun.nov.springbootzhaojun.service.BlogService;
import com.zhaojun.nov.springbootzhaojun.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DELL
 * @date 2022/5/8 10:37
 */

@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    /**
     * 获取所有的blog
     * @return
     */
    @GetMapping("/getAllBlogs")
    public Result getAllBlogs() {
        return Result.ok().code(300).data(blogService.getAllBlogs());
    }
}
