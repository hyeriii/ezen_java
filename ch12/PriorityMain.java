package ch12;

public class PriorityMain {

	public static void main(String[] args) {
		
		Thread thread1 = new ThreadPriority1();
		Thread thread2 = new ThreadPriority2();
		
		
		//priority�� �̿��ϸ� ���ü��� ��� �������� ��� �켱������ ������ �� �� ������ ���� ���� �������� ��
		//���� ������ ��ȸ�� ��� ���� ����� �� �ְ�
		//������ cpu�� �� �ھ��� ������ �Ҵ��� �����ڰ� ������ �� �����Ƿ� �켱������ �־ ���ļ��� ��� ��� ������� ���� �� �ִ�. 
		thread2.setPriority(10);
		thread1.setPriority(1);
		
		thread1.start();
		thread2.start();
	}

}
