package ch12;

public class Calculator {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//****************************************************
	//synchronized 키워드 - 메소드 동기화 
	//                  - 동기화 효과는 동시성을 띄는 스레드의 경우 해당 메소드를 다 실행할 때 까지 다른 스레드에게 run의 기회를 넘겨주지 않는다.
	//synchronized{} - 해당 블럭을 실행하는 동안 동시성을 띄는 다른 메소드에게 run 실행 기회를 넘겨주지 않는다. 
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
		System.out.println("ThreadA의 method() 실행");
		notify(); // wati되어있는 thread을 실행 대기 상태로 돌리는 메소드
		try {
		wait(); //현재 실행되고 있는 스레드 일시 정리 상태로 만듬 
		}catch(InterruptedException e) {
			
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 method() 실행");
		notify();
		try {
			wait();
			}catch(InterruptedException e) {
				
			}
	}
	
	
	
	
	
	
	
	
	
	
}
