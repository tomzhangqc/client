package com.example.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author zhangqingchun
 * @date 2020/10/29
 * @description
 */
@FeignClient(value = "server")
public interface DemoClient {

    @PostMapping("/demo")
    String test();
}
