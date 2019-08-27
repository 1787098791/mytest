package com.freedom.mytest.provider.api;

import com.freedom.mytest.hello.common.UserInfo;

import java.util.List;


public interface TestService {
    List<UserInfo> test(int id);
}
