package com.freedom.mytest.provider.mapper;

import com.freedom.mytest.hello.common.UserInfo;


import java.util.List;

public interface UserInfoMapper  {
    List<UserInfo> selectUserInfoById(int id);
}
