package com.sample.demo1.dao;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import com.sample.demo1.vo.Job;

public class JobDaoClass implements JobDao {

	private SqlMapClientTemplate template;
	public void setTemplate(SqlMapClientTemplate template) {
		this.template = template;
	}
	
	@Override
	public void addJob(Job job) {
		template.insert("addJob",job);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Job> getAllJobs() {
		return template.queryForList("getAllJobs");
	}
}
