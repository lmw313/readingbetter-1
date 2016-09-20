package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.NoticeDao;
import kr.ac.readingbetter.vo.NoticeVo;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDao adminNoticeDao;
	
	public List<NoticeVo> getList(NoticeVo vo) {
		List<NoticeVo> list = adminNoticeDao.getList(vo);
		return list;
	}
	
	public void noticeWrite(NoticeVo vo){
		adminNoticeDao.noticeWrite(vo);
	}
	
	public NoticeVo noticeView(Long no) {
		NoticeVo vo = adminNoticeDao.noticeView(no);
		return vo;
	}
	
	public void noticeModify(NoticeVo vo){
		adminNoticeDao.noticeModify(vo);
	}
}