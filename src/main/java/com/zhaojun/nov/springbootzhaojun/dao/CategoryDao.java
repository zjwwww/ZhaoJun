package com.zhaojun.nov.springbootzhaojun.dao;

import com.zhaojun.nov.springbootzhaojun.doman.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author DELL
 * @date 2022/4/24 10:51
 */
@Repository
public interface CategoryDao extends CrudRepository<Category, Long> {
}
