package com.new_pro.control;

import com.new_pro.javaBean.Department;
import com.new_pro.service.DeptService;
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
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping(value = "/getAllDepts",method = RequestMethod.POST)
    @ResponseBody
    public List<Department> getAllDepts(@RequestBody Map<String,String> map){
        return deptService.getAllDepts(map.get("keywords"));
    }
    @RequestMapping(value = "/addDept",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> addDept(@RequestBody Department dept){
        Map<String,Object> map = new HashMap<>();
        int i = deptService.addDepts(dept);
        if(i>0) map.put("msg","添加部门成功");
        else map.put("msg","添加部门失败");
        return map;
    }
}
