package ch06;

public class A {

	String title ;
	int hit;
	String writer;
	
	String type = "board";
	
	public A(String title, String writer, int hit ) {
		this.title = title;
		this.writer = writer;
		this.hit = hit;
		
	}
	
	//�޼ҵ� ����
	public void method1() {
		System.out.println("method1 ����");
		System.out.println("method1 ����");
	}
	
	
	public int method2() {
		
		return 10 ;
	}
	
	public int sum(int num1, int num2) {
		//���� �� �� ������ �� 
		int result = 0;
		for(int i =num1;i<=num2;i++) {
			result += i;
		}
		
		return result ;
	}
	
}
