package com.example.demo.repository;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.entity.TweetEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TweetRepository extends CrudRepository<TweetEntity, String> {
    /*
    * ユーザーIDで絞ったツイートを全て取得するメソッド
    * user_id = : userId のように、SQLに登録した変数 = : エンティティのフィールド
    * @return List<TweetEntity>
     */
    @Query("SELECT * FROM tweets WHERE user_id = :userId")
    List<TweetEntity> findBy(@Param("userId") String userId);

}
