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
		
		//�θ� Ÿ�Կ��� ��� �ڽ� ��ü�� �ڵ� ����ȯ�� ������ �ڽ� Ÿ�Կ��� �θ� ������ ��� ���� ����ȯ�� �ʿ��� 
		//������ �θ𺯼��ȿ� ����ִ� �ּҰ��� � �ڽ����� ���� ������ �ּҰ����� �� �� ���� �����̴�. 
		//���࿡ ��������ȯ�� ����� �ٸ� �ڽ��� �ּҰ��� �����ϰ��� �ϸ� classcastexception�� �߻���
		//HankukTire newTire =(HankukTire)car.tire; //��Ÿ�� ���� �߻� 
		
		
		//��ü�� ���� ���� �ּҸ� �� ������ 
		if( car.tire instanceof HankukTire ) {
			System.out.println("�ѱ�Ÿ�̾ �½��ϴ�");
		}
		
		if( car.tire instanceof KumhoTire ) {
			System.out.println("��ȣŸ�̾ �½��ϴ�");
		}
		
		
		
		
	}

}
