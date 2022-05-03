package com.zhaojun.nov.springbootzhaojun.service.impl;

import com.zhaojun.nov.springbootzhaojun.dao.CategoryDao;
import com.zhaojun.nov.springbootzhaojun.dao.DiaryDao;
import com.zhaojun.nov.springbootzhaojun.dao.UserDao;
import com.zhaojun.nov.springbootzhaojun.doman.Diary;
import com.zhaojun.nov.springbootzhaojun.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author DELL
 * @date 2022/4/24 16:24
 */
@Service
public class DiaryServiceImpl implements DiaryService {

    @Autowired
    private DiaryDao diaryDao;

    @Autowired
    private UserDao userDao;

    @Override
    public Iterable<Diary> getAllDiary() {
        return diaryDao.findAll();
    }

    @Override
    public Optional<Diary> getDiaryById(Long id) {
        return diaryDao.findById(id);
    }

    @Override
    public List<Diary> findByTitleContainingOrContentContaining(String content) {
        return diaryDao.findByTitleContainingOrContentContaining(content,content);
    }

    @Override
    public List<Diary> getDiaryByUserId(Long userId) {

        return userDao.findById(userId).get().getDiaries();
    }
}
