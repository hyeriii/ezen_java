package ch06;

public class Board {
	//210713
	
	//entityŬ����, �����͸� ����մ� �׸� ������ �ϴ� Ŭ����
	//�����ʹ� Ŭ������ �ʵ忡 ���� �ȴ�.
	
	//1.����, 2. �ۼ���, 3. �ۼ���, 4. ���ƿ��, 5. ��ȸ��, 6. ���� 
	private String title; 
	private String writer;
	private String wdate;
	private int likeCnt;
	private int hit;
	private String content;
	
	//�ʵ��� �����͸� �������ִ� �޼ҵ� setter : ���� ��ȿ�� �̻�
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
			
	//getter ������ ȣ���� ���� �ʵ尡 �������ִ� �� ��ȯ : ������ ����ó��!!
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
