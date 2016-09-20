package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.WishbookDao;
import kr.ac.readingbetter.vo.BookVo;
import kr.ac.readingbetter.vo.PublisherVo;
import kr.ac.readingbetter.vo.WishbookVo;

@Service
public class WishbookService {
	@Autowired
	private WishbookDao wishbookDao;
	
	public List<WishbookVo> getList(){
		List<WishbookVo> list = wishbookDao.getList();
		return list;
	}
	
	public WishbookVo getView(WishbookVo vo){
		vo = wishbookDao.getView(vo);
		return vo;
	}
	
	public List<PublisherVo> findPublisher(PublisherVo vo){
		List<PublisherVo> list = wishbookDao.findPublisher(vo);
		return list;
	}
	
	public List<BookVo> findBook(BookVo vo){
		List<BookVo> list = wishbookDao.findBook(vo);
		return list;
	}
	
	public List<PublisherVo> selectPublisher(WishbookVo vo){
		List<PublisherVo> list = wishbookDao.selectPublisher(vo);
		return list;
	}
	
	public void insertPublisher(WishbookVo vo){
		wishbookDao.insertPublisher(vo);
	}
	
	public void insertBook(WishbookVo vo){
		wishbookDao.insertBook(vo);
	}
	
	public void updateAcceptToOne(WishbookVo vo){
		wishbookDao.updateAcceptToOne(vo);
	}
	
	public void updateAcceptToTwo(WishbookVo vo){
		wishbookDao.updateAcceptToTwo(vo);
	}
}
