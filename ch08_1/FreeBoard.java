package ch08_1;

public class FreeBoard extends Board{

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public void setContent(String content) {
		this.content= content;
	}
	public void setHit(int hit) {
		this.hit=hit;
	}
	
	public String getTitle() {
		return title;
	}
	public String getWriter() {
		return writer;
	}
	public String getWdate() {
		return wdate;
	}
	public String getContent() {
		return content;
	}
	public int getHit() {
		return hit;
	}
	
	
}
