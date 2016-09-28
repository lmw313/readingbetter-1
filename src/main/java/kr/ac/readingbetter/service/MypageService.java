package kr.ac.readingbetter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.MemberDao;
import kr.ac.readingbetter.vo.MemberVo;

@Service
public class MypageService {
	@Autowired
	private MemberDao memberDao;
	
	public void updateMember(MemberVo vo){
		if(!vo.getPw().equals("")){
			memberDao.updateMemberWithPw(vo);
			return;
		}
		
		memberDao.updateMember(vo);
	}
	
	public MemberVo selectMyinfo(Long no){
		MemberVo vo = memberDao.selectMyinfo(no);
		return vo;
	}
}