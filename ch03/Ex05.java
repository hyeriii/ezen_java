package ch03;

public class Ex05 {

	public static void main(String[] args) {
		//210706
		//비트 논리 연산자 - 정수타입에서만 사용가능 
		//1.비트 논리곱
		byte a = 5 ;
		byte b = 7 ;
		
		byte result = (byte)(a&b);
		
		//2.비트 논리합 
		result =(byte)(a|b);
		
		//3.비트 배타적 논리합 : 값으면 0, 다르면 1 
		result = (byte)(a^b); 
		System.out.println("(a^b)->"+result);
		
		//4.비크 논리부정 ~ , 단항연산임 
		result = (byte)~a;
		System.out.println("~a ->"+result);
		
		//5.비트 이동 연산자 << 
		//피연산자1의 비트를 피연산자2의 칸만큼이동
		
		 result = (byte)(a << 2);
		 
		//6. 비트 이동 연산자 >>, >>>
		//6-1. >> : 이동하고 비워진 칸에 대해서는 피연사자의1의 최상위 비트와 동일한 비트로 채워짐, 음수인지 양수인지에 대해 부호 유지
		 
		 result =(byte)(a>>2);
		 System.out.println("(a>>2) ->"+result);

		 //음수일 경우
		 a = -5;//|1|1|1|1|1|0|1|1|
		 result =(byte)(a>>2);//|1|1|1|1|1|1|1|0|, 부호 유지됨
		 System.out.println("(a>>2) ->"+result);
		 
		 //6-2. >>> : 남은 좌측 비트에 대하여 무조건 0으로 채워짐  
		 int result1 = (a >>> 2);
		 System.out.println("(a>>>2) ->"+result1);
	}

}
