package ch12;

import java.awt.Toolkit;

public class ThreadMain2 {

	public static void main(String[] args) {
		//������ ��� ���� �۾� ������ ���� 
		Thread thread = new Thread2();
		//thread.setName("testThread1");
		thread.start();
		
		
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
		
		Thread cThread = Thread.currentThread();
		System.out.println(cThread.getName());
		
		
		
		
		
		

	}

}
