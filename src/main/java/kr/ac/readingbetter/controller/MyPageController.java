package kr.ac.readingbetter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage")
public class MyPageController {
	
	@RequestMapping("/joinform")
	public String JoinForm() {
		return "mypage/joinform";
	}
	
	@RequestMapping("/modifyform")
	public String ModifyForm() {
		return "mypage/modifyform";
	}
	
	@RequestMapping("/info")
	public String Info() {
		return "mypage/info";
	}
	
	@RequestMapping("/loginform")
	public String LoginForm() {
		return "mypage/loginform";
	}
	
	@RequestMapping("/findform")
	public String FindForm() {
		return "mypage/findform";
	}
	
	@RequestMapping("/history")
	public String History() {
		return "mypage/history";
	}
}