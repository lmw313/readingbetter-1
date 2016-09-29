package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.BookDao;
import kr.ac.readingbetter.dao.QuizDao;
import kr.ac.readingbetter.vo.AnswerVo;
import kr.ac.readingbetter.vo.BookVo;

@Service
public class BookService {

	@Autowired
	private BookDao bookDao;

	@Autowired
	private QuizDao quizDao;
	
	public List<BookVo> getList() {
		List<BookVo> list = bookDao.getList();
		return list;
	}

	// 페이징 리스트
	public List<BookVo> getListPage(BookVo vo) {
		List<BookVo> list = bookDao.getListPage(vo);
		return list;
	}

	public List<BookVo> getListKwd(BookVo vo) {
		List<BookVo> list = bookDao.getListKwd(vo);
		return list;
	}

	public BookVo getByNo(Long no) {
		BookVo vo = bookDao.getByNo(no);
		return vo;
	}

	public List<BookVo> findBook(BookVo vo) {
		List<BookVo> list = bookDao.findBook(vo);
		return list;
	}

	public List<BookVo> getListService(BookVo vo) {
		List<BookVo> list = bookDao.getListService(vo);
		return list;
	}
	
	public String getAnswer(Long no){
		return quizDao.selectAnswer(no);
	}
	
	// 정답 개수 구하기
	public Integer getCount(List<AnswerVo> list){
		Integer len = list.size();
		Integer count = 0;
		
		for (int i = 0; i < len; i++) {
			String oAnswer = quizDao.selectAnswer(list.get(i).getQuizNo());
			if (oAnswer.equals(list.get(i).getAnswer())) {
				count++;
			}
		}
		
		return count;
	}
}