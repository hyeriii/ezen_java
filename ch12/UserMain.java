package ch12;

public class UserMain {

	public static void main(String[] args) {
		//��Ƽ �����忡�� ��ü�� �����ϴ� ��� �߻��ϴ� ������ �ذ�å
		
		Calculator cal= new Calculator(); // ���� ��ü
		
		User1 user1 = new User1();
		user1.cal = cal;
		
		User2 user2 = new User2();
		user2.cal = cal;
		
		user1.start(); //�θ𿡰� start �� �����ϱ⶧���� �ڽ� �����嵵 start ȣ�� ���� 
		user2.start();
		
		
		
		
		
		
		
		
		

	}

}
