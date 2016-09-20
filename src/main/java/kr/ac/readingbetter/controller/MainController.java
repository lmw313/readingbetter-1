package kr.ac.readingbetter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.readingbetter.service.MemberService;
import kr.ac.readingbetter.vo.MemberVo;

@Controller
@RequestMapping("/main")
public class MainController {

	@Autowired
	private MemberService memberService;

	@RequestMapping("")
	public String Main() {
		return "main/main";
	}

	// 네비
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(MemberVo vo, HttpSession session) {

		MemberVo authUser = memberService.selectAuthUser(vo);

		if (authUser == null) {
			return "redirect:/main";
		}

		// 인증 성공
		session.setAttribute("authUser", authUser);

		return "redirect:/main";
	}

	// 헤더
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("authUser");
		session.invalidate();

		return "redirect:/main";
	}

	// 푸터
	@RequestMapping("/manual")
	public String Manual() {
		return "main/manual";
	}

	@RequestMapping("/siteinfo")
	public String SiteInfo() {
		return "main/siteinfo";
	}

	@RequestMapping("/sitemap")
	public String SiteMap() {
		return "main/sitemap";
	}
}