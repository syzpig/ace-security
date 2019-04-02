package com.syz.springcloud.test.aceservicetest;

import com.github.wxiaoqi.security.auth.client.EnableAceAuthClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
// 开启服务鉴权
@EnableFeignClients({"com.github.wxiaoqi.security.auth.client.feign"})
@EnableAceAuthClient
@SpringBootApplication
public class AceServiceTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AceServiceTestApplication.class, args);
    }

}
