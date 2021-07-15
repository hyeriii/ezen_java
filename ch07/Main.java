package ch07;

public class Main {

	public static void main(String[] args) {

		Tv tv = new Tv();
		tv.turnOn();
		
		Radio radio = new Radio();
		radio.turnOn();
		
		Home home = new Home();
		
		//상속에서 필드의 다형성
		//필드의 타입이 부모가 되므로 해당 필드에 다향한 지식을 대입시켜
		//같은 부모 타입이지만 어떤 자식이 대입되느냐에 따라 다른 결과를 도출하게 되는것 ! 
		
		//부모  Machinedp 자식 tv를 대입 
		home.machine = new Tv();
		
		home.machine.turnOn();

		
		//부모  Machinedp 자식 redio를 대입
		home.machine = new Radio();
		
		home.machine.turnOn();
		
		
		//상속에서 매개변수 다형성
		//메소드의 매개변수를 부모타입으로 선언하므로써 그의 인자값으로
		//다양한 자식 객체가 대입되어서 똑같은 메소드 호출이지만 어떤한 
		//자식이 대입되느냐에 따라 다양한 결과를 도출해내는 것
		Machine machine = new Machine();
		
		System.out.println("*******************************************************");
		
		home.turnOn(machine);
		
		home.turnOn(tv);
		home.turnOn(radio);
	}

}
