package kr.ac.readingbetter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.readingbetter.service.AdminAuthorService;
import kr.ac.readingbetter.service.AdminPublisherService;
import kr.ac.readingbetter.vo.AuthorVo;
import kr.ac.readingbetter.vo.PublisherVo;

@Controller
@RequestMapping("/admin")
public class AdminBookInfoController {

	@Autowired
	AdminAuthorService adminAuthorService;

	@Autowired
	AdminPublisherService adminPublisherService;

	// 출판사,작가 관리
	@RequestMapping("/bookinfolist")
	public String bookInfoList(Model model, PublisherVo publishervo, AuthorVo authorvo) {
		if (authorvo.getKwd2() == null) {
			authorvo.setKwd2("");
		}

		List<AuthorVo> list = adminAuthorService.getList(authorvo);
		model.addAttribute("authorlist", list);

		if (publishervo.getKwd1() == null) {
			publishervo.setKwd1("");
		}
		List<PublisherVo> list2 = adminPublisherService.getList(publishervo);
		model.addAttribute("publisherlist", list2);

		return "admin/bookinfolist";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertPublisher(@ModelAttribute PublisherVo vo) {
		adminPublisherService.insert(vo);
		return "redirect:/admin/bookinfolist";
	}

	@RequestMapping(value = "/insertauthor", method = RequestMethod.POST)
	public String insertAuthor(@ModelAttribute AuthorVo vo) {
		adminAuthorService.insert(vo);
		return "redirect:/admin/bookinfolist";
	}
}