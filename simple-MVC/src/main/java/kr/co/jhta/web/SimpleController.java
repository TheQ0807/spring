package kr.co.jhta.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleController {

	@RequestMapping("/home.do")
	public String home() {
		
		return "home.jsp";
	}
	
	@RequestMapping("/users.do")
	public String getUsers(Model model) {
		
		
		model.addAttribute("title", "영업부 사원리스트");
		model.addAttribute("date", "2017년 10월 19일");
		model.addAttribute("users", Arrays.asList("홍길동", "김유신", "강감찬"));
		//List<User> currentUserList = userService.getCurrentUsers();
		//model.addAttribute("users", currentUserList);
		return "userlist.jsp";
	}
	
	@RequestMapping("/about.do")
	public ModelAndView about() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("quest1","화장실은 어디인가요?");
		mav.addObject("quest2","비상계단은 어디에 있나요?");
		mav.addObject("quest3","구급약품은 어디에 있나요?");
		
		mav.setViewName("about.jsp");
		
		return mav;
	}
}
