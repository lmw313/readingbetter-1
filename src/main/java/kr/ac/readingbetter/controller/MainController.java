package kr.ac.readingbetter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

	@RequestMapping("")
	public String Main() {
		return "main/main";
	}
	
	@RequestMapping("/manual")
	public String Manual() {
		return "main/manual";
	}
	
	@RequestMapping("/siteinfo")
	public String SiteInfo() {
		return "main/siteinfo";
	}
	
	@RequestMapping("/sitemap")
	public String SiteMap() {
		return "main/sitemap";
	}
}