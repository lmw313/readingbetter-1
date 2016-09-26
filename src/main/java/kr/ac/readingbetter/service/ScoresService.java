package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.ScoresDao;
import kr.ac.readingbetter.vo.HistoryVo;
import kr.ac.readingbetter.vo.ScoresVo;

@Service
public class ScoresService {

	@Autowired
	private ScoresDao scoresDao;

	// 전체 랭킹
	public List<ScoresVo> monthlyRank(ScoresVo vo) {
		return scoresDao.monthlyRank(vo);
	}

	// 로그인 한 회원의 전체 랭킹
	public ScoresVo mymonthlyRank(Long no) {
		return scoresDao.mymonthlyRank(no);
	}

	// 학교 랭킹
	public List<ScoresVo> schoolRank(ScoresVo vo) {
		return scoresDao.schoolRank(vo);
	}

	// 로그인 한 회원의 학교 랭킹
	public ScoresVo mySchoolRank(Long no) {
		return scoresDao.mySchoolRank(no);
	}

	// 학년 랭킹
	/*
	 * public List<ScoresVo> gradeRank(ScoresVo vo) { return
	 * scoresDao.gradeRank(vo); }
	 */

	// 명예의 전당
	public List<ScoresVo> honor(ScoresVo vo) {
		return scoresDao.honor(vo);
	}

	// 로그인 한 회원의 명예의 전당
	public ScoresVo myTotalRank(Long no) {
		return scoresDao.myTotalRank(no);
	}

	// 명예의 전당 Top 3
	public List<ScoresVo> totalTopRanker(ScoresVo vo) {
		return scoresDao.totalTopRanker(vo);
	}

	public void updateScores(HistoryVo vo) {
		scoresDao.updateScores(vo);
	}

	public ScoresVo selectScores(Long no) {
		ScoresVo vo = scoresDao.selectScores(no);
		return vo;
	}

	public void insertScores(Long no) {
		scoresDao.insertScores(no);
	}
}