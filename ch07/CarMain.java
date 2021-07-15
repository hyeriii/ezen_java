package ch07;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tire tire = new Tire();
		
		Car car = new Car(tire);
		car.run();
		
		
		HankukTire hTire = new HankukTire();
		car.tire = hTire;
		car.run();
		
		KumhoTire kTire = new KumhoTire();
		car.tire = kTire;
		car.run();
		
		//부모 타입에는 모든 자식 객체가 자동 형변환이 되지만 자식 타입에는 부모를 대입할 경우 강제 형변환이 필요함 
		//이유는 부모변수안에 담겨있는 주소값이 어떤 자식으로 부터 생성된 주소값인지 알 수 없기 때문이다. 
		//만약에 강제형변환의 결과가 다른 자식의 주소값을 대입하고자 하면 classcastexception이 발생합
		//HankukTire newTire =(HankukTire)car.tire; //런타입 오류 발생 
		
		
		//객체의 현재 참조 주소를 알 수있음 
		if( car.tire instanceof HankukTire ) {
			System.out.println("한국타이어가 맞습니다");
		}
		
		if( car.tire instanceof KumhoTire ) {
			System.out.println("금호타이어가 맞습니다");
		}
		
		
		
		
	}

}
