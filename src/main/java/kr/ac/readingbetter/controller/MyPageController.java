package kr.ac.readingbetter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.readingbetter.service.MemberService;
import kr.ac.readingbetter.vo.MemberVo;

@Controller
@RequestMapping("/mypage")
public class MyPageController {
	@Autowired
	private MemberService memberService;

	@RequestMapping("/modifyform")
	public String ModifyForm() {
		return "mypage/modifyform";
	}

	@RequestMapping("/info")
	public String Info(HttpSession session, Model model) {
		MemberVo authUser = (MemberVo) session.getAttribute("authUser");

		MemberVo memberVo = memberService.selectMyinfo(authUser.getNo());

		model.addAttribute("memberVo", memberVo);

		return "mypage/info";
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