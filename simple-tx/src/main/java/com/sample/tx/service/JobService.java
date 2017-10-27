package com.sample.tx.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sample.tx.vo.Job;

@Transactional
public interface JobService {

	void addAllJobs(List<Job> jobs);
}
