package ch10;

public class ThrowsMain {

	public static void main(String[] args) throws Exception {
		//���� ���ѱ� Ű���� -throws
		
		FileInputStream file = new FileInputStream();
		/*
		 * try { file.close(); }catch(Exception e) {
		 * System.out.println("main �޾Ƽ� ó���߽��ϴ�"); }
		 */	
		//file.close();
		//System.out.println("������ ������ ������ ����");
		
		try {
		throw new NumberFormatException();
		}catch(Exception e) {
			System.out.println("���� �߻� ");
			e.printStackTrace();
		}
		
		System.out.println("������ ������ ������ ����");
		
	}

}
