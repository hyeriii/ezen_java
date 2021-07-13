package ch06;

public class Board {
	//210713
	
	//entity클래스, 데이터를 담고잇는 그릇 역할을 하는 클래스
	//데이터는 클래스의 필드에 담기게 된다.
	
	//1.제목, 2. 작성자, 3. 작성일, 4. 좋아요수, 5. 조회수, 6. 내용 
	private String title; 
	private String writer;
	private String wdate;
	private int likeCnt;
	private int hit;
	private String content;
	
	//필드의 데이터를 셋팅해주는 메소드 setter : 값의 유효성 겁사
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	
	public void setLikeCnt(int likeCnt) {
		this.likeCnt = likeCnt;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public void setContent(String content) {
		this.content = content;
	}
			
	//getter 역할은 호출한 곳의 필드가 가지고있는 값 반환 : 데이터 가공처리!!
	public String getTitle() {
		return title;
	}
	public String getWriter() {
		return writer;
	}
	public String getWdate() {
		return wdate;
	}
	public int getLikeCnt() {
		return likeCnt;
	}
	public int getHit() {
		return hit;
	}
	public String getContent() {
		return content;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
