package kr.ac.readingbetter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service")
public class ServiceController {
	
	// 공지
	@RequestMapping("/noticelist")
	public String noticeList() {
		return "service/noticelist";
	}
	
	@RequestMapping("/noticeview")
	public String noticeView() {
		return "service/noticeview";
	}
	
	// 문의
	@RequestMapping("/questionlist")
	public String questionList() {
		return "service/questionlist";
	}
	
	@RequestMapping("/questionview")
	public String questionView() {
		return "service/questionview";
	}
	
	@RequestMapping("/questionwrite")
	public String questionWrite() {
		return "service/questionwrite";
	}
	
	// 희망도서
	@RequestMapping("/wishbooklist")
	public String wishBookList() {
		return "service/wishbooklist";
	}
	
	@RequestMapping("/wishbookwrite")
	public String wishBookWrite() {
		return "service/wishbookwrite";
	}
	
	@RequestMapping("/wishbookview")
	public String wishBookView() {
		return "service/wishbookview";
	}
}