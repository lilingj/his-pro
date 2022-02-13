package com.new_pro.service.impl;

import com.new_pro.javaBean.T_music;
import com.new_pro.mapper.T_musicMapper;
import com.new_pro.service.T_musicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T_musicServiceImpl implements T_musicService{
    @Autowired
    T_musicMapper t_musicMapper;

    public List<T_music> getAllT_music(String keywords) {
        System.out.println(keywords+"=================");
        return t_musicMapper.getAllT_music(keywords);
    }

    public int addT_music(T_music t_music) {
        return t_musicMapper.insertSelective(t_music);
    }


    public int updateT_music(T_music t_music) {
        return t_musicMapper.updateByPrimaryKeySelective(t_music);
    }

    @Override
    public int deleteT_musicById(int id) {
        return t_musicMapper.deleteT_musicById(id);
    }
}
