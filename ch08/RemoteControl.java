package ch08;

public interface RemoteControl {
	//����ʵ� -�ش� �������̽� �ڿ� ������ ������� ����� ������
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	//�߻�޼ҵ�-�ش� �������̽� �ڿ� ������ ��ü���� ������ ����ȭ �Ǿ��ִ� �޼ҵ� ���
	public void trunOn();
	public void trunOff();
	public void setVolume(int volume);
	//����Ʈ�޼ҵ� -������������ default�� �ٸ��ǹ�/// �ش� �������̽� �ڿ� ������ ��� ��ü���� ������ �������� ���� 
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���Ұ��Դϴ�");
		}else {
			System.out.println("���Ұ� �����մϴ�");
		}
	}
	//�����޼ҵ� -�ش� �������̽� ��ü�� ������ ���� �ǹ�
	static void changeBattery() {
		System.out.println("���͸��� ��ȯ�մϴ�.");
	}
	
	
}
