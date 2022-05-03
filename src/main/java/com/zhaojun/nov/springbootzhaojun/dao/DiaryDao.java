package com.zhaojun.nov.springbootzhaojun.dao;

import com.zhaojun.nov.springbootzhaojun.doman.Diary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author DELL
 * @date 2022/4/24 16:13
 */
@Repository
public interface DiaryDao extends CrudRepository<Diary,Long> {
    List<Diary> findByTitleContainingOrContentContaining(String title,String content);

//    @Query(value = "select d.id,d.title,d.content,d.createTime,d.userId " +
//            "from Diary d join User u on d.userId = u.id where u.id = ?1")
//    List<Diary> findAllByUserId(Long userId);
}
