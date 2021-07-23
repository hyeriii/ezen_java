package ch15;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	//게시물 가져오는 클래스 
	
	/*
	 * private String title; private String content;
	 */
	
	public Board getBoardList() {
		ArrayList<Board> b= new ArrayList();
		List<Board> list = b;
		//return b.getTitle(); 
		
		list.add(getBoardList());
		//String title = list.get(0);
		//return title;
	}

}
