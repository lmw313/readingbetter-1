package kr.ac.readingbetter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@RequestMapping("/booklist")
	public String bookList() {		
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