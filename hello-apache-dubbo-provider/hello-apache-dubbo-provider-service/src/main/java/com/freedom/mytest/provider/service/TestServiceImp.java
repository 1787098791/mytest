package com.freedom.mytest.provider.service;

import com.freedom.mytest.hello.common.UserInfo;
import com.freedom.mytest.provider.api.TestService;
import com.freedom.mytest.provider.mapper.UserInfoMapper;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service(version = "1.0.0",interfaceName = "com.freedom.mytest.provider.api.TestService")
public class TestServiceImp implements TestService {
    @Resource
    private UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> test(int id) {
       /* List<UserInfo> list = new ArrayList<>();
        UserInfo userInfo = new UserInfo(1, "小明", "123");
        UserInfo userInfo2 = new UserInfo(2, "小明明", "1234");
        UserInfo userInfo3 = new UserInfo(3, "小明明", "12345");
        list.add(userInfo);
        list.add(userInfo2);
        list.add(userInfo3);*/
        List<UserInfo> list = userInfoMapper.selectUserInfoById(id);

        return list;
    }
}
