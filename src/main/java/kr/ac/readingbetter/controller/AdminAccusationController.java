package kr.ac.readingbetter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.readingbetter.service.AdminAccusationService;
import kr.ac.readingbetter.vo.AccusationVo;
import kr.ac.readingbetter.vo.BoardVo;
import kr.ac.readingbetter.vo.CommentsVo;

@Controller
@RequestMapping("/admin")
public class AdminAccusationController {

	@Autowired
	AdminAccusationService adminAccusationService;

	// 신고 관리
	@RequestMapping("/accusationlist")
	public String AccusationList(Model model) {
		List<AccusationVo> list = adminAccusationService.getList();
		model.addAttribute("accusationlist", list);
		return "admin/accusationlist";
	}

	@RequestMapping(value = "/accusationview/{no}", method = RequestMethod.GET)
	public String AccusationView(@PathVariable("no") Long no, Model model) {
		AccusationVo vo = adminAccusationService.get(no);
		BoardVo boardvo;
		CommentsVo commentsvo;
		Long identity = vo.getIdentity();
		Long keyNo = vo.getKeyNo();

		if (identity == 1) {
			boardvo = adminAccusationService.getBoardList(keyNo);
			model.addAttribute("boardvo", boardvo);
		} else {
			commentsvo = adminAccusationService.getCommentsList(keyNo);
			model.addAttribute("commentsvo", commentsvo);
		}

		model.addAttribute("vo", vo);
		return "admin/accusationview";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String modify(@ModelAttribute AccusationVo vo) {
		System.out.println(vo);
		adminAccusationService.update(vo);
		return "redirect:/admin/accusationlist";
	}
}