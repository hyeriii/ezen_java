package ch07;

public abstract class Machine2 {

	public String brand;
	public String model;
	public String no;

	
	//�߻�޼ҵ� ���� - �������̵� ���,�޼ҵ� ������
	//�߻�Ŭ������ �̿��Ͽ� �ܵ���ü�� ������ �� ���⋚���� �߻�Ŭ������ �ν��Ͻ� �޼ҵ� ���� ���ǹ��ϹǷ�
	//����ȭ �Ǿ��ִ� �޼ҵ� ���� �����ϴ� �߻� �޼ҵ带 �����Ѵ�.
	//�߻�޼ҵ�� �������� ���� �޼ҵ� ����θ� �����Ѵ�.
	//�߻�޼ҵ�� ��ӹ޴� ��� �ڽĵ��� �������ִ� ���뵿���̶�� �����̹Ƿ�
	//�ݵ�� ��ӹ޴� �ڽĿ��� ���� �����ǵǾ�� �Ѵ�. 
	public abstract void trunOn();
	public abstract void trunOff();
}
