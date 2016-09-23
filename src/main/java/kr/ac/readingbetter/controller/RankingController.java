package kr.ac.readingbetter.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.readingbetter.service.RankingService;
import kr.ac.readingbetter.vo.MemberVo;
import kr.ac.readingbetter.vo.RankingVo;

@Controller
@RequestMapping("/ranking")
public class RankingController {
	@Autowired
	private RankingService rankingService;

	/* 페이지 */
	// 요약 페이지 및 랭킹 출력
	@RequestMapping("/summary")
	public String summary(RankingVo vo, Model model) {

		// 전체 랭킹
		List<RankingVo> monthlyRank = rankingService.monthlyRank(vo);
		model.addAttribute("monthlyRank", monthlyRank);

		// 학교 랭킹
		/*
		 * List<RankingVo> monthlySchool = rankingService.schoolRank(vo);
		 * model.addAttribute("monthlySchool", monthlySchool);
		 */

		// 학년 랭킹
		/*
		 * List<RankingVo> monthlyGrade = rankingService.gradeRank(vo);
		 * model.addAttribute("monthlyGrade", monthlyGrade);
		 */

		// 명예의 전당
		List<RankingVo> honor = rankingService.honor(vo);
		model.addAttribute("honor", honor);
		return "ranking/summary";
	}

	// 전체 랭킹 페이지
	@RequestMapping("/monthlytotal")
	public String monthlyTotal(RankingVo vo, Model model, HttpSession session) {

		// 전체 랭킹
		List<RankingVo> monthlyRank = rankingService.monthlyRank(vo);
		model.addAttribute("monthlyRank", monthlyRank);

		MemberVo authUser = (MemberVo) session.getAttribute("authUser");

		// 로그인 한 회원 전체 랭킹
		if (authUser != null) { // 로그인을 했을 경우에만 vo에 회원 랭킹 삽입
			Long no = authUser.getNo();
			vo = rankingService.mymonthlyRank(no);
			model.addAttribute("myMonthlyRank", vo);
		}
		return "ranking/monthlytotal";
	}

	// 학년별 랭킹 페이지
	@RequestMapping("/monthlygrade")
	public String monthlyGrade() {
		return "ranking/monthlygrade";
	}

	// 학교별 랭킹 페이지
	@RequestMapping("/monthlyschool")
	public String monthlySchool() {
		return "ranking/monthlyschool";
	}

	// 명예의 전당
	@RequestMapping("/honor")
	public String honor(RankingVo vo, Model model, HttpSession session) {

		// 명예의 전당 Top 10 (테이블)
		List<RankingVo> honor = rankingService.honor(vo);
		model.addAttribute("honor", honor);

		// 명예의 전당 Top 3 (좌측)
		List<RankingVo> totalTopRanker = rankingService.totalTopRanker(vo);
		model.addAttribute("totalTopRanker", totalTopRanker);

		MemberVo authUser = (MemberVo) session.getAttribute("authUser");

		// 로그인 한 회원 명예의 전당 랭킹
		if (authUser != null) { // 로그인을 했을 경우에만 vo에 회원 랭킹 삽입
			Long no = authUser.getNo();
			vo = rankingService.myTotalRank(no);
			model.addAttribute("myTotalRank", vo);
		}
		return "ranking/honor";
	}
}