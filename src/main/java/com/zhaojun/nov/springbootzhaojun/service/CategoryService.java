package com.zhaojun.nov.springbootzhaojun.service;

import com.zhaojun.nov.springbootzhaojun.doman.Category;

import java.util.List;

/**
 * @author DELL
 * @date 2022/4/24 10:57
 */
public interface CategoryService {

    /**
     * 获取所有的分类
     * @return List<Category>
     */
    Iterable<Category> getAllCategories();
}
