package ch12;

import java.awt.Toolkit;

public class ThreadMain2 {

	public static void main(String[] args) {
		//스래드 상속 받은 작업 스레드 실행 
		Thread thread = new Thread2();
		//thread.setName("testThread1");
		thread.start();
		
		
		//main에서는 비프음을 1초에 한번씩 5번 내는 코딩을 함 
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
