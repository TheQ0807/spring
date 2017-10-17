package com.sample.demo1.dao;

import java.util.List;

import com.sample.demo1.vo.Job;

public interface JobDao {

	void addJob(Job job);
	List<Job> getAllJobs();
}
