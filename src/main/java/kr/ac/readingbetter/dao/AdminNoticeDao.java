package kr.ac.readingbetter.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.NoticeVo;

@Repository
public class AdminNoticeDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<NoticeVo> getList(NoticeVo vo) {
		List<NoticeVo> list = sqlSession.selectList("adminnotice.list", vo);
		return list;
	}
	
	public void noticeWrite(NoticeVo vo){
		sqlSession.insert("adminnotice.write", vo);
	}
	
	public NoticeVo noticeView(Long no) {
		NoticeVo vo = sqlSession.selectOne("adminnotice.getByNo", no);
		return vo;
	}
	
	public void noticeModify(NoticeVo vo){
		sqlSession.update("adminnotice.modify", vo);
	}
}
