package ch08_1;

public abstract class Board {
	public String title;
	public String writer;
	public String wdate;
	public String content;
	public int hit;
	
	public abstract void setTitle(String title);
	public abstract void setWriter(String writer);
	public abstract void setWdate(String wdate);
	public abstract void setContent(String content);
	public abstract void setHit(int hit) ;
	public abstract String getTitle() ;
	public abstract String getWriter() ;
	public abstract String getWdate();
	public abstract String getContent();
	public abstract int getHit();
}
