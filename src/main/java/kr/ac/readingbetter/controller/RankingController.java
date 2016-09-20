package kr.ac.readingbetter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ranking")
public class RankingController {

	@RequestMapping("/summary")
	public String summary() {		
		return "ranking/summary";
	}
	
	@RequestMapping("/monthlygrade")
	public String MonthlyGrade() {		
		return "ranking/monthlygrade";
	}
	
	@RequestMapping("/monthlyschool")
	public String MonthlySchool() {		
		return "ranking/monthlyschool";
	}
	
	@RequestMapping("/monthlytotal")
	public String MonthlyTotal() {		
		return "ranking/monthlytotal";
	}
	
	@RequestMapping("/honor")
	public String honor() {		
		return "ranking/honor";
	}
}