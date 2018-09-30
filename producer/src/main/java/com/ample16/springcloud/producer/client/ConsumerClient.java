package com.ample16.springcloud.producer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("consumer")
public interface ConsumerClient {
    @GetMapping("/user/userInfo")
    void testCallConsumer();
}
