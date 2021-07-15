package ch08;

public class InterfaceMain {

	public static void main(String[] args) {
		//개발소스와 인터페이스와 구현 객체간의 상호작용에 대하여
		Tv tv = new Tv();//구현객체 생성
		RemoteControl remotecon = tv;//인터페이스 타입변수에 구현객체 대입
		//정형화되어있는 메소드 호출 
		remotecon.trunOn();
		remotecon.trunOff();
		remotecon.setVolume(5);
		
		Radio rd = new Radio();
		remotecon = rd;
		
		remotecon.trunOn();
		remotecon.trunOff();
		remotecon.setVolume(5);
		
		
		//인터페이스 사용이유 :
		//개발소스와 객체를 분리함으로 개발자는 호출하면 되는 메소드의 리스트만 알고 실제 실행결과는 
		//인터페이스에 대입되어 있는 객체레 따라 달라지므로 유지보수와 객체의 부품화 및 다형성 구형이 가능함 
		
		
		//********************************
		//익명 구현 객체 생성 방법
		//익명 구현 객체? 클래스가 존재하지 않는 1회성에 그치는 객체의미
		remotecon = new RemoteControl() {
			//익명의 구현객체에서도 인터페이스가 가지는 추상메소드를 모두 정의해야함
			//필드, 메소드 추가로 새로 생성 가능함
			//단,익명의 객체는 클래스가 없고 즉, 타입이 없기때문에 인터페이스 밖에서 사용이 불가함
			//해당 블록 내에서만 사용이 가능하다
			public String field;
			
			public void method() {
				
			}
			@Override 
			public void trunOn() {
				System.out.println("이름 없는 장치를 켭니다.");
			}
			@Override 
			public void trunOff() {
				System.out.println("이름 없는 장치를 끕니다.");
			}
			@Override 
			public void setVolume(int volume) {
				if(volume > RemoteControl.MIN_VOLUME
						&& volume < RemoteControl.MAX_VOLUME) {
					System.out.println(volume+"으로 변경합니다.");
				}
			}
		};
		
		remotecon.trunOn();
		
		//다중인터페이스 구현객체는 여러 인터페이스에 대입 될 수 있으며
		//이때 자신의 대입되어있는 인터페이스의 추상 메소드만 사용할 수있음 
		
		Interface in = rd;
		in.interfaceM1();
		in.interfaceM2();

		
		//****************************************************
		//디폴트  메소드 사용
		//구현객체들이 가지는 공통 동작이므로 반드시 인터페이스의 타입변수에 객체가 담긴 이후 사용 가능 
		remotecon.setMute(true);
		
		remotecon =rd;
		remotecon.setMute(true);
		
		remotecon =tv;
		remotecon.setMute(true);
		
		
		//****************************************************
		//정적 메소드 사용
		//인터페이스가 가지는 동작이므로 인터페이스를 통해서 접근한다. 
		RemoteControl.changeBattery();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
