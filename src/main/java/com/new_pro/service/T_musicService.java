package com.new_pro.service;

import com.new_pro.javaBean.Music;
import com.new_pro.javaBean.T_music;

import java.util.List;

public interface T_musicService {
    public List<T_music> getAllT_music(String keywords);

    public int addT_music(T_music t_music);

    public int updateT_music(T_music t_music);

    int deleteT_musicById(int id);
}
