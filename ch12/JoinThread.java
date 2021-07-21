package ch12;

public class JoinThread extends Thread {


	@Override 
	public void run() {
		
		for(int i =0 ; i<100 ;i++) {
			System.out.println(i);
		}
		System.out.println("jointhread Á¾·á! ");
		
	}
	
	
	
	
}
