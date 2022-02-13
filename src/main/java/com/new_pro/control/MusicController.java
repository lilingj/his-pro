package com.new_pro.control;

import com.new_pro.javaBean.Music;
import com.new_pro.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MusicController {
    @Autowired
    private MusicService musicService;
    @RequestMapping(value = "/getAllMusic",method = RequestMethod.POST)
    @ResponseBody
    public List<Music> getAllMusic(@RequestBody Map<String,String> map){
        System.out.println(map.get("keywords")+"=================");
        return musicService.getAllMusic(map.get("keywords"));
    }
    @RequestMapping(value = "/addMusic",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> addDept(@RequestBody Music music){
        Map<String,Object> map = new HashMap<>();
        int i = musicService.addMusic(music);
        if(i>0) map.put("msg","添加音乐成功");
        else map.put("msg","添加音乐失败");
        return map;
    }
    @RequestMapping(value = "/updateMusic",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> updateUser(@RequestBody Music music){
        Map<String,Object> map = new HashMap<>();
        int i = musicService.updateMusic(music);
        if(i>0) map.put("msg","用户修改成功！");
        else map.put("msg","用户修改失败！");
        return map;
    }
}
