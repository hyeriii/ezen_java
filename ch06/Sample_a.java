package ch06;

public class Sample_a {
	
	//feild
	int filed1;

	//생성자는 개발자가 선언하지 않을 있으나 컴파일 된 클래스는 반드시 하나이상의 생성자를 가짐
	//컴파일러가 소스파일에 생성자가 없는 경우 자동으로 class파일에 생성해줌
	
	//생성자는 반드시 클래스의 이름과 동일해야한다. 
	//기본생성자
	public Sample_a(){
		
	}
	
	
	//사용자 정의형 생성자
	//()안에 매개변수를 선언할 수 있다
	//해당 생성자를 호출시 외부에서 넘기는 값을 받는 변수 
	public Sample_a(int filed1) {
		System.out.println("Sample_a()의 사용자 정의형 "+filed1);
		
		//생성자를 이용하여 외부에서 값을 받아오면 객체 필드의 값을 초기화 할 수 있다. 
		//num = filed1;
		
		
		//만일 매개변수와 필드 이름 값을때
		//this는 현재 생성되고 있는 객체의 주소값을 반환하는 키워드 
		this.filed1 = filed1;
		
		
		
	}
	
}
