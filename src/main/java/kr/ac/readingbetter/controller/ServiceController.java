package kr.ac.readingbetter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service")
public class ServiceController {
	
	// 공지
	@RequestMapping("/noticelist")
	public String NoticeList() {
		return "service/noticelist";
	}
	
	@RequestMapping("/noticeview")
	public String NoticeView() {
		return "service/noticeview";
	}
	
	// 문의
	@RequestMapping("/questionlist")
	public String QuestionList() {
		return "service/questionlist";
	}
	
	@RequestMapping("/questionview")
	public String QuestionView() {
		return "service/questionview";
	}
	
	@RequestMapping("/questionwrite")
	public String QuestionWrite() {
		return "service/questionwrite";
	}
	
	// 희망도서
	@RequestMapping("/wishbooklist")
	public String WishBookList() {
		return "service/wishbooklist";
	}
	
	@RequestMapping("/wishbookwrite")
	public String WishBookWrite() {
		return "service/wishbookwrite";
	}
	
	@RequestMapping("/wishbookview")
	public String WishBookView() {
		return "service/wishbookview";
	}
}