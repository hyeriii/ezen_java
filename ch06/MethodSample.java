package ch06;

public class MethodSample {
	
	//210712
	//메소드 오버로딩 예제

	public void m1() {
		System.out.println("void m1() 호출");
	}
	
	//메소드 이름과 매개변수 선언이 동일하면 리턴타입이 달라도 메소드 오버로딩 불가함
/*	public int m1() {
		System.out.println("void m1() 호출");

	}
*/	
	
	
	//m1 메소드 이름 동일, 매개변수의 갯수가 다르므로 오버로딩 가능함 
	public void m1(int arg) {
		System.out.println("void m1(int arg) 호출");
	}
	
	public int m1(String arg) {
		System.out.println("void m1(String arg) 호출");
		//arg 문자열을 정수값으로 변경
		return Integer.parseInt(arg);
	}
	
	
	public void m1(String arg1, int arg2) {
		System.out.println("void m1(String arg1, int arg2) 호출");
	}
	
	//타입의 순서가 다름 -> 오버로딩 가능함
	public void m1(int arg2, String arg1) {
		System.out.println("void m1(int arg2, String arg1) 호출");
	}
	
	
	
}
