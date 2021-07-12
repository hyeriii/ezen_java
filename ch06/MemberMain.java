package ch06;

public class MemberMain {

	public static void main(String[] args) {
		//210712 
		//Member 클래스를 이용해서 m1,m2 객체 생성
		
		Member m1 = new Member();
		m1.method1("m1");
		
		Member m2 = new Member();
		m2.method1("m2");
		
		m1.age = 20;
		m2.age = 10;
		
		int result = m1.getAge();
		System.out.println(result);
		System.out.println("--------------------");
		
		int i =0;
		while(true) {
			if(i>5) {
				System.out.println("i 값은 "+ i);
				m1.method1("종료");
				System.out.println("method 호출후 ,i 값은 "+ i);
				break;
			}else {
				m1.method1("Test");
			}
			
			i++;
		}
		
		
	}

}
