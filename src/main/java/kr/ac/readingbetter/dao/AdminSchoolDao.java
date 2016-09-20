package kr.ac.readingbetter.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.SchoolVo;

@Repository
public class AdminSchoolDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<SchoolVo> selectList(String kwd){
		List<SchoolVo> list = sqlSession.selectList("adminschool.selectList", kwd);
		
		return list;
	}
	
	public void insertSchool(String title){
		sqlSession.insert("adminschool.insertSchool", title);
	}
}
