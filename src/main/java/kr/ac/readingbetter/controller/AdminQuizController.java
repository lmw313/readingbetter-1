package kr.ac.readingbetter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.readingbetter.service.AdminQuizService;
import kr.ac.readingbetter.vo.BookVo;
import kr.ac.readingbetter.vo.QuizVo;

@Controller
@RequestMapping("/admin")
public class AdminQuizController {
	
	@Autowired
	private AdminQuizService adminQuizService;

	// 퀴즈 관리
	@RequestMapping(value = "/quizlist", method = RequestMethod.GET)
	public String quizList(Model model) {
		List<QuizVo> list = adminQuizService.getList();
		model.addAttribute("list", list);
		return "admin/quizlist";
	}
	
	@RequestMapping(value = "/quizview/{no}", method = RequestMethod.GET)
	public String quizView(@PathVariable("no") Long no, Model model) {
		QuizVo vo = adminQuizService.quizView(no);
		model.addAttribute("vo", vo);
		return "admin/quizview";
	}
	
	@RequestMapping(value = "/quizUpdate", method = RequestMethod.POST)
	public String quizUpdate(@ModelAttribute QuizVo vo) {
		adminQuizService.quizUpdate(vo);
		return "redirect:/admin/quizlist";
	}
	
	@RequestMapping(value = "/quizaddbook", method = RequestMethod.GET)
	public String quizAddBook(Model model) {
		List<BookVo> bookList = adminQuizService.getBookList();
		model.addAttribute("bookList", bookList);
		return "admin/quizaddbook";
	}

	@RequestMapping(value = "/quizaddform/{no}", method = RequestMethod.GET)
	public String quizAddForm(@PathVariable("no") Long no, Model model) {
		BookVo bookVo = adminQuizService.getBook(no);
		model.addAttribute("bookVo", bookVo);
		return "admin/quizaddform";
	}
	
	@RequestMapping(value = "/quizadd", method = RequestMethod.POST)
	public String quizAdd(@ModelAttribute QuizVo vo) {
		adminQuizService.quizAdd(vo);
		return "redirect:/admin/quizlist";
	}
}