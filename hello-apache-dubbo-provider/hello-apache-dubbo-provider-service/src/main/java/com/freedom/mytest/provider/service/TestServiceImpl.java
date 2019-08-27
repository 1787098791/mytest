package com.freedom.mytest.provider.service;

import com.freedom.mytest.hello.common.UserInfo;
import com.freedom.mytest.provider.api.TestService;
import com.freedom.mytest.provider.mapper.UserInfoMapper;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {
    @Resource
    private UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> test(int id) {

        List<UserInfo> list = userInfoMapper.selectUserInfoById(id);

        return list;
    }
}
