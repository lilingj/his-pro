package com.new_pro.service.impl;

import com.new_pro.javaBean.User;
import com.new_pro.mapper.UserMapper;
import com.new_pro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired//自动装配
    private UserMapper userMapper;
    @Override
    public User login(String username, String password) {
        return userMapper.userLogin(username,password);
    }

    @Override
    public List<User> getAllUsers(String keywords) {
        return userMapper.getAllUsers(keywords);
    }

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int deleteUserById(Integer userId) {
        return userMapper.deleteUserById(userId);
    }
}
