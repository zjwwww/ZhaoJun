package com.zhaojun.nov.springbootzhaojun.service;

import com.zhaojun.nov.springbootzhaojun.doman.Diary;

import java.util.List;
import java.util.Optional;

/**
 * @author DELL
 * @date 2022/4/24 16:14
 */
public interface DiaryService {

    /**
     * 查询所有日记
     */
    Iterable<Diary> getAllDiary();

    /**
     * 根据id查询日记
     */
    Optional<Diary> getDiaryById(Long id);

    /**
     * 根据日记内容或名称模糊查询日记
     */
    List<Diary> findByTitleContainingOrContentContaining(String content);

    /**
     * 根据用户查询日记
     */
    Iterable<Diary> getDiaryByUserId(Long userId);
}
