package ch07_1;

public class Child2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c2 = new Child2();
		
		System.out.println(c2.child2field1);
		c2.method3();
		
		//c2.method1(); private 라서 ㄴ
	

		/*
		 *c2.method2(); 
		 *protected 이기때문에 상속받은 c2 객체이지만 사용하고 있는 클래스가 자식이 아니므로 사용할 수 없다. 
		 *
		 */
			
	}

}
