package kr.ac.readingbetter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.HistoryDao;
import kr.ac.readingbetter.vo.HistoryVo;

@Service
public class HistoryService {
	@Autowired
	private HistoryDao historyDao;

	public void insertHistory(HistoryVo vo) {
		historyDao.insertHistory(vo);
	}
}