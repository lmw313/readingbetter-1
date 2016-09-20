package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.AdminAuthorDao;
import kr.ac.readingbetter.vo.AuthorVo;

@Service
public class AdminAuthorService {

	@Autowired
	private AdminAuthorDao AdminauthorDao;

	public List<AuthorVo> getList(AuthorVo vo) {
		List<AuthorVo> list = AdminauthorDao.getList(vo);
		return list;
	}

	public void insert(AuthorVo vo) {
		AdminauthorDao.insert(vo);
	}
}