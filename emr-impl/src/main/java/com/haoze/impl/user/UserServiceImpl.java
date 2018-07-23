package com.haoze.impl.user;

import com.haoze.api.user.UserService;
import com.haoze.frameutils.OcsCache;
import com.haoze.model.user.UserInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/7/22.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService{

    @Override
    public List<UserInfo> list() {
        List<UserInfo> list = new ArrayList();
        UserInfo userInfo = new UserInfo();
        userInfo.setId("111");
        userInfo.setUserName("张三");
        list.add(userInfo);
        userInfo = new UserInfo();
        userInfo.setId("222");
        userInfo.setUserName("李四");
        list.add(userInfo);
        System.out.println(OcsCache.get("test")+"****");
        return list;
    }
}
