package kr.ac.readingbetter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.ScoresDao;
import kr.ac.readingbetter.vo.HistoryVo;

@Service
public class ScoresService {
	@Autowired
	private ScoresDao scoresDao;

	public void updateScores(HistoryVo vo) {
		scoresDao.updateScores(vo);
	}
}