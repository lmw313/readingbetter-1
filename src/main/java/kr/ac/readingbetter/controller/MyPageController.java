package kr.ac.readingbetter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage")
public class MyPageController {
	
	@RequestMapping("/joinform")
	public String joinForm() {
		return "mypage/joinform";
	}
	
	@RequestMapping("/modifyform")
	public String modifyForm() {
		return "mypage/modifyform";
	}
	
	@RequestMapping("/info")
	public String info() {
		return "mypage/info";
	}
	
	@RequestMapping("/loginform")
	public String loginForm() {
		return "mypage/loginform";
	}
	
	@RequestMapping("/findform")
	public String findForm() {
		return "mypage/findform";
	}
	
	@RequestMapping("/history")
	public String history() {
		return "mypage/history";
	}
}