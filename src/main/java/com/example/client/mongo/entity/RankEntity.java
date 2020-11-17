package com.example.client.mongo.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author zhangqingchun
 * @date 2020/11/17
 * @description
 */
@Data
@Document(collection = "rank")
public class RankEntity {

    @Field("num")
    private Integer num;

    @Field("title")
    private String title;

    @Field("score")
    private Integer score;
}
