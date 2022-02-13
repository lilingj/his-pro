package com.new_pro.mapper;

import com.new_pro.javaBean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    //登录
    User userLogin(@Param("uname") String username, @Param("upass") String password);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int deleteUserById(@Param("id") int id);

    List<User> getAllUsers(@Param("keywords") String keywords);
}