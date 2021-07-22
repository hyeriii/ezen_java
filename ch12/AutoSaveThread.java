package ch12;

public class AutoSaveThread extends Thread {

	public void save() {
		System.out.println("�۾�����������");
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
				System.out.println("���� �����尡 �½��ϴ� -> " + getThreadGroup().getName());
															//Thread.currentThread().getThreadGroup().getName()
			}
			save();
		}
		
	}
	
	
	
	
	
}
