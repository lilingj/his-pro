package com.new_pro.service;

import com.new_pro.javaBean.Department;
import com.new_pro.javaBean.Music;

import java.util.List;

public interface MusicService {
    public List<Music> getAllMusic(String keywords);

    public int addMusic(Music music);

    public int updateMusic(Music music);
}
