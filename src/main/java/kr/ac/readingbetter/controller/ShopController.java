package kr.ac.readingbetter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.readingbetter.service.ShopService;
import kr.ac.readingbetter.vo.ShopVo;

@Controller
public class ShopController {

	@Autowired
	private ShopService shopService;

	// 상점 화면 열기
	@RequestMapping("/shop")
	public String goodsList(Model model, ShopVo vo) {
		if (vo.getTitle() == null) { // 검색할 상품명이 없으면 빈 문자열로 교체
			vo.setTitle("");
		}
		List<ShopVo> getGoodsList = shopService.getList(vo);
		model.addAttribute("getGoodsList", getGoodsList);
		return "shop/shop";
	}

	// 구입 확인 모달
	@ResponseBody
	@RequestMapping(value = "readAjax", method = RequestMethod.POST)
	public ShopVo readBoardAjax(Long no) {
		ShopVo shopvo = shopService.getByNo(no);
		return shopvo;
	}
}