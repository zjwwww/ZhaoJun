package com.zhaojun.nov.springbootzhaojun.dao;

import com.zhaojun.nov.springbootzhaojun.doman.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author DELL
 * @date 2022/4/21 20:09
 */
@Repository
public interface UserDao extends CrudRepository<User,Long> {
}
