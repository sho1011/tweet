package com.example.demo.service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.entity.TweetEntity;
import com.example.demo.repository.TweetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TweetService {
    private final TweetRepository tweetRepository;

    /*
    *全てのTweetEntityを取得するメソッド
    * @return Iterable<TweetEntity> エンティティの入ったリスト
     */
    public Iterable<TweetEntity> findAll(){
        System.out.println(tweetRepository.findAll());
        return tweetRepository.findAll();
    }

    /*
     *あるユーザーののTweetEntityを取得するメソッド
     * @param ユーザーID
     * @return そのユーザーが持つTweetEntity
     */
    public List<TweetEntity> findBy(String userId){
        return tweetRepository.findBy(userId);
    }


}
