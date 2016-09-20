package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.AccusationDao;
import kr.ac.readingbetter.vo.AccusationVo;
import kr.ac.readingbetter.vo.BoardVo;
import kr.ac.readingbetter.vo.CommentsVo;

@Service
public class AccusationService {

	@Autowired
	private AccusationDao adminAccusationDao;

	public List<AccusationVo> getList() {
		List<AccusationVo> list = adminAccusationDao.getList();
		return list;
	}

	public AccusationVo getByNo(Long no) {
		AccusationVo adminAccusation = adminAccusationDao.getByNo(no);
		return adminAccusation;
	}

	public BoardVo getBoardList(Long no) {
		BoardVo adminBoard = adminAccusationDao.getBoardList(no);
		return adminBoard;
	}

	public CommentsVo getCommentsList(Long no) {
		CommentsVo adminComments = adminAccusationDao.getCommentsList(no);
		return adminComments;
	}

	public void update(AccusationVo vo) {
		adminAccusationDao.update(vo);
	}
}