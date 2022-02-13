package com.new_pro.service.impl;

import com.new_pro.javaBean.Department;
import com.new_pro.javaBean.User;
import com.new_pro.mapper.DepartmentMapper;
import com.new_pro.mapper.UserMapper;
import com.new_pro.service.DeptService;
import com.new_pro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired//自动装配
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> getAllDepts(String keywords) {
        return departmentMapper.getAllDepts(keywords);
    }

    @Override
    public int addDepts(Department dept) {
        return departmentMapper.insertSelective(dept);
    }
}
