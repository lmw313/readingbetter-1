package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.AdminSchoolDao;
import kr.ac.readingbetter.vo.SchoolVo;

@Service
public class AdminSchoolService {
	
	@Autowired
	private AdminSchoolDao adminSchoolDao;
	
	public List<SchoolVo> selectList(String kwd){
		List<SchoolVo> list = adminSchoolDao.selectList(kwd);
		
		return list;
	}
	
	public void insertSchool(String title){
		adminSchoolDao.insertSchool(title);
	}
}
