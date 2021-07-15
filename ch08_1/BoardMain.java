package ch08_1;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//notice ¹è¿­ 
		NoticeBoard n1 = new NoticeBoard();
		n1.setTitle("A");
		n1.setWriter("test");
		n1.setHit(10);
	
		NoticeBoard n2 = new NoticeBoard();
		n2.setTitle("A2");
		n2.setWriter("2test");
		n2.setHit(10);
		
		NoticeBoard n3 = new NoticeBoard();
		n3.setTitle("3A");
		n3.setWriter("3test");
		n3.setHit(10);
		
		NoticeBoard n4 = new NoticeBoard();
		n4.setTitle("4A");
		n4.setWriter("4test");
		n4.setHit(10);
		
		NoticeBoard n5 = new NoticeBoard();
		n5.setTitle("5A");
		n5.setWriter("5test");
		n5.setHit(10);
		
		
		NoticeBoard[] arryN = new NoticeBoard[] {n1, n2, n3, n4, n5};
		NoticeBoardList nList = new NoticeBoardList(arryN);
		
		NoticeBoard index3 = (NoticeBoard)nList.get(3); 
		System.out.println(index3.getWriter());

		
		ListBoard interfaceL = nList;
		
	

		NoticeBoard index4 = (NoticeBoard)interfaceL.get(4); 
		System.out.println(  index4.getWriter() );
		
		}

}
