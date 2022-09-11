package com.zhaojun.nov.springbootzhaojun.service.impl;

import com.zhaojun.nov.springbootzhaojun.dao.BlogDao;
import com.zhaojun.nov.springbootzhaojun.doman.Blog;
import com.zhaojun.nov.springbootzhaojun.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DELL
 * @date 2022/5/8 10:24
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;

    /**
     * 查询所有的博客
     * @return
     */
    @Override
    public Iterable<Blog> getAllBlogs() {
        Iterable<Blog> blogs = blogDao.findAll();
        return blogs;
    }
}
