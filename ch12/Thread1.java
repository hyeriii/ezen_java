package ch12;

public class Thread1 implements Runnable {

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
		
	}
	
	
	

}
