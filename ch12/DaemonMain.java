package ch12;

public class DaemonMain {

	public static void main(String[] args) {

		AutoSaveThread auto = new AutoSaveThread();
		
		auto.setDaemon(true);
		
		auto.start();

		
	
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 종료"); 
		
		ThreadGroup group = Thread.currentThread().getThreadGroup();
		System.out.println("main 스레드 그룹 : "+group.getName());
		
		//********************
		//currentThread() - 현재실행중인 스레드 반환하는 메소드
		//********************
		
		
	}

}
