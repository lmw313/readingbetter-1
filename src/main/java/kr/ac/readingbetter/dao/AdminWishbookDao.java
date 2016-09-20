package kr.ac.readingbetter.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.BookVo;
import kr.ac.readingbetter.vo.PublisherVo;
import kr.ac.readingbetter.vo.WishbookVo;

@Repository
public class AdminWishbookDao {
	@Autowired
	private SqlSession sqlSession;
	
	public List<WishbookVo> getList(){
		List<WishbookVo> list = sqlSession.selectList("adminwishbook.list");
		return list;
	}
	
	public WishbookVo getView(WishbookVo vo){
		vo = sqlSession.selectOne("adminwishbook.view", vo);
		return vo;
	}
	
	public List<PublisherVo> findPublisher(PublisherVo vo){
		List<PublisherVo> list = sqlSession.selectList("adminwishbook.findPublisher", vo);
		return list;
	}
	
	public List<BookVo> findBook(BookVo vo){
		List<BookVo> list = sqlSession.selectList("adminwishbook.findBook", vo);
		return list;
	}
	
	public List<PublisherVo> selectPublisher(WishbookVo vo){
		List<PublisherVo> list = sqlSession.selectList("adminwishbook.selectPublisher", vo);
		return list;
	}
	
	public void insertPublisher(WishbookVo vo){
		sqlSession.insert("adminwishbook.insertPublisher", vo);
	}
	
	public void insertBook(WishbookVo vo){
		sqlSession.insert("adminwishbook.insertBook", vo);
	}
	
	public void updateWishbookAcceptToOne(WishbookVo vo){
		sqlSession.update("adminwishbook.updateWishbookAcceptToOne", vo);
	}
	
	public void updateWishbookAcceptToTwo(WishbookVo vo){
		sqlSession.update("adminwishbook.updateWishbookAcceptToTwo", vo);
	}
}
