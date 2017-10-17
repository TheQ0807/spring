package com.sample.employee.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.employee.service.EmployeeService;
import com.sample.employee.vo.Job;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/list.do")
	public String jobs(Model model) {
		
		List<Job> jobs = employeeService.getAllJobs();
		model.addAttribute("jobs",jobs);
		
		
		return "joblist";
	}
}
