package org.gec.service.impl;

import org.gec.mapper.UserMapper;
import org.gec.pojo.User;
import org.gec.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User userLogin(String username, String password) {
        return userMapper.userLogin(username,password);
    }
}
