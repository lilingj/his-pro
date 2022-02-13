package com.new_pro.mapper;

import com.new_pro.javaBean.PatientCosts;

public interface PatientCostsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PatientCosts record);

    int insertSelective(PatientCosts record);

    PatientCosts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PatientCosts record);

    int updateByPrimaryKey(PatientCosts record);
}