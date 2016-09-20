package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.ReviewDao;
import kr.ac.readingbetter.vo.BookVo;
import kr.ac.readingbetter.vo.ReviewVo;

@Service
public class ReviewService {

	@Autowired
	private ReviewDao reviewDao;

	public List<ReviewVo> getList() {
		List<ReviewVo> list = reviewDao.getList();
		return list;
	}

	public BookVo getByNo(Long no) {
		BookVo book = reviewDao.getByNo(no);
		return book;
	}
}