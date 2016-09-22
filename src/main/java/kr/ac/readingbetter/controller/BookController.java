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
import kr.ac.readingbetter.service.ReviewService;
import kr.ac.readingbetter.vo.BookVo;
import kr.ac.readingbetter.vo.QuizVo;
import kr.ac.readingbetter.vo.ReviewVo;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@Autowired
	private QuizService quizService;

	@Autowired
	private ReviewService reviewService;

	@RequestMapping("/booklist")
	public String bookList(Model model) {
		List<BookVo> list = bookService.getList();
		model.addAttribute("list", list);
		return "book/booklist";
	}

	@RequestMapping("/solvequizform")
	public String solveQuizForm() {
		return "book/solvequizform";
	}

	@RequestMapping(value = "/makequizform/{no}", method = RequestMethod.GET)
	public String makeQuizForm(@PathVariable("no") Long no, Model model) {
		BookVo vo = bookService.getByNo(no);
		model.addAttribute("vo", vo);
		return "book/makequizform";
	}

	@RequestMapping(value = "/makequizinsert", method = RequestMethod.POST)
	public String makequizInsert(@ModelAttribute QuizVo vo) {
		quizService.quizAddUser(vo);
		return "redirect:/book/booklist";
	}

	@RequestMapping("/resultquiz")
	public String resultQuiz() {
		return "book/resultquiz";
	}

	@RequestMapping(value = "/review/{no}", method = RequestMethod.GET)
	public String review(@PathVariable("no") Long no, Model model) {
		BookVo vo = reviewService.getByNo(no);
		List<ReviewVo> reviewlist = reviewService.getList();
		model.addAttribute("reviewlist", reviewlist);
		model.addAttribute("vo", vo);
		return "book/review";
	}

	@RequestMapping("/accusation")
	public String accusationform() {
		return "book/accusation";
	}
}