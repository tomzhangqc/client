package com.example.client.service;

import com.example.client.mongo.entity.RankEntity;
import java.util.List;

/**
 * @author zhangqingchun
 * @date 2020/11/17
 * @description
 */
public interface RankService {

    List<RankEntity> getRank();
}
