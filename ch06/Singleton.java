package ch06;

public class Singleton {

	//210713
	//싱글톤? 하나의 시스템에서 단 하나만 존재하는 객체 의미
	
	//1.외부에서 객체를 생성할 수 없도록 제어 : 생성자를 class외부에서 호출할 수 없게해야함
	private Singleton(){
		//접근제한자 private 이용하여 외부에서 생성자 호출 할 수 없도록 선언 
	}
	
	
	//2.하나만 존재하는 객체를 참조하고 있는 정적필드 생성 : 정적필드는 클래스로부터 하나만 존재하는 주소를 가지고 있지만 외부에서 값 변경 가능
	//때문에 하나의 객체를 담고 있는 정적필드를 외부에서 접근 할 수 없도록 제어
	private static Singleton singleton = new Singleton();
	
	//3.외부에서 호출 할 수 있는 메소드 생성 : 정적필드에 담겨있는 하나의 객체를 반환한다.
	public static Singleton getInstance() {
		
		return singleton;
	}
	
}
