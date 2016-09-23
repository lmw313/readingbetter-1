package kr.ac.readingbetter.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.readingbetter.vo.RankingVo;

@Repository
public class RankingDao {
	
	@Autowired
	private SqlSession sqlSession;

	// 전체 랭킹
	public List<RankingVo> monthlyRank(RankingVo vo) {
		return sqlSession.selectList("ranking.monthlyrank", vo);
	}

	// 로그인 한 회원 전체 랭킹
	public RankingVo mymonthlyRank(Long no) {
		return sqlSession.selectOne("ranking.mymonthlyrank", no);
	}

	// 학교 랭킹
	/*
	 * public List<RankingVo> monthlySchool(RankingVo vo) { return null; }
	 */

	// 학년 랭킹
	/*
	 * public List<RankingVo> gradeRank(RankingVo vo) { return null; }
	 */

	// 명예의 전당
	public List<RankingVo> honor(RankingVo vo) {
		return sqlSession.selectList("ranking.honor", vo);
	}

	// 로그인 한 회원의 명예의 전당
	public RankingVo myTotalRank(Long no) {
		return sqlSession.selectOne("ranking.myTotalRank", no);
	}

	// 명예의 전당 Top 3
	public List<RankingVo> totalTopRanker(RankingVo vo) {
		return sqlSession.selectList("ranking.totalTopRanker", vo);
	}
}