package kr.ac.readingbetter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.readingbetter.service.AccusationService;
import kr.ac.readingbetter.service.CommentsService;
import kr.ac.readingbetter.service.NoticeService;
import kr.ac.readingbetter.vo.AccusationVo;
import kr.ac.readingbetter.vo.CommentsVo;
import kr.ac.readingbetter.vo.NoticeVo;

@Controller
@RequestMapping("/service")
public class ServiceController {

	@Autowired
	private NoticeService noticeService;

	@Autowired
	private CommentsService commentsService;

	@Autowired
	private AccusationService accusationService;

	// 공지
	// 공지 리스트 띄우기
	@RequestMapping(value = "/noticelist", method = RequestMethod.GET)
	public String noticeList(Model model, NoticeVo vo) {
		List<NoticeVo> list = noticeService.getList(vo);
		model.addAttribute("list", list);
		return "service/noticelist";
	}

	// 공지 상세 보기
	@RequestMapping(value = "/noticeview/{noticeNo}", method = RequestMethod.GET)
	public String noticeView(@PathVariable("noticeNo") Long noticeNo, Model model) {
		// 공지 상세 불러오기
		NoticeVo vo = noticeService.noticeView(noticeNo);
		model.addAttribute("vo", vo);

		// 공지에 따른 댓글 불러오기
		List<CommentsVo> list = commentsService.getList(noticeNo);
		// 신고받은 댓글은 리스트에서 삭제
		List<AccusationVo> accusationList = accusationService.getList();
		for (int i = 0; i < accusationList.size(); i++) {
			AccusationVo accusationVo = accusationList.get(i);
			Long identity = accusationVo.getIdentity();
			Long keyNo = accusationVo.getKeyNo();			
			for (int j = 0; j < list.size(); j++) {
				CommentsVo commentsVo = list.get(j);
				Long no = commentsVo.getNo();
				if (identity == 2 && no == keyNo) {
					list.remove(j);
				}
			}
		}
		model.addAttribute("list", list);
		return "service/noticeview";
	}

	// 댓글 쓰기
	@RequestMapping(value = "/commentswrite", method = RequestMethod.POST)
	public String commentsWrite(@ModelAttribute CommentsVo vo) {
		commentsService.commentsWrite(vo);
		return "redirect:/service/noticeview/" + vo.getNoticeNo();
	}

	// 댓글 신고 화면 열기
	@RequestMapping(value = "/commentsAccusation/{no}", method = RequestMethod.GET)
	public String commentsAccusation(@PathVariable("no") Long no, Model model) {
		CommentsVo vo = commentsService.commentsAccusation(no);
		model.addAttribute("vo", vo);
		return "service/accusation";
	}

	// 댓글 신고
	@RequestMapping(value = "/insertComments", method = RequestMethod.POST)
	public String insertComments(@ModelAttribute AccusationVo vo) {
		accusationService.insertComments(vo);
		// 신고한 댓글이 있는 공지 상세 화면으로 간다
		CommentsVo commentsVo = commentsService.commentsAccusation(vo.getKeyNo());
		return "redirect:/service/noticeview/" + commentsVo.getNoticeNo();
	}

	// 댓글 삭제
	@RequestMapping(value = "/deleteComments/{no}", method = RequestMethod.GET)
	public String deleteComments(@PathVariable("no") Long no) {
		// 삭제한 댓글이 있는 공지 상세 화면으로 간다
		CommentsVo commentsVo = commentsService.commentsAccusation(no);
		Long noticeNo = commentsVo.getNoticeNo();
		// 공지 번호를 저장후 해당 정보를 삭제한다
		commentsService.deleteComments(no);
		return "redirect:/service/noticeview/" + noticeNo;
	}

	// 문의
	@RequestMapping("/questionlist")
	public String questionList() {
		return "service/questionlist";
	}

	@RequestMapping("/questionview")
	public String questionView() {
		return "service/questionview";
	}

	@RequestMapping("/questionwrite")
	public String questionWrite() {
		return "service/questionwrite";
	}

	// 희망도서
	@RequestMapping("/wishbooklist")
	public String wishBookList() {
		return "service/wishbooklist";
	}

	@RequestMapping("/wishbookwrite")
	public String wishBookWrite() {
		return "service/wishbookwrite";
	}

	@RequestMapping("/wishbookview")
	public String wishBookView() {
		return "service/wishbookview";
	}
}