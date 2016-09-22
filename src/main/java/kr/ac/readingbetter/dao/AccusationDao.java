package kr.ac.readingbetter.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.AccusationVo;
import kr.ac.readingbetter.vo.CommentsVo;
import kr.ac.readingbetter.vo.ReviewVo;

@Repository
public class AccusationDao {

	@Autowired
	private SqlSession sqlSession;

	public List<AccusationVo> getList() {
		List<AccusationVo> list = sqlSession.selectList("accusation.list");
		return list;
	}

	public AccusationVo getByNo(Long no) {
		AccusationVo vo = sqlSession.selectOne("accusation.getByNo", no);
		return vo;
	}

	public ReviewVo getReviewList(Long no) {
		ReviewVo vo = sqlSession.selectOne("review.getByNo", no);
		return vo;
	}

	public CommentsVo getCommentsList(Long no) {
		CommentsVo vo = sqlSession.selectOne("comments.getByNo", no);
		return vo;
	}

	public void update(AccusationVo vo) {
		sqlSession.update("accusation.update", vo);
	}
	
	public void insertComments(AccusationVo vo){
		sqlSession.insert("accusation.insertComments", vo);
	}
}