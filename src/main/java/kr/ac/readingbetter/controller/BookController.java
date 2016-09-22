package kr.ac.readingbetter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

	// 책 리스트
	@RequestMapping("/booklist")
	public String bookList(Model model) {
		List<BookVo> list = bookService.getList();
		model.addAttribute("list", list);
		return "book/booklist";
	}

	// 퀴즈 풀기 화면 열기
	@RequestMapping("/solvequizform")
	public String solveQuizForm(Model model, @RequestParam(value="no", required=false, defaultValue="") Long no) {
		final Integer COUNT = 0;
		final Integer MAXCOUNT = 4;
		
		List<QuizVo> list = quizService.selectQuiz(no);
		BookVo vo = bookService.getByNo(no);
				
		model.addAttribute("list", list);
		model.addAttribute("vo", vo);
		model.addAttribute("count", COUNT);
		model.addAttribute("maxcount", MAXCOUNT);
		
		return "book/solvequizform";
	}

	// 퀴즈 내기 화면 열기
	@RequestMapping(value = "/makequizform/{no}", method = RequestMethod.GET)
	public String makeQuizForm(@PathVariable("no") Long no, Model model) {
		BookVo vo = bookService.getByNo(no);
		model.addAttribute("vo", vo);
		return "book/makequizform";
	}

	// 퀴즈 내기
	@RequestMapping(value = "/makequizinsert", method = RequestMethod.POST)
	public String makequizInsert(@ModelAttribute QuizVo vo) {
		quizService.quizAddUser(vo);
		return "redirect:/book/booklist";
	}

	// 퀴즈 풀기 결과 보기
	@RequestMapping("/resultquiz")
	public String resultQuiz(QuizVo vo, 
			@RequestParam(value="no0", required=false, defaultValue="") Long no1,
			@RequestParam(value="no1", required=false, defaultValue="") Long no2,
			@RequestParam(value="no2", required=false, defaultValue="") Long no3,
			@RequestParam(value="no3", required=false, defaultValue="") Long no4,
			@RequestParam(value="no4", required=false, defaultValue="") Long no5,
			@RequestParam(value="selectedRadio0", required=false, defaultValue="") String answer1,
			@RequestParam(value="selectedRadio1", required=false, defaultValue="") String answer2,
			@RequestParam(value="selectedRadio2", required=false, defaultValue="") String answer3,
			@RequestParam(value="selectedRadio3", required=false, defaultValue="") String answer4,
			@RequestParam(value="selectedRadio4", required=false, defaultValue="") String answer5) {
		Long no[] = {no1, no2, no3, no4, no5};
		String answer[] = {answer1, answer2, answer3, answer4, answer5};
		Integer count = 0;
		Integer len = no.length;
		
		for(int i = 0; i < len; i++){
			vo.setNo(no[i]);
			vo.setSelected(answer[i]);
			
			QuizVo vo2 = quizService.selectResult(vo);
			if(vo2 != null){
				count++;
			}
		}
		return "book/resultquiz";
	}

	// 리뷰 화면 열기
	@RequestMapping(value = "/review/{no}", method = RequestMethod.GET)
	public String review(@PathVariable("no") Long no, Model model) {
		BookVo vo = reviewService.getByNo(no);
		List<ReviewVo> reviewlist = reviewService.getList();
		model.addAttribute("reviewlist", reviewlist);
		model.addAttribute("vo", vo);
		return "book/review";
	}

	// 리뷰 신고 화면 열기
	@RequestMapping("/accusation")
	public String accusationform() {
		return "book/accusation";
	}
}