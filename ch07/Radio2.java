package ch07;

public abstract  class Radio2 extends Machine2{

	//만약 추상클래스를 상속받았는데 추사 메소드를 하나라보 재정의하지못하는 경우 해당 클래스를 추상 클래스가 된다. 
 //abstract
	
	@Override
	public void trunOn() {
		System.out.println("radio on");
	}
	
	
	
}
