package kr.ac.readingbetter.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.readingbetter.service.AccusationService;
import kr.ac.readingbetter.service.BookService;
import kr.ac.readingbetter.service.QuizService;
import kr.ac.readingbetter.service.ReviewService;
import kr.ac.readingbetter.vo.AccusationVo;
import kr.ac.readingbetter.vo.BookVo;
import kr.ac.readingbetter.vo.MemberVo;
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

	@Autowired
	private AccusationService accusationService;

	// 책 리스트
	@RequestMapping("/booklist")
	public String bookList(Model model, BookVo bookvo) {
		if (bookvo.getBkwd() == null) {
			bookvo.setBkwd("");
		}
		List<BookVo> list = bookService.getListKwd(bookvo);
		model.addAttribute("list", list);
		return "book/booklist";
	}

	// 퀴즈 풀기 화면 열기
	@RequestMapping("/solvequizform")
	public String solveQuizForm(Model model, @RequestParam(value = "no", required = false, defaultValue = "") Long no) {
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
	public String resultQuiz(QuizVo vo, @RequestParam(value = "no0", required = false, defaultValue = "") Long no1,
			@RequestParam(value = "no1", required = false, defaultValue = "") Long no2,
			@RequestParam(value = "no2", required = false, defaultValue = "") Long no3,
			@RequestParam(value = "no3", required = false, defaultValue = "") Long no4,
			@RequestParam(value = "no4", required = false, defaultValue = "") Long no5,
			@RequestParam(value = "selectedRadio0", required = false, defaultValue = "") String answer1,
			@RequestParam(value = "selectedRadio1", required = false, defaultValue = "") String answer2,
			@RequestParam(value = "selectedRadio2", required = false, defaultValue = "") String answer3,
			@RequestParam(value = "selectedRadio3", required = false, defaultValue = "") String answer4,
			@RequestParam(value = "selectedRadio4", required = false, defaultValue = "") String answer5) {
		Long no[] = { no1, no2, no3, no4, no5 };
		String answer[] = { answer1, answer2, answer3, answer4, answer5 };
		Integer count = 0;
		Integer len = no.length;

		for (int i = 0; i < len; i++) {
			vo.setNo(no[i]);
			vo.setSelected(answer[i]);

			QuizVo vo2 = quizService.selectResult(vo);
			if (vo2 != null) {
				count++;
			}
		}
		return "book/resultquiz";
	}

	// 리뷰 화면 열기
	@RequestMapping(value = "/review/{no}", method = RequestMethod.GET)
	public String review(@PathVariable("no") Long bookNo, Model model) {
		// 책 정보 불러오기
		BookVo vo = bookService.getByNo(bookNo);
		model.addAttribute("vo", vo);
		
		// 책에 따른 리뷰 불러오기
		List<ReviewVo> list = reviewService.getList(bookNo);
		// 신고받은 리뷰는 리스트에서 삭제
		List<AccusationVo> accusationList = accusationService.getList();
		for (int i = 0; i < accusationList.size(); i++) {
			AccusationVo accusationVo = accusationList.get(i);
			Long identity = accusationVo.getIdentity();
			Long keyNo = accusationVo.getKeyNo();
			for (int j = 0; j < list.size(); j++) {
				ReviewVo reviewVo = list.get(j);
				Long no = reviewVo.getNo();
				if (identity == 1 && no == keyNo) {
					list.remove(j);
				}
			}
		}		
		model.addAttribute("list", list);
		return "book/review";
	}

	// 리뷰 신고 화면 열기
	@RequestMapping(value = "/accusation/{no}", method = RequestMethod.GET)
	public String accusationform(@PathVariable("no") Long no, Model model) {
		ReviewVo vo = reviewService.getByNo(no);
		model.addAttribute("vo", vo);
		return "book/accusation";
	}

	// 신고 하기
	@RequestMapping(value = "/insertReview", method = RequestMethod.POST)
	public String insertReviewAccusation(@ModelAttribute AccusationVo vo) {
		accusationService.insertReviewAccusation(vo);
		// 신고한 리뷰가 있는 화면으로 간다
		ReviewVo reviewVo = reviewService.getByNo(vo.getKeyNo());
		return "redirect:/book/review/" + reviewVo.getBookNo();
	}

	// 리뷰 삭제
	@RequestMapping(value = "/delete/{no}")
	public String reviewDelete(@PathVariable("no") Long no) {
		// 삭제한 리뷰가 있는 화면으로 간다
		ReviewVo reviewVo = reviewService.getByNo(no);
		Long bookNo = reviewVo.getBookNo();
		reviewService.reviewDelete(no);	
		return "redirect:/book/review/" + bookNo;
	}

	// 리뷰 쓰기
	@RequestMapping(value = "/insert/{no}", method = RequestMethod.POST)
	public String insert(@ModelAttribute ReviewVo vo, @PathVariable("no") Long no, HttpSession session) {
		MemberVo authUser = (MemberVo) session.getAttribute("authUser");
		Long memberNo = authUser.getNo();
		vo.setMemberNo(memberNo);
		reviewService.insert(vo);
		return "redirect:/book/review/" + no;
	}
}