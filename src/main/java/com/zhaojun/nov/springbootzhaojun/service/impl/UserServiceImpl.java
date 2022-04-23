package com.zhaojun.nov.springbootzhaojun.service.impl;

import com.zhaojun.nov.springbootzhaojun.dao.UserDao;
import com.zhaojun.nov.springbootzhaojun.doman.User;
import com.zhaojun.nov.springbootzhaojun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author DELL
 * @date 2022/4/23 11:44
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Iterable<User> getUser() {
        return userDao.findAll();
    }
}
