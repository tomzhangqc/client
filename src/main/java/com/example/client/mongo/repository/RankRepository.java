package com.example.client.mongo.repository;

import com.example.client.mongo.entity.RankEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

/**
 * @author zhangqingchun
 * @date 2020/11/17
 * @description
 */
@Repository
public class RankRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    public List<RankEntity> getRank() {
        Query query = new Query();
        query.limit(10);
        List<RankEntity> rankEntities = mongoTemplate.find(query, RankEntity.class);
        return rankEntities;
    }

}
