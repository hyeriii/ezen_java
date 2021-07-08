package ch05;

public class Ex06 {
		//week 열어 타입을 사용한 예
		//열거타입 명이 변수의 데이터타입이 되는 이유
		//java에서 로컬 변수에 데이터를 담기 위해서는 데이터다입이 명시되어야 하며
		//해당 타입으로만 이루어진 값이 대입 될 수 있으므로
		//열거타입의 상수값을 받는 로컬변수는 데이터 타입이 해당 열거 타입이 되어야함
	Week momday = Week.MOMDAY;
	
	Week momday2 = Week.MOMDAY;
	
	//System.out.println( momday == momday2 );
	
}
