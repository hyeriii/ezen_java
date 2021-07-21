package ch12;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println("띵");
			try{
				// 현재 코드가 실행되고 있는 스레드를 1초동안 쉬겠다.
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	

}
