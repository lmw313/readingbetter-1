package kr.ac.readingbetter.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.AccusationVo;
import kr.ac.readingbetter.vo.BoardVo;
import kr.ac.readingbetter.vo.CommentsVo;

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

	public BoardVo getBoardList(Long no) {
		BoardVo vo = sqlSession.selectOne("board.list", no);
		return vo;
	}

	public CommentsVo getCommentsList(Long no) {
		CommentsVo vo = sqlSession.selectOne("comments.list", no);
		return vo;
	}

	public void update(AccusationVo vo) {
		sqlSession.update("accusation.update", vo);
	}
}