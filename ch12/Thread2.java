package ch12;

public class Thread2 extends Thread {

	Thread2(){
		setName("Thread222");
	}
	
	
	@Override 
	public void run() {
		for(int i = 0 ; i < 5; i++) {
			System.out.println("��");
			try{
				// ���� �ڵ尡 ����ǰ� �ִ� �����带 1�ʵ��� ���ڴ�.
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
	}
	
	
	
	
	
}
