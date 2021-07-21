package ch12;

public class ThreadPriority2 extends Thread {

	ThreadPriority2(){
		setName("ThreadPriority2");
	}
	
	
	@Override 
	public void run() {
		for(int i= 0 ; i< 20000000; i++) {
			
		}
		System.out.println(getName());
	}
	
	
}
