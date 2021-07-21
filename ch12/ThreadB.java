package ch12;

public class ThreadB extends Thread {

	public boolean stop = false;
	public boolean work = true;
	
	@Override 
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreasB ÀÛ¾÷Áß");
			}else {
				Thread.yield();
			}
		}
	}
	
}
