package kr.ac.readingbetter.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.BookVo;
import kr.ac.readingbetter.vo.ReviewVo;

@Repository
public class ReviewDao {

	@Autowired
	private SqlSession sqlSession;

	public List<ReviewVo> getList() {
		List<ReviewVo> list = sqlSession.selectList("review.list");
		return list;
	}

	public BookVo getByNo(Long no) {
		BookVo vo = sqlSession.selectOne("book.getByNo", no);
		return vo;
	}
}