package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.AccusationDao;
import kr.ac.readingbetter.dao.CommentsDao;
import kr.ac.readingbetter.dao.ReviewDao;
import kr.ac.readingbetter.vo.AccusationViewVo;
import kr.ac.readingbetter.vo.AccusationVo;

@Service
public class AdminAccusationService {
	
	@Autowired
	private AccusationDao accusationDao;
	
	@Autowired
	private ReviewDao reviewDao;
	
	@Autowired
	private CommentsDao commentsDao;
	
	public List<AccusationVo> getList() {
		List<AccusationVo> list = accusationDao.getList();
		return list;
	}

	public AccusationVo getAccusation(Long no) {
		AccusationVo adminAccusation = accusationDao.getByNo(no);
		return adminAccusation;
	}
	
	public AccusationVo getByNo(Long no) {
		AccusationVo adminAccusation = accusationDao.getByNo(no);
		return adminAccusation;
	}
	
	public AccusationViewVo getAccuView(Long identity, Long keyNo){
		AccusationViewVo vo;
		
		if (identity == 1) {
			vo = reviewDao.getAccuView(keyNo);
		} else {
			vo = commentsDao.getAccuView(keyNo);
		}
		
		return vo;
	}

	public void update(AccusationVo vo) {
		accusationDao.update(vo);
	}
}
