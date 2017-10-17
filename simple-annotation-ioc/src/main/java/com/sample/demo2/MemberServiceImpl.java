package com.sample.demo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl {

	//@Autowired
	@Resource(name="mysql")  //원래 자바가 가지고 있는 어노테이션
	private MemberDao memberDao;
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("객체 생성된 직후에.... 이코드는 실행된다.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("객체 파괴 직전에........ 이코드는 실행된다.");
	}
	
	public void removeAllMember() {
		memberDao.deleteAll();
	}
}
