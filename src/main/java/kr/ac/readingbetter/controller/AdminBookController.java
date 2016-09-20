package kr.ac.readingbetter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.readingbetter.service.AdminBookService;
import kr.ac.readingbetter.service.AdminAuthorService;
import kr.ac.readingbetter.service.AdminPublisherService;
import kr.ac.readingbetter.vo.AuthorVo;
import kr.ac.readingbetter.vo.BookVo;
import kr.ac.readingbetter.vo.PublisherVo;

@Controller
@RequestMapping("/admin")
public class AdminBookController {

	@Autowired
	AdminBookService adminBookService;

	@Autowired
	AdminAuthorService authorService;

	@Autowired
	AdminPublisherService publisherService;

	// 도서 관리
	@RequestMapping("/booklist")
	public String BookList(Model model) {
		List<BookVo> list = adminBookService.getList();
		model.addAttribute("list", list);
		return "admin/booklist";
	}

	// 책 저장
	@RequestMapping("/bookaddform")
	public String BookaddList(Model model, AuthorVo authorvo, PublisherVo publishervo) {
		if (authorvo.getKwd2() == null) {
			authorvo.setKwd2("");
		}
		List<AuthorVo> list = authorService.getList(authorvo);

		model.addAttribute("authorlist", list);

		if (publishervo.getKwd1() == null) {
			publishervo.setKwd1("");
		}
		List<PublisherVo> list2 = publisherService.getList(publishervo);
		model.addAttribute("publisherlist", list2);

		return "admin/bookaddform";
	}
}