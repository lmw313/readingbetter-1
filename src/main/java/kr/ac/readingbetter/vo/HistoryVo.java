package kr.ac.readingbetter.vo;

public class HistoryVo {
	private Long no;
	private Integer score;
	private Integer point;
	private Long memberNo;
	private Integer identity;
	private Long keyNo;

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public Long getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(Long memberNo) {
		this.memberNo = memberNo;
	}

	public Integer getIdentity() {
		return identity;
	}

	public void setIdentity(Integer identity) {
		this.identity = identity;
	}

	public Long getKeyNo() {
		return keyNo;
	}

	public void setKeyNo(Long keyNo) {
		this.keyNo = keyNo;
	}

	@Override
	public String toString() {
		return "HistoryVo [no=" + no + ", score=" + score + ", point=" + point + ", memberNo=" + memberNo
				+ ", identity=" + identity + ", keyNo=" + keyNo + "]";
	}
}