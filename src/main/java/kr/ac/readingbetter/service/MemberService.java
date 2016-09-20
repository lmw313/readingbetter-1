package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.MemberDao;
import kr.ac.readingbetter.vo.MemberVo;

@Service
public class MemberService {
	@Autowired
	private MemberDao adminMemberDao;
	
	public List<MemberVo> getList(MemberVo vo) {
		List<MemberVo> list = adminMemberDao.getList(vo);
		return list;
	}
	
	public void delete(MemberVo vo){
		adminMemberDao.delete(vo);
	}
}
