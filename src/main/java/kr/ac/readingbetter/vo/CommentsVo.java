package kr.ac.readingbetter.vo;

public class CommentsVo {
	private Long no;
	private String content;
	private String regDate;
	private Integer groupNo;
	private Integer depth;
	private Long announceNo;
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

	public Integer getGroupNo() {
		return groupNo;
	}

	public void setGroupNo(Integer groupNo) {
		this.groupNo = groupNo;
	}

	public Integer getDepth() {
		return depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public Long getAnnounceNo() {
		return announceNo;
	}

	public void setAnnounceNo(Long announceNo) {
		this.announceNo = announceNo;
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
		return "AdminCommentsVo [no=" + no + ", content=" + content + ", regDate=" + regDate + ", groupNo=" + groupNo
				+ ", depth=" + depth + ", announceNo=" + announceNo + ", memberNo=" + memberNo + ", id=" + id + "]";
	}
}