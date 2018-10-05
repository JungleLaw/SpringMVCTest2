package cn.law.springmvc.demo.service.impl;

import cn.law.springmvc.demo.mapping.UserMapper;
import cn.law.springmvc.demo.pojo.User;
import cn.law.springmvc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insertSelective(user);
    }
}
