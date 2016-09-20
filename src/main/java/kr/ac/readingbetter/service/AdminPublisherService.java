package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.AdminPublisherDao;
import kr.ac.readingbetter.vo.PublisherVo;

@Service
public class AdminPublisherService {

	@Autowired
	private AdminPublisherDao publisherDao;

	public List<PublisherVo> getList(PublisherVo vo) {
		List<PublisherVo> list = publisherDao.getList(vo);
		return list;
	}

	public void insert(PublisherVo vo) {
		publisherDao.insert(vo);
	}
}