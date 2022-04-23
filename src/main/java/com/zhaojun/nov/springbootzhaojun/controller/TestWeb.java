package com.zhaojun.nov.springbootzhaojun.controller;

import com.zhaojun.nov.springbootzhaojun.doman.User;
import com.zhaojun.nov.springbootzhaojun.service.UserService;
import com.zhaojun.nov.springbootzhaojun.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DELL
 * @date 2022/4/21 19:33
 */
@RestController
public class TestWeb {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test() {
        System.out.println("/sdsdsz");
        return "bbb";
    }

    @GetMapping("/testUser")
    public Result getUsers() {

        return Result.ok().data(userService.getUser());
    }
}
