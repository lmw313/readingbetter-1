package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.BookDao;
import kr.ac.readingbetter.vo.BookVo;

@Service
public class BookService {

	@Autowired
	private BookDao adminBookDao;

	public List<BookVo> getList() {
		List<BookVo> list = adminBookDao.getList();
		return list;
	}
	
	public BookVo getByNo(Long no){
		BookVo vo = adminBookDao.getByNo(no);
		return vo;
	}
}