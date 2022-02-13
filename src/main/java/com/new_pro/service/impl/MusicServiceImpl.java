package com.new_pro.service.impl;

import com.new_pro.javaBean.Music;
import com.new_pro.mapper.MusicMapper;
import com.new_pro.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    MusicMapper musicMapper;
    @Override
    public List<Music> getAllMusic(String keywords) {
        System.out.println(keywords+"=================");
        return musicMapper.getAllMusic(keywords);
    }

    @Override
    public int addMusic(Music music) {
        return musicMapper.insertSelective(music);
    }

    @Override
    public int updateMusic(Music music) {
        return musicMapper.updateByPrimaryKeySelective(music);
    }
}
