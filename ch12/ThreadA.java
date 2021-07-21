package ch12;

public class ThreadA extends Thread {

	public boolean stop = false;
	public boolean work = true;
	
	@Override 
	public void run() {
	
		while(!stop) {
			if(work) {
				System.out.println("ThreasA ÀÛ¾÷Áß");
			}else {
				Thread.yield();
			}
		}
		
	}
	
	
}
