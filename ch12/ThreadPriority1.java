package ch12;

public class ThreadPriority1 extends Thread {

	ThreadPriority1(){
		setName("ThreadPriority1");
	}
	
	
	@Override 
	public void run() {
		for(int i= 0 ; i< 20000000; i++) {
			
		}
		System.out.println(getName());
	}
	
	
}
