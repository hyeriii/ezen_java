package ch08;

public class HomeMain {

	public static void main(String[] args) {
		//�������̽��� �ʵ�� ������ Ÿ������ �δ� ���
		//�ش� �ʵ忡 �پ��� ������ü�� ���ü� �����Ƿ� �Ȱ��� Ÿ������ ȣ�������� �پ��� ����� ���� ������ ������ ���� 

		Home home = new Home();
		home.remote = new Tv();
		home.turnOn();
		
		home.remote = new Radio();
		home.turnOn();
	
		
		//**********************
		//����� �̿��� ������ 
		//**********************
		
		//-Ȯ���� ���� 
		//�ڵ��� ����
		//�̿ϼ��� �θ� �̿��Ͽ� �ϼ��� �ڽ��� ���鶧 ���
		//�ڵ带 �����ϱ� ������ ���� ���� ���� 
		
		
		//**********************
		//�������̽��� �̿��� ������
		//**********************
		
		//����ȭ���ִ� ������ ���鶧 ���
		//���� �����ڵ� ���� ������ �� �� ����ȭ �Ǿ��ִ� �޼ҵ带 �����Ͽ� 
		//���������� �����ϰ� �ϱ����Ͽ� ��� 
	}
	

}