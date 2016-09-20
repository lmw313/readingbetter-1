package kr.ac.readingbetter.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.QuizVo;

@Repository
public class AdminQuizDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<QuizVo> getList() {
		List<QuizVo> list = sqlSession.selectList("adminquiz.list");
		return list;
	}
	
	public QuizVo quizView(Long no) {
		QuizVo vo = sqlSession.selectOne("adminquiz.getByNo", no);
		return vo;
	}
	
	public void quizUpdate(QuizVo vo) {
		sqlSession.update("adminquiz.update", vo);
	}
	
	public void quizAdd(QuizVo vo) {
		sqlSession.insert("adminquiz.quizAdd", vo);
	}
}