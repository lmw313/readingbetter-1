package kr.ac.readingbetter.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.HistoryVo;

@Repository
public class HistoryDao {
	@Autowired
	private SqlSession sqlSession;

	public void insertHistory(HistoryVo vo) {
		sqlSession.insert("history.insertHistory", vo);
	}
}