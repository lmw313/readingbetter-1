package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.AdminBookDao;
import kr.ac.readingbetter.dao.AdminQuizDao;
import kr.ac.readingbetter.vo.BookVo;
import kr.ac.readingbetter.vo.QuizVo;

@Service
public class AdminQuizService {
	
	@Autowired
	private AdminQuizDao adminQuizDao;
	
	@Autowired
	private AdminBookDao adminBookDao;
	
	public List<QuizVo> getList() {
		List<QuizVo> list = adminQuizDao.getList();
		return list;
	}
	
	public QuizVo quizView(Long no) {
		QuizVo vo = adminQuizDao.quizView(no);
		return vo;
	}
	
	public void quizUpdate(QuizVo vo) {
		adminQuizDao.quizUpdate(vo);
	}
	
	public List<BookVo> getBookList() {
		List<BookVo> list = adminBookDao.getList();
		return list;
	}
	
	public BookVo getBook(Long no) {
		BookVo bookVo = adminBookDao.getByNo(no);
		return bookVo;
	}
	
	public void quizAdd(QuizVo vo) {
		adminQuizDao.quizAdd(vo);
	}
}