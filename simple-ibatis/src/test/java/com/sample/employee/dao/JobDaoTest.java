package com.sample.employee.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/META-INF/spring/app-context.xml")
public class JobDaoTest {

	@Autowired
	JobDao jobDao;
	
	@Test
	public void testGetAllJobs() {
		Assert.assertEquals(20, jobDao.getAllJobs().size());
	}
}
