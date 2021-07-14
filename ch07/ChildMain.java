package ch07;

public class ChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1 c1 = new Child1();
		
		System.out.println("c1.childField1         : " + c1.childField1 );
		c1.method3();
		
		//c1 class Child은 부모 클래스로 부터 상속받는 구조 
		System.out.println(c1.parentField1);
		// c1.method1(); private 라서 부모 class벗어나며 사용 불가함 
		
		System.out.println(c1.parentField2);
		c1.method2();
		
		Parent p1 = new Parent();
		
		System.out.println( "parent field "+ p1.field);
		System.out.println( "grandma field "+ p1.gfield);
		
	}

}
