package kr.ac.readingbetter.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.BookVo;

@Repository
public class AdminBookDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<BookVo> getList() {
		List<BookVo> list = sqlSession.selectList("adminbook.list");
		return list;
	}
	
	public BookVo getByNo(Long no){
		BookVo vo = sqlSession.selectOne("adminbook.getByNo", no);
		return vo;
	}
}