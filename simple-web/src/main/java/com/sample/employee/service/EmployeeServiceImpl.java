package com.sample.employee.service;

import java.util.List;

import com.sample.employee.dao.JobDao;
import com.sample.employee.vo.Job;

public class EmployeeServiceImpl implements EmployeeService {

	private JobDao jobDao;
	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}
	
	@Override
	public void addNewJob(Job job) {
		/*
		 이미 등록된 Job인지 확인하는 코드...
		if(jobDao.getJob(job.getId()) != null) {
		throw new HRExcption("이미 등록된 job 입니다.");
		}
		*/
		jobDao.addJob(job);
	}
	
	@Override
	public List<Job> getAllJobs() {
		return jobDao.getAllJobs();
	}
}
