package kr.ac.readingbetter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.readingbetter.dao.RankingDao;
import kr.ac.readingbetter.vo.RankingVo;

@Service
public class RankingService {
	@Autowired
	private RankingDao rankingDao;

	// 전체 랭킹
	public List<RankingVo> monthlyRank(RankingVo vo) {
		return rankingDao.monthlyRank(vo);
	}

	// 로그인 한 회원의 전체 랭킹
	public RankingVo mymonthlyRank(Long no) {
		return rankingDao.mymonthlyRank(no);
	}

	// 학교 랭킹
	/*
	 * public List<RankingVo> monthlySchool(RankingVo vo) { return
	 * rankingDao.monthlySchool(vo); }
	 */

	// 학년 랭킹
	/*
	 * public List<RankingVo> gradeRank(RankingVo vo) { return
	 * rankingDao.gradeRank(vo); }
	 */

	// 명예의 전당
	public List<RankingVo> honor(RankingVo vo) {
		return rankingDao.honor(vo);
	}

	// 로그인 한 회원의 명예의 전당
	public RankingVo myTotalRank(Long no) {
		return rankingDao.myTotalRank(no);
	}

	// 명예의 전당 Top 3
	public List<RankingVo> totalTopRanker(RankingVo vo) {
		return rankingDao.totalTopRanker(vo);
	}
}