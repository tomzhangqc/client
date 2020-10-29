package com.example.client.controller;

import com.example.client.feign.DemoClient;
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
    public String test(){
        return demoClient.test();
    }
}
