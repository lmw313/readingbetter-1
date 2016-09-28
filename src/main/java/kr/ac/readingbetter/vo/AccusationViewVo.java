package kr.ac.readingbetter.vo;

public class AccusationViewVo {
	private String content;
	private String id;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "AccusationViewVo [content=" + content + ", id=" + id + "]";
	}
}
