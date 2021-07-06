package ch03;

public class Ex02 {

	public static void main(String[] args) {
		//210705
		//이항 연산자
		//1. 산술연산자 - overflow ex
		byte byteV = 10;
		byte byteV2 = 127 ; //byte타입으로 담을 수 있는 가장 큰 정수 값
		
		//byte의 범위 ,-128 -127 -126 ...
		byte result = (byte)(byteV + byteV2);
		// OR  int result = byteV + byteV2; 이렇게도 해결가능함 
		System.out.println(result);
		
		//값을 0으로 나누려고 했을 때 문제점 
		
		//1.정수의 경우 - 오류 발생하므로 오류 처리하는 소스코드 추가하면 해결가능(예외처리)
		//int resultInt = 10/0 ;
		//System.out.println(resultInt); 
		
		//2.실수의 경우
		double d1 = 30.0;
		double d2 = 0.0;
		
		double resultDouble = d1/d2;
		System.out.println(resultDouble); //infinity 발생 
		
		//에러발생한것이 아니라 위 경우1번처럼 예외처리 불가능함 아래와 같이 해결가능 
		boolean resultBoolean = Double.isInfinite(resultDouble);
		System.out.println(resultBoolean);
		
		if(resultBoolean) {
			System.out.println("0.0으로 나눌수없습니다.infinity 발생");
		}
		
		//나머지를 구하는 연산에서 정수, 실수를 0으로 나눴을때 실행 오류
		
		//1. 정수로 나머지를 구하는 경우
		/*
		int a = 10;
		int b = 0;
		
		int result1 = a%b; // 오류 발생, 예외처리 필요
		
		System.out.println(result1);
		*/
		
		//2. 실수로 나머지 구하는 경우
		d1 = 10.1;
		d2 = 0.0;
		
		double result2 = d1%d2;
		
		System.out.println(result2); // NaN 발생함

		boolean flag = Double.isNaN(result2);
		
		if(flag) {
		System.out.println("값을 0.0으로 나눌수 없으므로 나머지 값을 구할수 없습니다. NaN발생함 "); 
		}
		
		int a = 30; 
		int b = 10;
		
		result2 = (double)a%b;
		System.out.println(result2);
		
		//정확한 계산을 위해서는 실수를 사용하면 안됨
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result3 = apple -number*pieceUnit;
		System.out.println(result3); // 0.299999999...
		
		//실수는 부동 소수점으로 근사치를 가지기 때문에 정확한 계산이 어려움
		
		apple = 10;
		int pieceUnit2 = 1 ;
		
		int resulttemp = apple -number*pieceUnit2;
		result3 = resulttemp*0.1;
		System.out.println(result3);
		
		//문자열 예제
		String str1 = "학생" ;
		int e = 1;
		int v = 90;
		
		String str2 = str1 + e + ":"+ v;
		System.out.println(str2);
		
		
	} 

}
