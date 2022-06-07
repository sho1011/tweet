package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("TWEETS")
public class TweetEntity {
    /*
    *ツイートのID
     */
    @Id
    private final String tweetId;
    /*
    *ユーザーID
     */
    private String userId;
    /*
    *ユーザーの名前
     */
    private String name;
    /*
    *ツイートの題名
     */
    private String subject;
    /*
    *ツイートの内容
     */
    private String content;
}
