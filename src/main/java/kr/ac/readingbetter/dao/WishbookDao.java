package kr.ac.readingbetter.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.WishbookVo;

@Repository
public class WishbookDao {

	@Autowired
	private SqlSession sqlSession;

	public List<WishbookVo> getList() {
		List<WishbookVo> list = sqlSession.selectList("wishbook.list");
		return list;
	}

	public WishbookVo getView(WishbookVo vo) {
		vo = sqlSession.selectOne("wishbook.getByNo", vo);
		return vo;
	}

	public void insertPublisher(WishbookVo vo) {
		sqlSession.insert("wishbook.insertPublisher", vo);
	}

	public void insertBook(WishbookVo vo) {
		sqlSession.insert("wishbook.insertBook", vo);
	}

	public void updateAcceptToOne(WishbookVo vo) {
		sqlSession.update("wishbook.updateAcceptToOne", vo);
	}

	public void updateAcceptToTwo(WishbookVo vo) {
		sqlSession.update("wishbook.updateAcceptToTwo", vo);
	}

	public List<WishbookVo> selectListOrderByNo() {
		List<WishbookVo> list = sqlSession.selectList("wishbook.selectListOrderByNo");
		return list;
	}

	public void insertWishbook(WishbookVo vo) {
		sqlSession.insert("wishbook.insertWishbook", vo);
	}

	public WishbookVo selectWishbook(Long no) {
		WishbookVo vo = sqlSession.selectOne("wishbook.selectWishbook", no);
		return vo;
	}

	public void updateRecommend(Long no) {
		sqlSession.update("wishbook.updateRecommend", no);
	}
}
