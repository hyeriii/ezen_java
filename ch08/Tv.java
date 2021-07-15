package ch08;

public class Tv implements RemoteControl {
	//인터페이스와 구현 클래스는 반드시 인터페이스의 추상메소드를 재정의해야한다.
	@Override 
	public void trunOn() {
		System.out.println("tv를 켭니다.");
	}
	@Override 
	public void trunOff() {
		System.out.println("tv를 끕니다.");
	}
	@Override 
	public void setVolume(int volume) {
		if(volume > RemoteControl.MIN_VOLUME
				&& volume < RemoteControl.MAX_VOLUME) {
			System.out.println(volume+"으로 변경합니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
