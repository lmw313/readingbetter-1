package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.AdminShopDao;
import kr.ac.readingbetter.vo.ShopVo;

@Service
public class AdminShopService {
	@Autowired
	private AdminShopDao adminShopDao;

	// 상품 리스트 출력
	public List<ShopVo> getGoodsList(ShopVo vo) {
		return adminShopDao.getGoodsList(vo);
	}

	// 상품 추가
	public void goodsInsert(ShopVo vo) {
		adminShopDao.goodsInsert(vo);
	}

	// 상품 삭제
	public void goodsDelete(Long no) {
		adminShopDao.goodsDelete(no);
	}
}