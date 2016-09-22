package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.MemberDao;
import kr.ac.readingbetter.vo.MemberVo;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao memberDao;
	
	public List<MemberVo> getList(MemberVo vo) {
		List<MemberVo> list = memberDao.getList(vo);
		return list;
	}
	
	public void delete(MemberVo vo){
		memberDao.delete(vo);
	}
	
	public MemberVo selectAuthUser(MemberVo vo){
		vo = memberDao.selectAuthUser(vo);
		return vo;
	}
}
