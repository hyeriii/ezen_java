package ch12;

public class JoinMain {

	public static void main(String[] args) {
		
		//*********************************
		//join() ȣ��� �������� ������ ����ɶ����� ȣ���� �����忡�� �Ͻ����� ���·� ��ٸ��� �޼ҵ�
		//�ַ� ��� �۾��� �� �� ���� ����
		//*********************************
		JoinThread join = new JoinThread();
		join.start();
		try{
			join.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
		for(int i =0 ; i< 100; i++) {
			System.out.println("main"+i);
		}
		System.out.println("main ����");
	}

}
