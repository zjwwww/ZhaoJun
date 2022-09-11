package com.zhaojun.nov.springbootzhaojun.dao;

import com.zhaojun.nov.springbootzhaojun.doman.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author DELL
 * @date 2022/5/8 10:21
 */
@Repository
public interface BlogDao extends CrudRepository<Blog, Long> {
}
