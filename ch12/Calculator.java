package ch12;

public class Calculator {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//****************************************************
	//synchronized Ű���� - �޼ҵ� ����ȭ 
	//                  - ����ȭ ȿ���� ���ü��� ��� �������� ��� �ش� �޼ҵ带 �� ������ �� ���� �ٸ� �����忡�� run�� ��ȸ�� �Ѱ����� �ʴ´�.
	//synchronized{} - �ش� ���� �����ϴ� ���� ���ü��� ��� �ٸ� �޼ҵ忡�� run ���� ��ȸ�� �Ѱ����� �ʴ´�. 
	//****************************************************
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
		Thread.sleep(2000);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+","+memory);
	}
	
	
	public synchronized void methodA() {
		System.out.println("ThreadA�� method() ����");
		notify(); // wati�Ǿ��ִ� thread�� ���� ��� ���·� ������ �޼ҵ�
		try {
		wait(); //���� ����ǰ� �ִ� ������ �Ͻ� ���� ���·� ���� 
		}catch(InterruptedException e) {
			
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� method() ����");
		notify();
		try {
			wait();
			}catch(InterruptedException e) {
				
			}
	}
	
	
	
	
	
	
	
	
	
	
}
