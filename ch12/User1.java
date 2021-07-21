package ch12;

public class User1 extends Thread{

	public Calculator cal;//공유객체 담을 필드 선언 
	
	User1(){
		setName("User1");
	}
	
	@Override
	public void run() {
		cal.setMemory(100);
		
		for(int i = 0 ; i<20 ; i++) {
			cal.methodA();
		}
		
	}
	
}
