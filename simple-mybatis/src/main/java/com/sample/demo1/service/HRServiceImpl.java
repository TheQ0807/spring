package com.sample.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo1.mappers.EmployeeMapper;
import com.sample.demo1.vo.Employee;

@Service
public class HRServiceImpl implements HRService{
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public List<Employee> getAllemployees() {
		List<Employee> employees = employeeMapper.getAllEmployees();
		if(employees.isEmpty()) {
			throw new RuntimeException("조회결과가 존재 하지 않습니다.");
		}
		//System.out.println("죄회된 사원 수 :"+employees.size());
		return employees;
	}
}
