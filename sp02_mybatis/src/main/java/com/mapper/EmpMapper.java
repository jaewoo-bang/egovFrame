package com.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpMapper {
	List<Employee> selectall();	//전체조회
	Map selectone(int id);	//단건조회
}
