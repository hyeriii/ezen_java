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
		
		System.out.println("main ����"); 
		
		ThreadGroup group = Thread.currentThread().getThreadGroup();
		System.out.println("main ������ �׷� : "+group.getName());
		
		//********************
		//currentThread() - ����������� ������ ��ȯ�ϴ� �޼ҵ�
		//********************
		
		
	}

}
