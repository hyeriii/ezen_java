package ch12;

public class User2  extends Thread{

	public Calculator cal;//공유객체 담을 필드 선언 
	
	User2(){
		setName("User2");
	}
	
	@Override
	public void run() {
		cal.setMemory(50);

		for(int i = 0 ; i<20 ; i++) {
			cal.methodB();
		}
	}
}
