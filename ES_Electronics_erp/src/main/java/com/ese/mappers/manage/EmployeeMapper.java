package com.ese.mappers.manage;

import java.util.List;

import com.ese.vo.afterservice.Center;
import com.ese.vo.hr.Department;
import com.ese.vo.hr.Employee;

public interface EmployeeMapper {

	List<Employee> getAllEmp();
	void addEmp(Employee employee);
	int getEmpSeq();
	List<Employee> getByDetpId(String deptId);
	List<Employee> getByKeyword(String keyword);
	List<Center> getAllCenter();
	List<Employee> getEmployeeByCenterId(String centerId);

}