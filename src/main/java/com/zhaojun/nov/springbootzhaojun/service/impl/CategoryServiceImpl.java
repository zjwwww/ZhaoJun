package com.zhaojun.nov.springbootzhaojun.service.impl;

import com.zhaojun.nov.springbootzhaojun.dao.CategoryDao;
import com.zhaojun.nov.springbootzhaojun.doman.Category;
import com.zhaojun.nov.springbootzhaojun.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DELL
 * @date 2022/4/24 10:59
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    /**
     * 获取所有的分类
     * @return
     */
    @Override
    public Iterable<Category> getAllCategories() {
        return categoryDao.findAll();
    }
}
