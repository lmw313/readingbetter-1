package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.AccusationDao;
import kr.ac.readingbetter.vo.AccusationVo;

@Service
public class AdminAccusationService {
	
	@Autowired
	private AccusationDao accusationDao;
	
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
	
	public AccusationVo getAccuView(Long no){
		AccusationVo vo;
		
		Long identity = accusationDao.selectIdentity(no);
		
		if (identity == 1) {
			vo = accusationDao.getAccusationViewFromReview(no);
		} else {
			vo = accusationDao.getAccusationViewFromComments(no);
		}
		
		return vo;
	}
	
	public void updateAccept(AccusationVo vo){
		System.out.println(vo);
		
		if(vo.getAccept().equals("1")){			
			System.out.println("accept : " + vo.getAccept());
		} else if (vo.getAccept().equals("2")){
			System.out.println("accept : " + vo.getAccept());
		} else if (vo.getAccept().equals("3")){
			System.out.println("accept : " + vo.getAccept());
		}
	}
}
