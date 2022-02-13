package com.new_pro.control;

import com.new_pro.javaBean.T_music;
import com.new_pro.service.T_musicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class T_musicController {
    @Autowired
    private T_musicService t_musicService;

    @RequestMapping(value = "/getAllT_music", method = RequestMethod.POST)
    @ResponseBody
    public List<T_music> getAllT_music(@RequestBody Map<String, String> map) {
        System.out.println(map.get("keywords") + "=================");
        return t_musicService.getAllT_music(map.get("keywords"));
    }
    @RequestMapping(value = "/addT_music",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> addT_music(@RequestBody T_music t_music){
        Map<String,Object> map = new HashMap<>();
        int i = t_musicService.addT_music(t_music);
        if(i>0) map.put("msg","添加音乐成功");
        else map.put("msg","添加音乐失败");
        return map;
    }
    @RequestMapping(value = "/updateT_music",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> updateT_music(@RequestBody T_music t_music){
        Map<String,Object> map = new HashMap<>();
        int i = t_musicService.updateT_music(t_music);
        if(i>0) map.put("msg","音乐修改成功！");
        else map.put("msg","音乐修改失败！");
        return map;
    }
    @RequestMapping(value="/deleteT_musicById",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> deleteUserById(@RequestParam int id){
        Map<String,Object> map=new HashMap<>();
        int i =t_musicService.deleteT_musicById(id);
        if(i>0) map.put("msg","音乐删除成功");
        else map.put("msg","音乐删除失败");
        return map;
    }
}
