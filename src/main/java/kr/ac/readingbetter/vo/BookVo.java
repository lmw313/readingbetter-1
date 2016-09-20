package kr.ac.readingbetter.vo;

public class BookVo {
	private Long no;
	private String title;
	private Integer recommend;
	private String cover;
	private Long publisher_no;
	private Long author_no;
	private String authorName;
	private String publisherTitle;
	private String bkwd;

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

	public Integer getRecommend() {
		return recommend;
	}

	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public Long getPublisher_no() {
		return publisher_no;
	}

	public void setPublisher_no(Long publisher_no) {
		this.publisher_no = publisher_no;
	}

	public Long getAuthor_no() {
		return author_no;
	}

	public void setAuthor_no(Long author_no) {
		this.author_no = author_no;
	}

	public String getBkwd() {
		return bkwd;
	}

	public void setBkwd(String bkwd) {
		this.bkwd = bkwd;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisherTitle() {
		return publisherTitle;
	}

	public void setPublisherTitle(String publisherTitle) {
		this.publisherTitle = publisherTitle;
	}

	@Override
	public String toString() {
		return "BookVo [no=" + no + ", title=" + title + ", recommend=" + recommend + ", cover=" + cover
				+ ", publisher_no=" + publisher_no + ", author_no=" + author_no + ", authorName=" + authorName
				+ ", publisherTitle=" + publisherTitle + ", bkwd=" + bkwd + "]";
	}
}