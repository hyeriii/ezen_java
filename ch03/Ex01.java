package ch03;

public class Ex01 {

	public static void main(String[] args) {
		//210705
		//단항연산자 - 피연산자가 하나인 연산자
		//1. 부호 연산자 부호연산자의 결과는 무조건 int 타입이다. 
		byte byteV = 10;
		byte result = (byte)-byteV;
		System.out.println(result);

		//2. 증감연산자
		//2-1) 증가 연산자 
		int intV = 10 ;
		
		// 전위증가 연산자 - 실행전에 1을 증가하고 실행
		System.out.println("전위증가 연산자:" + ++intV);//변수 값을 읽기전에 1을 증가하고 읽어오기
		
		//후위증가 연산자 - 실행부터 하고 1을 증가 
		System.out.println("후위증가 연산자:" + intV++);// 변수의 값을 일단 읽어온 후에 1을 증가 
		
		System.out.println("후위증가 연산자:" + intV);
		
		//2-2) 감소 연산자 
		int intV2 = 10 ;
				
		// 전위감소 연산자 - 실행전에 1을 감소하고 실행
		System.out.println("전위감소 연산자:" + --intV2);//변수 값을 읽기전에 1을 감소하고 읽어오기
				
		//후위감소 연산자 - 실행부터 하고 1을 감소 
		System.out.println("후위감소 연산자:" + intV2--);// 변수의 값을 일단 읽어온 후에 1을 감소
				
		System.out.println("후위감소 연산자:" + intV2);
				
	}

}
