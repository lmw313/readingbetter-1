package kr.ac.readingbetter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.readingbetter.service.BookService;
import kr.ac.readingbetter.service.QuizService;
import kr.ac.readingbetter.vo.BookVo;
import kr.ac.readingbetter.vo.QuizVo;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@Autowired
	QuizService quizService;
	
	@RequestMapping("/booklist")
	public String BookList(Model model) {
		List<BookVo> list = bookService.getList();
		model.addAttribute("list", list);
		return "book/booklist";
	}
	
	@RequestMapping("/solvequizform")
	public String SolveQuizForm() {		
		return "book/solvequizform";
	}	
	
	@RequestMapping(value = "/makequizform/{no}", method = RequestMethod.GET)
	public String MakeQuizForm(@PathVariable("no") Long no, Model model) {	
		BookVo vo = bookService.getByNo(no);
		model.addAttribute("vo",vo);
		return "book/makequizform";
	}
	
	@RequestMapping(value = "/makequizinsert", method =RequestMethod.POST)
	public String MakequizInsert(@ModelAttribute QuizVo vo) {
		quizService.quizAddUser(vo);
		return "redirect:/book/booklist";
	}
	
	@RequestMapping("/review")
	public String Review() {		
		return "book/review";
	}
	
	@RequestMapping("/resultquiz")
	public String ResultQuiz() {		
		return "book/resultquiz";
	}
}