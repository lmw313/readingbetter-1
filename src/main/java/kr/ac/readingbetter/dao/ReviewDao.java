package kr.ac.readingbetter.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.ReviewVo;

@Repository
public class ReviewDao {

	@Autowired
	private SqlSession sqlSession;

	public List<ReviewVo> getList(Long no) {
		List<ReviewVo> list = sqlSession.selectList("review.getByBookNo", no);
		return list;
	}

	public void reviewDelete(Long no) {
		sqlSession.delete("review.delete", no);
	}

	public void insert(ReviewVo vo) {
		sqlSession.insert("review.insert", vo);
	}

	public ReviewVo getByNo(Long no) {
		ReviewVo vo = sqlSession.selectOne("review.getByNo", no);
		return vo;
	}
}