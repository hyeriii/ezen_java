package ch15;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	//�Խù� �������� Ŭ���� 

	public List<Board> getBoardList() {
		List<Board> list =new ArrayList<Board>();

		
		list.add(new Board("����","����"));

		 return list;
	}

}
