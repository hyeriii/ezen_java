package ch08;

public class Tv implements RemoteControl {
	//�������̽��� ���� Ŭ������ �ݵ�� �������̽��� �߻�޼ҵ带 �������ؾ��Ѵ�.
	@Override 
	public void trunOn() {
		System.out.println("tv�� �մϴ�.");
	}
	@Override 
	public void trunOff() {
		System.out.println("tv�� ���ϴ�.");
	}
	@Override 
	public void setVolume(int volume) {
		if(volume > RemoteControl.MIN_VOLUME
				&& volume < RemoteControl.MAX_VOLUME) {
			System.out.println(volume+"���� �����մϴ�.");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
