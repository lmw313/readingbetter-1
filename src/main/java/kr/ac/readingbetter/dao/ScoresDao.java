package kr.ac.readingbetter.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.HistoryVo;

@Repository
public class ScoresDao {
	@Autowired
	private SqlSession sqlSession;

	public void updateScores(HistoryVo vo) {
		sqlSession.update("scores.updateScores", vo);
	}
}