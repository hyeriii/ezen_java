package ch08;

public class Radio implements RemoteControl,Interface{

	//�������̽��� ���� Ŭ������ �ݵ�� �������̽��� �߻�޼ҵ带 �������ؾ��Ѵ�.
		@Override 
		public void trunOn() {
			System.out.println("radio�� �մϴ�.");
		}
		@Override 
		public void trunOff() {
			System.out.println("radio�� ���ϴ�.");
		}
		@Override 
		public void setVolume(int volume) {
			if(volume > RemoteControl.MIN_VOLUME
					&& volume < RemoteControl.MAX_VOLUME) {
				System.out.println(volume+"���� �����մϴ�.");
			}
		}
		
		
		
		@Override 
		public void interfaceM1() {
			System.out.println("interfaceM1");
		}
		@Override 
		public void interfaceM2() {
			System.out.println("interfaceM2");
		}
		
}
