package ch06;

public class BoardMain {

	public static void main(String[] args) {
		//entityŬ���� board�� �̿��Ͽ� �Խ��� �����
		
		//1. �Խñ� ���
		Board[] boardList = null; //���� ����� ��
		
		//boardList�� �߰��� Board ��ü 5�� ����
		Board board1 = new Board();
		board1.setTitle("ù��° �Խñ��Դϴ�.");
		board1.setWriter("�ۼ���");
		board1.setWdate("2021-07-13");
		board1.setLikeCnt(10);
		board1.setHit(20);
		board1.setContent("ù��° �Խñ� �����Դϴ�. ");
		
		//boardList�� �߰��� Board ��ü 5�� ����
		Board board2 = new Board();
		board2.setTitle("�ι�° �Խñ��Դϴ�.");
		board2.setWriter("�ۼ���");
		board2.setWdate("2021-07-13");
		board2.setLikeCnt(10);
		board2.setHit(20);
		board2.setContent("�ι�° �Խñ� �����Դϴ�. ");
		
		
		//boardList�� �߰��� Board ��ü 5�� ����
		Board board3 = new Board();
		board3.setTitle("����° �Խñ��Դϴ�.");
		board3.setWriter("�ۼ���");
		board3.setWdate("2021-07-13");
		board3.setLikeCnt(10);
		board3.setHit(20);
		board3.setContent("����° �Խñ� �����Դϴ�. ");
		
		
		//boardList�� �߰��� Board ��ü 5�� ����
		Board board4 = new Board();
		board4.setTitle("�׹�° �Խñ��Դϴ�.");
		board4.setWriter("�ۼ���");
		board4.setWdate("2021-07-13");
		board4.setLikeCnt(10);
		board4.setHit(20);
		board4.setContent("�׹�° �Խñ� �����Դϴ�. ");
		
		//boardList�� �߰��� Board ��ü 5�� ����
		Board board5 = new Board();
		board5.setTitle("�ټ���° �Խñ��Դϴ�.");
		board5.setWriter("�ۼ���");
		board5.setWdate("2021-07-13");
		board5.setLikeCnt(10);
		board5.setHit(20);
		board5.setContent("�ټ���° �Խñ� �����Դϴ�. ");
		

		boardList = new Board[] {board1,board2, board3,board4,board5
				
		};
		
		for(int i = 0 ; i<boardList.length ; i++) {
			Board board = boardList[i];
			System.out.println((i+1)+"|" +board.getTitle()+"|"+board.getWriter() + board.getContent()+"|"+board.getWdate());
		}
		
	}

}
