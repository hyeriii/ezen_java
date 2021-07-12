package ch06;

public class Calculator {

	//210712
	//static
	
	// static은 정적멤버를 선언할 때 붙이는 키워드, 정적멤버는 소속이 클래스로서 객체를 생성하기 않고 접근가능 ! 
	public static int num1;
	public static int num2;
	
	
	String color ; // 계산기 마다 색상이 다를 수 있으므로 인스턴스 필드
	static double pi= 3.14; //계산기마다 공통으로 가지고 있는 값 
	
	static {
		//정적 필드를 초기화 할때 사용하는 블록이다.
		//주고 한줄로 정의할 수 없는 복잡한 초기값의 경우 사용함
		num2 = 40;
	}
	
	
	//계산기 색상을 출력하는 매소드
	//메소드에서 인스턴스 필드를 사용하는 경우 인스턴스매소드로 정의
	//-인스턴스 필드는 객체가 존재햐야 생성되는 값이므로 클래스를 통해 접근할수 없다. 
	
	// 컴파일 에러 발생
	//public static String getColor() {
	//return color; 
	//}
	
	
	//인스턴스 멤버를 사용하지 않는 경우에는 정적메소드로 구현한다. 
	public static int add(int a, int b) {
		//getColor()
		//정적멤버는 인스턴스의 생성 없이 사용할 수 있는 멤버임 
		//정적멤버의 안에서 인스턴스 멤버를 사용할 수 없다. 
		
		//굳이 정적메소드 안에서 인스턴스 멤버가 필요한 경우 
		Calculator cal = new Calculator();
		//cal.getColor();
		return a+b;
	}
	
}
