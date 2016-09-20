package kr.ac.readingbetter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.readingbetter.service.BookService;
import kr.ac.readingbetter.vo.BookVo;

@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookService adminBookService;
	
	@RequestMapping("/booklist")
	public String bookList(Model model) {
		List<BookVo> list = adminBookService.getList();
		model.addAttribute("list", list);
		return "book/booklist";
	}
	
	@RequestMapping("/solvequizform")
	public String solveQuizForm() {		
		return "book/solvequizform";
	}
	
	@RequestMapping("/makequizform")
	public String makeQuizForm() {		
		return "book/makequizform";
	}
	
	@RequestMapping("/review")
	public String review() {		
		return "book/review";
	}
	
	@RequestMapping("/resultquiz")
	public String resultQuiz() {		
		return "book/resultquiz";
	}
}