package kr.ac.readingbetter.vo;

public class CommentsVo {

	private Long no;
	private String content;
	private String regDate;
	private Long noticeNo;
	private Long memberNo;
	private String id;

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public Long getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(Long noticeNo) {
		this.noticeNo = noticeNo;
	}

	public Long getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(Long memberNo) {
		this.memberNo = memberNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CommentsVo [no=" + no + ", content=" + content + ", regDate=" + regDate + ", noticeNo=" + noticeNo
				+ ", memberNo=" + memberNo + ", id=" + id + "]";
	}
}