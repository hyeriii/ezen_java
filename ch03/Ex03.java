
package ch03;

public class Ex03 {

	public static void main(String[] args) {
		//210705
		//이항연산자2
		//1. 비교연산자
		int a = 10;
		int b = 20;
		int c = 10;
		boolean result = false;
		
		//1-1. 대소 비교
		result = a > b; 
		System.out.println("a > b -> "+result);
		
		result = a < b; 
		System.out.println("a < b -> "+result);
		
		result = a >= c; 
		System.out.println("a >= c -> "+result);
		
		
		//1-2. 동등 비교, boolean값에서도 사용가능함 
		result = a == b;
		System.out.println("a == b :"+result);
		
		result = a != b;
		System.out.println("a!=b : " + result);
		
		boolean b1 = true;
		boolean b2 = false;
		result = b1 == b2;
		System.out.println("b1 == b2 :"+result);
		
		
		// 문자열의 경우 항상 값이 같지 않을 수 있다는것을 기억, ==
		String str1 = "test";
		String str2 = "test";
		result = str1 == str2;
		System.out.println("str1 == str2 : " + result);
		
		String str3 = new String("test"); // 객체생성
		System.out.println( str3 );
		
		//문자열 비교시 equals이용하는것이 가장 정확함 
		System.out.println("str1==str3  : " + str1.equals(str2) );
	}

}
