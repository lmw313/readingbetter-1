package kr.ac.readingbetter.vo;

public class PublisherVo {
	private Long no;
	private String title;
	private String kwd;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getKwd() {
		return kwd;
	}
	public void setKwd(String kwd) {
		this.kwd = kwd;
	}
	
	@Override
	public String toString() {
		return "PublisherVo [no=" + no + ", title=" + title + ", kwd=" + kwd + "]";
	}
}
