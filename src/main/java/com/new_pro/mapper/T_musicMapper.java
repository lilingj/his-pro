package com.new_pro.mapper;

import com.new_pro.javaBean.T_music;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface T_musicMapper {
    int deleteByPrimaryKey(String muId);

    int insert(T_music record);

    int insertSelective(T_music record);

    T_music selectByPrimaryKey(String muId);

    int updateByPrimaryKeySelective(T_music record);

    int updateByPrimaryKeyWithBLOBs(T_music record);

    int updateByPrimaryKey(T_music record);

    int deleteT_musicById(@Param("muId") int muId);

    List<T_music> getAllT_music(String keywords);
}