package kr.ac.readingbetter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	// 출판사,작가 관리
	@RequestMapping("/bookinfolist")
	public String BookInfoList(Model model) {
		List<AuthorVo> list = authorService.getList();
		model.addAttribute("authorlist", list);

		List<PublisherVo> list2 = publisherService.getList();
		model.addAttribute("publisherlist", list2);
		return "admin/bookinfolist";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String join(@ModelAttribute PublisherVo vo) {
		publisherService.insert(vo);
		return "redirect:/admin/bookinfolist";
	}

	@RequestMapping(value = "/insertauthor", method = RequestMethod.POST)
	public String join(@ModelAttribute AuthorVo vo) {
		authorService.insert(vo);
		return "redirect:/admin/bookinfolist";
	}

	@RequestMapping("/bookaddform")
	public String BookAdd() {
		return "admin/bookaddform";
	}
}