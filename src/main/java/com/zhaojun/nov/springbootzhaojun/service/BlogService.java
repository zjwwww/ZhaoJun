package com.zhaojun.nov.springbootzhaojun.service;

import com.zhaojun.nov.springbootzhaojun.doman.Blog;

import java.util.List;

/**
 * @author DELL
 * @date 2022/5/8 10:21
 */
public interface BlogService {
    /**
     * 查询所有的博客
     * @return
     */
    Iterable<Blog> getAllBlogs();
}
