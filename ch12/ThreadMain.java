package ch12;

import java.awt.Toolkit;

public class ThreadMain {

	public static void main(String[] args) {
		//Thread1 ��ü ����, ��Ƽ������ ����
		Runnable run = new Thread1();
		Thread thread1 = new Thread(run);
		thread1.start();//�۾� ������ ����Ǵ� ���� 
		
		
		//main������ �������� 1�ʿ� �ѹ��� 5�� ���� �ڵ��� �� 
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0 ;i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
