package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.MemberDao;
import kr.ac.readingbetter.vo.MemberVo;
import kr.ac.readingbetter.vo.SchoolVo;

@Service
public class MemberService {

	@Autowired
	private MemberDao memberDao;

	public List<MemberVo> getList(MemberVo vo) {
		List<MemberVo> list = memberDao.getList(vo);
		return list;
	}

	public void delete(MemberVo vo) {
		memberDao.delete(vo);
	}

	public MemberVo selectAuthUser(MemberVo vo) {
		vo = memberDao.selectAuthUser(vo);
		return vo;
	}

	public List<SchoolVo> selectSchoolTitle() {
		List<SchoolVo> list = memberDao.selectSchoolTitle();
		return list;
	}

	public List<SchoolVo> searchSchool(String kwd) {
		List<SchoolVo> list = memberDao.searchSchool(kwd);
		return list;
	}

	public MemberVo checkId(String id) {
		MemberVo vo = memberDao.checkId(id);
		return vo;
	}

	public MemberVo checkEmail(String email) {
		MemberVo vo = memberDao.checkEmail(email);
		return vo;
	}

	public void insertMember(MemberVo vo) {
		memberDao.insertMember(vo);
	}
}