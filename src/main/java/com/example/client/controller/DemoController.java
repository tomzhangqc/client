package com.example.client.controller;

import com.example.client.dto.EchartsData;
import com.example.client.feign.DemoClient;
import com.example.client.mongo.entity.RankEntity;
import com.example.client.service.RankService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangqingchun
 * @date 2020/10/29
 * @description
 */
@RestController
public class DemoController {

    @Autowired
    private RankService rankService;

    @Autowired
    private DemoClient demoClient;

    @RequestMapping("/test")
    public String test() {
        return demoClient.test() + "tom";
    }

    @RequestMapping("/getData")
    public EchartsData getData() {
        EchartsData echartsData = new EchartsData();
        List<Integer> seriesData = new ArrayList<>();
        List<String> xAxisData = new ArrayList<>();
        List<RankEntity> rankEntities = rankService.getRank();
        for (RankEntity rankEntity : rankEntities) {
            seriesData.add(rankEntity.getScore());
            xAxisData.add(rankEntity.getTitle());
        }
        echartsData.setSeriesData(seriesData);
        echartsData.setXAxisData(xAxisData);
        return echartsData;
    }
}
