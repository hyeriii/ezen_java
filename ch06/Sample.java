package ch06;

public class Sample {

	//class는 객체를 만들 설계도를 정의한다
	//class에는 생성될 객체의 동작과 속성을 정의 할 수 있다. 
	
	//필드 선언
	//데이터타입 필드명
	//name, date
	
	String name;
	String date;
	int number;
	
	//필드가 부품일 경우
	Sample_a a ;
	
	
	//메소드 생성
	public void method1() {
		//class 내부에서 필드 접근하는 방법
		//method가 호출된다라는 것은 이미 객체가 생성된 이후 이므로 객체가 가지는 필드를 문제없이 사용할 수 있다. 
		System.out.println(name);
		System.out.println(number);
	}
	
	
	
	
	
	
	
}
