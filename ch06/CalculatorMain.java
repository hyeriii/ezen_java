package ch06;

public class CalculatorMain {

	public static void main(String[] args) {

		//210712
		//static
		
		//메소드 영역에 class가 등록될때 static 블록이 실행되므로 main에서 값을 할당하는 시점보다 먼저 실행됨
		System.out.println("Calculator.num2 -> " + Calculator.num2);
		
		Calculator.num1 = 10;
		Calculator.num2 = 20;
		
		
		System.out.println("num1->" + Calculator.num1);
		System.out.println("num2->" + Calculator.num2);
		
		Calculator cal = new Calculator();
		cal.num1 = 20;
		cal.num2 = 30;
	
		System.out.println("cal.num1->" + cal.num1);
		System.out.println("cal.num2->" + cal.num2);
	
		int result = Calculator.add(10, 20);
		System.out.println(result);
		
		//*******************************************************
		//1. 인스턴스 필드를 정의해야 하는 경우
		//-class로 생성된 객체마다 다른 값을 지니고 있으면 객체를 통해서 접근하는것이 옳은 경우
		//정적필드로 정의해야하는 경우
		//설계도인 클래스가 가지는 속성인 경우 정적필드로 정의
		
		
	}

}
