package ch07;

public class Main {

	public static void main(String[] args) {

		Tv tv = new Tv();
		tv.turnOn();
		
		Radio radio = new Radio();
		radio.turnOn();
		
		Home home = new Home();
		
		//��ӿ��� �ʵ��� ������
		//�ʵ��� Ÿ���� �θ� �ǹǷ� �ش� �ʵ忡 ������ ������ ���Խ���
		//���� �θ� Ÿ�������� � �ڽ��� ���ԵǴ��Ŀ� ���� �ٸ� ����� �����ϰ� �Ǵ°� ! 
		
		//�θ�  Machinedp �ڽ� tv�� ���� 
		home.machine = new Tv();
		
		home.machine.turnOn();

		
		//�θ�  Machinedp �ڽ� redio�� ����
		home.machine = new Radio();
		
		home.machine.turnOn();
		
		
		//��ӿ��� �Ű����� ������
		//�޼ҵ��� �Ű������� �θ�Ÿ������ �����ϹǷν� ���� ���ڰ�����
		//�پ��� �ڽ� ��ü�� ���ԵǾ �Ȱ��� �޼ҵ� ȣ�������� ��� 
		//�ڽ��� ���ԵǴ��Ŀ� ���� �پ��� ����� �����س��� ��
		Machine machine = new Machine();
		
		System.out.println("*******************************************************");
		
		home.turnOn(machine);
		
		home.turnOn(tv);
		home.turnOn(radio);
	}

}
