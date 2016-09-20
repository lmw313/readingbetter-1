package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.AdminAuthorDao;
import kr.ac.readingbetter.vo.AuthorVo;

@Service
public class AdminAuthorService {

	@Autowired
	private AdminAuthorDao authorDao;

	public List<AuthorVo> getList() {
		List<AuthorVo> list = authorDao.getList();
		return list;
	}

	public void insert(AuthorVo vo) {
		authorDao.insert(vo);
	}
}