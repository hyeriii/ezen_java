package mission;

public class Board {

	private String title;
	private String write;
	private String date;
	private int  hit;
	private int like;
	private String content;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWrite() {
		return write;
	}
	public void setWrite(String write) {
		this.write = write;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	@Override
	public String toString() {
		Board b = new Board();
		return b.getTitle() + b.getWrite()+b.getDate()+b.getHit()+b.getLike()+b.getContent();
	}
	
	public Board(String writer, String date ) {
		this.write = write;
		this.date = date;
	}
	
	public Board(String title,String writer, String date ) {
		this.title = title;
		this.write = write;
		this.date = date;
	}
	public Board() {
	
	}
	
	
	
	
	
	}
