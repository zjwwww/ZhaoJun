package com.zhaojun.nov.springbootzhaojun.controller;

import com.zhaojun.nov.springbootzhaojun.doman.Diary;
import com.zhaojun.nov.springbootzhaojun.service.DiaryService;
import com.zhaojun.nov.springbootzhaojun.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @author DELL
 * @date 2022/4/24 17:03
 */
@RestController
public class DiaryController {

    @Autowired
    private DiaryService diaryService;

    /**
     * 查询所有日记
     */
    @GetMapping("/getAllDiary")
    public Result getAllDiary() {
        return Result.ok().data(diaryService.getAllDiary());
    }

    /**
     * 根据id查询日记
     */
    @GetMapping("/getDiaryById")
    public Result getDiaryById(Long id) {
        return Result.ok().data(diaryService.getDiaryById(id));
    }

    /**
     * 根据日记内容或名称模糊查询日记
     */
    @GetMapping("/getDiaryByLikeTitleOrContent")
    public Result getDiaryByLikeTitleOrContent(String content) {
        return Result.ok().data(diaryService.findByTitleContainingOrContentContaining(content));
    }

    /**
     * 根据用户查询日记
     */
    @GetMapping("/getDiaryByUserId")
    public Result getDiaryByUserId(Long userId) {
        return Result.ok().data(diaryService.getDiaryByUserId(userId));
    }
}
