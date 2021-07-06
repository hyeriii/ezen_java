package ch03;

public class Ex04 {

	public static void main(String[] args) {
		//210706
		//논리연산자
		//1. 논리곱 
		//boolean 변수 이용한 논리곱
		boolean b1 = true;
		boolean b2 = false;
		
		boolean result;
		result = b1 && b2 ;
		System.out.println(result);
		
		//비교연산을 사용한 논리곱 
		int a = 10;
		int b = 20;
		int c = 10;
		
		result = (a<20) && (b<c);
		System.out.println(result);
		
		
		//논리연산자 사용한 논리곱
		b1 = true;
		b2 = false;
		result = (b1 && b2) && (b1&&b2);
		System.out.println(result);
		
		//논리곱에서 연산자 &&의 &의 차이 
		//1. &연산자
		//피연산자1의 값과 관게없이 피연산자 2까지 계산한뒤 결과값 
		b1 = false; 
		b2 = true;
		
		result = b1 & b2;
		System.out.println(result);
		
		//2. &&연산자
		//피연산자1의 값을 보고 피연산자2의 값을 확인해야하는지 판한 후 처리
		//적어도 2경우에는 피연산자2를 비교하지 않으므로 시간 단축에 용의 
		
		//2. 논리합OR
		b1 = false; 
		b2 = true;
		
		result = b1 || b2; 
		System.out.println("b1 || b2 ->"+result);
		
		
		a=10; b=20; c=10;
		result = (a>b)||(b>c);
		System.out.println("(a>b)||(b>c) ->"+result);
		
		//논리연산자를 이용한 논리합 
		b1=false; b2= true;
		result = (b1&&b2)||(b1||b2);
		System.out.println("(b1&&b2)||(b1>b2) ->"+result);
		
		//3.배타적 논리합 ^
		b1 = false; 
		b2 = true;
		
		result = b1 ^ b2; 
		System.out.println("b1 ^ b2 ->"+result);
		
		//4.논리부정 !
		//논리값을 가지는 피연산자1의 값을 반전 시킴 f -> t, t-> f
		b1 =true;
		result = !b1;
		System.out.println(result);
	
	
	
	
	}

}
