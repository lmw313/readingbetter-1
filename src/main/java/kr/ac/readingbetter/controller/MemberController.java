package kr.ac.readingbetter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

	@RequestMapping("/loginform")
	public String loginForm() {
		return "member/loginform";
	}

	@RequestMapping("/joinform")
	public String joinForm() {
		return "member/joinform";
	}
}