package ch08;

public class InterfaceMain {

	public static void main(String[] args) {
		//���߼ҽ��� �������̽��� ���� ��ü���� ��ȣ�ۿ뿡 ���Ͽ�
		Tv tv = new Tv();//������ü ����
		RemoteControl remotecon = tv;//�������̽� Ÿ�Ժ����� ������ü ����
		//����ȭ�Ǿ��ִ� �޼ҵ� ȣ�� 
		remotecon.trunOn();
		remotecon.trunOff();
		remotecon.setVolume(5);
		
		Radio rd = new Radio();
		remotecon = rd;
		
		remotecon.trunOn();
		remotecon.trunOff();
		remotecon.setVolume(5);
		
		
		//�������̽� ������� :
		//���߼ҽ��� ��ü�� �и������� �����ڴ� ȣ���ϸ� �Ǵ� �޼ҵ��� ����Ʈ�� �˰� ���� �������� 
		//�������̽��� ���ԵǾ� �ִ� ��ü�� ���� �޶����Ƿ� ���������� ��ü�� ��ǰȭ �� ������ ������ ������ 
		
		
		//********************************
		//�͸� ���� ��ü ���� ���
		//�͸� ���� ��ü? Ŭ������ �������� �ʴ� 1ȸ���� ��ġ�� ��ü�ǹ�
		remotecon = new RemoteControl() {
			//�͸��� ������ü������ �������̽��� ������ �߻�޼ҵ带 ��� �����ؾ���
			//�ʵ�, �޼ҵ� �߰��� ���� ���� ������
			//��,�͸��� ��ü�� Ŭ������ ���� ��, Ÿ���� ���⶧���� �������̽� �ۿ��� ����� �Ұ���
			//�ش� ��� �������� ����� �����ϴ�
			public String field;
			
			public void method() {
				
			}
			@Override 
			public void trunOn() {
				System.out.println("�̸� ���� ��ġ�� �մϴ�.");
			}
			@Override 
			public void trunOff() {
				System.out.println("�̸� ���� ��ġ�� ���ϴ�.");
			}
			@Override 
			public void setVolume(int volume) {
				if(volume > RemoteControl.MIN_VOLUME
						&& volume < RemoteControl.MAX_VOLUME) {
					System.out.println(volume+"���� �����մϴ�.");
				}
			}
		};
		
		remotecon.trunOn();
		
		//�����������̽� ������ü�� ���� �������̽��� ���� �� �� ������
		//�̶� �ڽ��� ���ԵǾ��ִ� �������̽��� �߻� �޼ҵ常 ����� ������ 
		
		Interface in = rd;
		in.interfaceM1();
		in.interfaceM2();

		
		//****************************************************
		//����Ʈ  �޼ҵ� ���
		//������ü���� ������ ���� �����̹Ƿ� �ݵ�� �������̽��� Ÿ�Ժ����� ��ü�� ��� ���� ��� ���� 
		remotecon.setMute(true);
		
		remotecon =rd;
		remotecon.setMute(true);
		
		remotecon =tv;
		remotecon.setMute(true);
		
		
		//****************************************************
		//���� �޼ҵ� ���
		//�������̽��� ������ �����̹Ƿ� �������̽��� ���ؼ� �����Ѵ�. 
		RemoteControl.changeBattery();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
