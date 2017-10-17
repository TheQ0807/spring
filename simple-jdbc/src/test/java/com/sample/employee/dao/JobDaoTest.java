package com.sample.employee.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sample.employee.vo.Job;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/META-INF/spring/app-context.xml")
public class JobDaoTest {

	@Autowired
	JobDao jobDao;
	
	@Test
	public void testGetAllJobs() {
		List<Job> jobs = jobDao.getAllJobs();
		
		Assert.assertEquals(20, jobs.size());
	}
	
	@Test
	public void testGetJobsBySalary() {
		List<Job> jobs17000 = jobDao.getJobsBySalary(17000);
		List<Job> jobs10000 = jobDao.getJobsBySalary(10000);
		List<Job> jobs10001 = jobDao.getJobsBySalary(10001);
		
		Assert.assertEquals(2, jobs17000.size());
		Assert.assertEquals(9, jobs10000.size());
		Assert.assertEquals(8, jobs10001.size());
		
	}
}
