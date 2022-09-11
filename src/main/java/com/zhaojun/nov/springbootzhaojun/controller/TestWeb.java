package com.zhaojun.nov.springbootzhaojun.controller;

import com.zhaojun.nov.springbootzhaojun.doman.User;
import com.zhaojun.nov.springbootzhaojun.service.UserService;
import com.zhaojun.nov.springbootzhaojun.util.Result;
import config.PropertiesListenerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DELL
 * @date 2022/4/21 19:33
 */
@RestController
public class TestWeb {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public Map<String, Object> test() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.putAll(PropertiesListenerConfig.getAllProperty());
        return map;
    }

    @GetMapping("/testUser")
    public Result getUsers() {

        return Result.ok().data(userService.getUser());
    }



























}
