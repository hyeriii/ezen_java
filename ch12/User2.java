package ch12;

public class User2  extends Thread{

	public Calculator cal;//������ü ���� �ʵ� ���� 
	
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
