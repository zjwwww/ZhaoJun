package com.zhaojun.nov.springbootzhaojun.service;

import com.zhaojun.nov.springbootzhaojun.dao.UserDao;
import com.zhaojun.nov.springbootzhaojun.doman.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author DELL
 * @date 2022/4/21 20:10
 */
public interface UserService {


    /**
     * 获取商品列表
     */
    Iterable<User> getUser();
}
