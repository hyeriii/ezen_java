package ch06;

public class BoardMain {

	public static void main(String[] args) {
		//entity클래스 board를 이용하여 게시판 만들기
		
		//1. 게시글 목록
		Board[] boardList = null; //아직 사이즈를 모름
		
		//boardList에 추가할 Board 객체 5개 생성
		Board board1 = new Board();
		board1.setTitle("첫번째 게시글입니다.");
		board1.setWriter("작성자");
		board1.setWdate("2021-07-13");
		board1.setLikeCnt(10);
		board1.setHit(20);
		board1.setContent("첫번째 게시글 내용입니다. ");
		
		//boardList에 추가할 Board 객체 5개 생성
		Board board2 = new Board();
		board2.setTitle("두번째 게시글입니다.");
		board2.setWriter("작성자");
		board2.setWdate("2021-07-13");
		board2.setLikeCnt(10);
		board2.setHit(20);
		board2.setContent("두번째 게시글 내용입니다. ");
		
		
		//boardList에 추가할 Board 객체 5개 생성
		Board board3 = new Board();
		board3.setTitle("세번째 게시글입니다.");
		board3.setWriter("작성자");
		board3.setWdate("2021-07-13");
		board3.setLikeCnt(10);
		board3.setHit(20);
		board3.setContent("세번째 게시글 내용입니다. ");
		
		
		//boardList에 추가할 Board 객체 5개 생성
		Board board4 = new Board();
		board4.setTitle("네번째 게시글입니다.");
		board4.setWriter("작성자");
		board4.setWdate("2021-07-13");
		board4.setLikeCnt(10);
		board4.setHit(20);
		board4.setContent("네번째 게시글 내용입니다. ");
		
		//boardList에 추가할 Board 객체 5개 생성
		Board board5 = new Board();
		board5.setTitle("다섯번째 게시글입니다.");
		board5.setWriter("작성자");
		board5.setWdate("2021-07-13");
		board5.setLikeCnt(10);
		board5.setHit(20);
		board5.setContent("다섯번째 게시글 내용입니다. ");
		

		boardList = new Board[] {board1,board2, board3,board4,board5
				
		};
		
		for(int i = 0 ; i<boardList.length ; i++) {
			Board board = boardList[i];
			System.out.println((i+1)+"|" +board.getTitle()+"|"+board.getWriter() + board.getContent()+"|"+board.getWdate());
		}
		
	}

}
