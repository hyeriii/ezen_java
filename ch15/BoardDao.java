package ch15;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	//�Խù� �������� Ŭ���� 
	
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
