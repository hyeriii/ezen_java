package ch12;

public class UserMain {

	public static void main(String[] args) {
		//멀티 스레드에서 객체를 공부하는 경우 발생하는 문제와 해결책
		
		Calculator cal= new Calculator(); // 공유 객체
		
		User1 user1 = new User1();
		user1.cal = cal;
		
		User2 user2 = new User2();
		user2.cal = cal;
		
		user1.start(); //부모에게 start 가 존재하기때문에 자식 스레드도 start 호출 가능 
		user2.start();
		
		
		
		
		
		
		
		
		

	}

}
