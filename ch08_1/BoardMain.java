package ch08_1;

public class BoardMain {

	public static void main(String[] args) {
		//notice �迭�� ����
		
				NoticeBoard n1 = new NoticeBoard();
				n1.setTitle("1��°");
				n1.setWriter("tester1");
				n1.setWdate("2021-07-15");
				n1.setContent("1��° ����");
				n1.setHit(10);
				n1.setTopYN(true);
				
				NoticeBoard n2 = new NoticeBoard();
				n2.setTitle("2��°");
				n2.setWriter("tester1");
				n2.setWdate("2021-07-15");
				n2.setContent("2��° ����");
				n2.setHit(10);
				n2.setTopYN(true);
				
				NoticeBoard n3 = new NoticeBoard();
				n3.setTitle("3��°");
				n3.setWriter("tester1");
				n3.setWdate("2021-07-15");
				n3.setContent("3��° ����");
				n3.setHit(10);
				n3.setTopYN(true);
				
				NoticeBoard n4 = new NoticeBoard();
				n4.setTitle("4��°");
				n4.setWriter("tester1");
				n4.setWdate("2021-07-15");
				n4.setContent("4��° ����");
				n4.setHit(10);
				n4.setTopYN(true);
				
				NoticeBoard n5 = new NoticeBoard();
				n5.setTitle("5��°");
				n5.setWriter("tester5");
				n5.setWdate("2021-07-15");
				n5.setContent("5��° ����");
				n5.setHit(10);
				n5.setTopYN(true);
				
				NoticeBoard[] arrayNotice = new NoticeBoard[] {n1,n2,n3,n4,n5};
				NoticeBoardList nList = new NoticeBoardList(arrayNotice);
				
				//interface ���
				ListBoard interfaceL = nList;
				
				
				NoticeBoard index3 = (NoticeBoard)interfaceL.get(3);
				
				System.out.println(index3.getTitle());
				
				//**************************************
				
				FreeBoard f1  = new FreeBoard();
				f1.setTitle("1��°");
				f1.setWriter("tester1");
				f1.setWdate("2021-07-15");
				f1.setContent("1��° ����");
				f1.setHit(10);
				
				FreeBoard f2  = new FreeBoard();
				f2.setTitle("2��°");
				f2.setWriter("tester2");
				f2.setWdate("2021-07-15");
				f2.setContent("2��° ����");
				f2.setHit(20);
				
				FreeBoard f3  = new FreeBoard();
				f3.setTitle("3��°");
				f3.setWriter("tester3");
				f3.setWdate("2021-07-15");
				f3.setContent("3��° ����");
				f3.setHit(30);
				
				FreeBoard f4  = new FreeBoard();
				f4.setTitle("4��°");
				f4.setWriter("tester4");
				f4.setWdate("2021-07-15");
				f4.setContent("4��° ����");
				f4.setHit(40);
				
				FreeBoard f5  = new FreeBoard();
				f5.setTitle("5��°");
				f5.setWriter("tester5");
				f5.setWdate("2021-07-15");
				f5.setContent("5��° ����");
				f5.setHit(50);
				
				FreeBoard f6  = new FreeBoard();
				f6.setTitle("6��°");
				f6.setWriter("tester6");
				f6.setWdate("2021-07-15");
				f6.setContent("6��° ����");
				f6.setHit(56);
	
				FreeBoard[] arrayFree = new FreeBoard[] {f1, f2,f3,f4,f5,f6};
				FreeBoardList fList = new FreeBoardList(arrayFree);
				
				//interface ���
				ListBoard interfaceF = fList;
				
				System.out.println(interfaceF.size());
				
	}

}
