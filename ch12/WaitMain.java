package ch12;

public class WaitMain {

	public static void main(String[] args) {
		//wait(), notify()
		
		Calculator cal = new Calculator();
		
		User1 u1 = new User1();
		u1.cal =cal;
		
		User2 u2 = new User2();
		u2.cal =cal;
		
		u1.start();
		u2.start();
		
	}

}
