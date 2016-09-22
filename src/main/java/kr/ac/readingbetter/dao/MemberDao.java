package kr.ac.readingbetter.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.MemberVo;
import kr.ac.readingbetter.vo.SchoolVo;

@Repository
public class MemberDao {

	@Autowired
	private SqlSession sqlSession;

	public List<MemberVo> getList(MemberVo vo) {
		List<MemberVo> list = sqlSession.selectList("member.list", vo);
		return list;
	}

	public void delete(MemberVo vo) {
		sqlSession.delete("member.delete", vo);
	}

	public MemberVo selectAuthUser(MemberVo vo) {
		vo = sqlSession.selectOne("member.selectAuthUser", vo);
		return vo;
	}

	public List<SchoolVo> selectSchoolTitle() {
		List<SchoolVo> list = sqlSession.selectList("member.selectSchoolTitle");
		return list;
	}

	public List<SchoolVo> searchSchool(String kwd) {
		List<SchoolVo> list = sqlSession.selectList("member.searchSchool", kwd);
		return list;
	}

	public MemberVo checkId(String id) {
		MemberVo vo = sqlSession.selectOne("member.checkId", id);
		return vo;
	}

	public MemberVo checkEmail(String email) {
		MemberVo vo = sqlSession.selectOne("member.checkEmail", email);
		return vo;
	}

	public void insertMember(MemberVo vo) {
		sqlSession.insert("member.insertMember", vo);
	}
}