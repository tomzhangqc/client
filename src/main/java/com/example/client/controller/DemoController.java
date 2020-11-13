package com.example.client.controller;

import com.example.client.dto.EchartsData;
import com.example.client.feign.DemoClient;
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
    DemoClient demoClient;

    @RequestMapping("/test")
    public String test() {
        return demoClient.test() + "tom";
    }

    @RequestMapping("/getData")
    public EchartsData getData() {
        EchartsData echartsData = new EchartsData();
        List<Integer> seriesData = new ArrayList<>();
        List<String> xAxisData = new ArrayList<>();
        seriesData.add(10);
        seriesData.add(20);
        seriesData.add(30);
        seriesData.add(40);
        seriesData.add(50);
        xAxisData.add("北京");
        xAxisData.add("上海");
        xAxisData.add("广州");
        xAxisData.add("深圳");
        xAxisData.add("南京");
        echartsData.setSeriesData(seriesData);
        echartsData.setXAxisData(xAxisData);
        return echartsData;
    }
}
