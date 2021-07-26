package ch15;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	//게시물 가져오는 클래스 

	public List<Board> getBoardList() {
		List<Board> list =new ArrayList<Board>();

		
		list.add(new Board("제목","내용"));

		 return list;
	}

}
