package kr.ac.readingbetter.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.MemberVo;

@Repository
public class MemberDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<MemberVo> getList(MemberVo vo) {
		List<MemberVo> list = sqlSession.selectList("member.list", vo);
		return list;
	}
	
	public void delete(MemberVo vo){
		sqlSession.delete("member.delete", vo);
	}
	
	public MemberVo selectAuthUser(MemberVo vo){
		vo = sqlSession.selectOne("member.selectAuthUser", vo);
		return vo;
	}
}