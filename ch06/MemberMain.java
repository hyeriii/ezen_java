package ch06;

public class MemberMain {

	public static void main(String[] args) {
		//210712 
		//Member Ŭ������ �̿��ؼ� m1,m2 ��ü ����
		
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
				System.out.println("i ���� "+ i);
				m1.method1("����");
				System.out.println("method ȣ���� ,i ���� "+ i);
				break;
			}else {
				m1.method1("Test");
			}
			
			i++;
		}
		
		
	}

}
