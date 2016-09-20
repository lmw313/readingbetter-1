package kr.ac.readingbetter.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.MemberVo;

@Repository
public class AdminMemberDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<MemberVo> getList(MemberVo vo) {
		List<MemberVo> list = sqlSession.selectList("adminmember.list", vo);
		return list;
	}
	
	public void delete(MemberVo vo){
		sqlSession.delete("adminmember.delete", vo);
	}
}
