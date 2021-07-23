package ch15;

import java.util.List;

public class ListMain2 {

	public static void main(String[] args) {
		//BoardDao 클래스 사용 
		
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board:list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}

	}

}
