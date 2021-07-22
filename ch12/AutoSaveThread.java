package ch12;

public class AutoSaveThread extends Thread {

	public void save() {
		System.out.println("작업내용저장함");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			if(isDaemon()) {// Thread.currentThread().isDaemon()
				System.out.println("데몬 스레드가 맞습니다 -> " + getThreadGroup().getName());
															//Thread.currentThread().getThreadGroup().getName()
			}
			save();
		}
		
	}
	
	
	
	
	
}
