package com.example.client.service.impl;

import com.example.client.mongo.entity.RankEntity;
import com.example.client.mongo.repository.RankRepository;
import com.example.client.service.RankService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangqingchun
 * @date 2020/11/17
 * @description
 */
@Service
public class RankServiceImpl implements RankService {

    @Autowired
    RankRepository rankRepository;

    @Override
    public List<RankEntity> getRank() {
        return rankRepository.getRank();
    }
}
