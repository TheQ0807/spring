package com.sample.demo1.service;

import java.util.List;

import com.sample.demo1.dao.JobDao;
import com.sample.demo1.vo.Job;

public class JobServiceImpl implements JobService {

	private JobDao jobDao;
	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}
	
	@Override
	public void addNewJob(Job job) {
		jobDao.addJob(job);
	}
	
	@Override
	public List<Job> getAllJobs() {
		return jobDao.getAllJobs();
	}
}
