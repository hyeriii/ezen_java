package ch06;

public class MethodSample {
	
	//210712
	//�޼ҵ� �����ε� ����

	public void m1() {
		System.out.println("void m1() ȣ��");
	}
	
	//�޼ҵ� �̸��� �Ű����� ������ �����ϸ� ����Ÿ���� �޶� �޼ҵ� �����ε� �Ұ���
/*	public int m1() {
		System.out.println("void m1() ȣ��");

	}
*/	
	
	
	//m1 �޼ҵ� �̸� ����, �Ű������� ������ �ٸ��Ƿ� �����ε� ������ 
	public void m1(int arg) {
		System.out.println("void m1(int arg) ȣ��");
	}
	
	public int m1(String arg) {
		System.out.println("void m1(String arg) ȣ��");
		//arg ���ڿ��� ���������� ����
		return Integer.parseInt(arg);
	}
	
	
	public void m1(String arg1, int arg2) {
		System.out.println("void m1(String arg1, int arg2) ȣ��");
	}
	
	//Ÿ���� ������ �ٸ� -> �����ε� ������
	public void m1(int arg2, String arg1) {
		System.out.println("void m1(int arg2, String arg1) ȣ��");
	}
	
	
	
}
