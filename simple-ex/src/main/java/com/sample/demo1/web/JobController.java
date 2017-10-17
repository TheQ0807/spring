package com.sample.demo1.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.demo1.service.JobService;
import com.sample.demo1.vo.Job;

@Controller
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@RequestMapping("/list.do")
	public String jobs(Model model) {
		
		List<Job> jobs = jobService.getAllJobs();
		model.addAttribute("jobs",jobs);
		
		return "alllist";
	}
	
}
