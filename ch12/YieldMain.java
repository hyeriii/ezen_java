package ch12;

public class YieldMain {
	public static void main(String[] args) {
		
		//yield() - ������ ��ȸ�� ���� �����尡 �ٸ� �����忡��  ��ȸ�� �絵�ϴ� �޼ҵ�
		
		ThreadA tA = new ThreadA();
		ThreadB tB = new ThreadB();
		
		tA.start();
		tB.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		tA.work = false;
	}

}


