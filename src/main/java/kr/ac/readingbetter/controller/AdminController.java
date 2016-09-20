package kr.ac.readingbetter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping("/main")
	public String main() {
		return "admin/main";
	}

	// 카드 관리
	@RequestMapping("/cardlist")
	public String cardList() {
		return "admin/cardlist";
	}

	@RequestMapping("/cardmodifyform")
	public String cardModifyForm() {
		return "admin/cardmodifyform";
	}

	@RequestMapping("/cardaddform")
	public String cardAddForm() {
		return "admin/cardaddform";
	}
}