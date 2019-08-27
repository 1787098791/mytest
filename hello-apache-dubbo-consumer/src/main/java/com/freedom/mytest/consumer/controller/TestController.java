package com.freedom.mytest.consumer.controller;

import com.freedom.mytest.hello.common.UserInfo;
import com.freedom.mytest.provider.api.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    //无服务注册与发现中心时需设置提供方dubbo协议的url
    @Reference(version = "1.0.0",url = "dubbo://localhost:8081")
    private TestService testService;

    @RequestMapping("/userinfo")
    public Object testUserInfo(@RequestParam int id){

        List<UserInfo> test = testService.test(id);
        return test;
    }
}
