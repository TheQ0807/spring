package com.sample.demo1.service;

import java.util.List;

import com.sample.demo1.vo.Job;

public interface JobService {

	void addNewJob(Job job);
	List<Job> getAllJobs();
}
