package kr.ac.readingbetter.vo;

public class ScoresVo {
	private Long rank; // 순위
	private String id; // 아이디
	private String title; // 학교 이름
	private Long monthlyScore; // 한 달 점수
	private Long myMonthlyScore; // 로그인 한 회원의 한 달 점수
	private Long totalScore; // 전체 점수 (초기화 되지 않는 점수)
	private Long myTotalScore; // 로그인 한 회원의 전체 점수
	private Long schoolScore; // 학교 점수
	private Long mySchoolScore; // 로그인 한 회원의 학교 점수

	public Long getRank() {
		return rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getMonthlyScore() {
		return monthlyScore;
	}

	public void setMonthlyScore(Long monthlyScore) {
		this.monthlyScore = monthlyScore;
	}

	public Long getMyMonthlyScore() {
		return myMonthlyScore;
	}

	public void setMyMonthlyScore(Long myMonthlyScore) {
		this.myMonthlyScore = myMonthlyScore;
	}

	public Long getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Long totalScore) {
		this.totalScore = totalScore;
	}

	public Long getMyTotalScore() {
		return myTotalScore;
	}

	public void setMyTotalScore(Long myTotalScore) {
		this.myTotalScore = myTotalScore;
	}

	public Long getSchoolScore() {
		return schoolScore;
	}

	public void setSchoolScore(Long schoolScore) {
		this.schoolScore = schoolScore;
	}

	public Long getMySchoolScore() {
		return mySchoolScore;
	}

	public void setMySchoolScore(Long mySchoolScore) {
		this.mySchoolScore = mySchoolScore;
	}

	@Override
	public String toString() {
		return "RankingVo [rank=" + rank + ", id=" + id + ", title=" + title + ", monthlyScore=" + monthlyScore
				+ ", myMonthlyScore=" + myMonthlyScore + ", totalScore=" + totalScore + ", myTotalScore=" + myTotalScore
				+ ", schoolScore=" + schoolScore + ", mySchoolScore=" + mySchoolScore + "]";
	}
}