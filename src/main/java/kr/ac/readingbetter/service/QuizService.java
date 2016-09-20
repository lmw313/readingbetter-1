package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.BookDao;
import kr.ac.readingbetter.dao.QuizDao;
import kr.ac.readingbetter.vo.BookVo;
import kr.ac.readingbetter.vo.QuizVo;

@Service
public class QuizService {
	
	@Autowired
	private QuizDao quizDao;
	
	@Autowired
	private BookDao bookDao;
	
	public List<QuizVo> getList() {
		List<QuizVo> list = quizDao.getList();
		return list;
	}
	
	public QuizVo quizView(Long no) {
		QuizVo vo = quizDao.quizView(no);
		return vo;
	}
	
	public void quizUpdate(QuizVo vo) {
		quizDao.quizUpdate(vo);
	}
	
	public List<BookVo> getBookList() {
		List<BookVo> list = bookDao.getList();
		return list;
	}
	
	public BookVo getBook(Long no) {
		BookVo bookVo = bookDao.getByNo(no);
		return bookVo;
	}
	
	public void quizAddAdmin(QuizVo vo) {
		quizDao.quizAddAdmin(vo);
	}
	
	public void quizAddUser(QuizVo vo) {
		quizDao.quizAddUser(vo);
	}
}