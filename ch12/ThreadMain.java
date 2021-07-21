package ch12;

import java.awt.Toolkit;

public class ThreadMain {

	public static void main(String[] args) {
		//Thread1 객체 생성, 멀티스레드 구현
		Runnable run = new Thread1();
		Thread thread1 = new Thread(run);
		thread1.start();//작업 스레드 실행되는 시점 
		
		
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
