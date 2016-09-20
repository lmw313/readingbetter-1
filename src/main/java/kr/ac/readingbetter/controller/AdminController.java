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

	// 상점 관리
	@RequestMapping("/shoplist")
	public String ShopList() {
		return "admin/shoplist";
	}

	@RequestMapping("/shopaddform")
	public String ShopAddForm() {
		return "admin/shopaddform";
	}

	// 카드 관리
	@RequestMapping("/cardlist")
	public String CardList() {
		return "admin/cardlist";
	}

	@RequestMapping("/cardmodifyform")
	public String CardModifyForm() {
		return "admin/cardmodifyform";
	}

	@RequestMapping("/cardaddform")
	public String CardAddForm() {
		return "admin/cardaddform";
	}

	// 퀴즈 관리
	@RequestMapping("/quizlist")
	public String QuizList() {
		return "admin/quizlist";
	}

	@RequestMapping("/quizaddform")
	public String QuizAddForm() {
		return "admin/quizaddform";
	}

	@RequestMapping("/quizview")
	public String QuizView() {
		return "admin/quizview";
	}
}