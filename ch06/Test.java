package ch06;

public class Test {
	String field1;
	int field2;
	String field3;
	double field14;
	boolean field5;
	
	//생성자 생성시 접근제어가 생략가능 추후 설명
	//기본생성자
	Test(){
		System.out.println("기본생성자 호출");
	}
	
	//field1 초기화하는 생성자 
	Test(String field1)
	{
		this.field1 = field1;
		System.out.println("field1에  호출");
	}
	
	//field2 초기화하는 생성자
	Test(int field2)
	{
		this.field2 = field2;
		System.out.println("field2에  호출");
	}
	
	//field3 초기화하는 생성자
	//생성자 오버로딩은 매개변수의 타입, 갯수, 순서를 영향받는다.
	//갯수가 같은 경우 타입의 겹치지 않아야 오버로딩이 가능하다.
	/*Test(String field3)
	{
		this.field1 = field1;
		System.out.println("field1에  호출");
	}*/
	
	//field1,2를 초기화 하는 생성자
	Test(String field1, int field2)
	{
		this.field1 = field1;
		this.field2 = field2;
		System.out.println("field1,2를 초기화 하는 생성자 호출");
	}
	
	//field1,2를 초기화 하는 생성자- 타입, 갯수가 값을때는 매개변수 순서 바꿔서 오버로딩 가능 
		Test(int field2, String field1)
		{
			this.field1 = field1;
			this.field2 = field2;
			System.out.println("field1,2를 초기화 하는 생성자 호출");
		}
	
}
