package ch07;

public class ChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1 c1 = new Child1();
		
		System.out.println("c1.childField1         : " + c1.childField1 );
		c1.method3();
		
		//c1 class Child�� �θ� Ŭ������ ���� ��ӹ޴� ���� 
		System.out.println(c1.parentField1);
		// c1.method1(); private �� �θ� class����� ��� �Ұ��� 
		
		System.out.println(c1.parentField2);
		c1.method2();
		
		Parent p1 = new Parent();
		
		System.out.println( "parent field "+ p1.field);
		System.out.println( "grandma field "+ p1.gfield);
		
	}

}
