package ch07;

public abstract class Machine2 {

	public String brand;
	public String model;
	public String no;

	
	//추상메소드 선언 - 오버라이딩 대상,메소드 껍데기
	//추상클래스를 이용하여 단독객체가 존재할 수 없기떄문에 추상클래스의 인스턴스 메소드 블럭은 무의미하므로
	//정형화 되어있는 메소드 명을 제공하는 추상 메소드를 선언한다.
	//추상메소드는 실행블록이 없고 메소드 선언부만 존재한다.
	//추삼메소드는 상속받는 모든 자식들이 가지고있는 공통동작이라는 개념이므로
	//반드시 상속받는 자식에서 전부 재정의되어야 한다. 
	public abstract void trunOn();
	public abstract void trunOff();
}
