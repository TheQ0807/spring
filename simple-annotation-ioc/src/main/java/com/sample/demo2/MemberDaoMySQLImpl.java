package com.sample.demo2;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MemberDaoMySQLImpl implements MemberDao {

	public void deleteAll() {
		System.out.println("mysql 에서 모든정보 삭제....");
	}
}
