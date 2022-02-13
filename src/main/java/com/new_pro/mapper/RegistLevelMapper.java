package com.new_pro.mapper;

import com.new_pro.javaBean.RegistLevel;

public interface RegistLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegistLevel record);

    int insertSelective(RegistLevel record);

    RegistLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegistLevel record);

    int updateByPrimaryKey(RegistLevel record);
}