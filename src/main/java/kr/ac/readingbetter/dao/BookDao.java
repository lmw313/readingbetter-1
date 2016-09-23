package kr.ac.readingbetter.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.BookVo;

@Repository
public class BookDao {

	@Autowired
	private SqlSession sqlSession;

	public List<BookVo> getList() {
		List<BookVo> list = sqlSession.selectList("book.list");
		return list;
	}

	// 페이징 리스트
	public List<BookVo> getListPage(Integer pageNo) {
		List<BookVo> list = sqlSession.selectList("book.listpage", pageNo);
		return list;
	}

	public List<BookVo> getListKwd(BookVo vo) {
		List<BookVo> list = sqlSession.selectList("book.listkwd", vo);
		return list;
	}

	public BookVo getByNo(Long no) {
		BookVo vo = sqlSession.selectOne("book.getByNo", no);
		return vo;
	}

	public List<BookVo> findBook(BookVo vo) {
		List<BookVo> list = sqlSession.selectList("book.findBook", vo);
		return list;
	}
}