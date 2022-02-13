package com.new_pro.service;


import com.new_pro.javaBean.Department;
import com.new_pro.javaBean.User;

import java.util.List;

public interface DeptService {
    //查询全部部门
    public List<Department> getAllDepts(String keywords);

    int addDepts(Department dept);
}
