package com.example.demo.controller;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.entity.TweetEntity;
import com.example.demo.service.TweetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TweetController {
    private final TweetService tweetService;

    /*
    *あるユーザーIDのツイートを全て表示するメソッド
    * @param　String ゆーざーID
    * return Iterable<TweetEntity> そのユーザーのエンティティを全て入れたリスト
     */
    @GetMapping("/tweets/{userId}")
    public Iterable<TweetEntity> get(@PathVariable("userId") String userId){
        return tweetService.findBy(userId);
    }

    /*
    *全てのツイートエンティティを取得するメソッド
    * @return Iterable<TweetEntity> 全てのツイートエンティティを入れたリスト
     */
    @GetMapping("/tweets")
    public Iterable<TweetEntity> get(){
        System.out.println(tweetService.findAll());
        return tweetService.findAll(); }
}
