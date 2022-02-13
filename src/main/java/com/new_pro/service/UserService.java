package com.new_pro.service;


import com.new_pro.javaBean.User;

import java.util.List;
import java.util.Map;

public interface  UserService {
    //登陆
    public User login(String username, String password);
    public List<User> getAllUsers(String keywords);

    int addUser(User user);

    int updateUser(User user);

    int deleteUserById(Integer userId);
}
