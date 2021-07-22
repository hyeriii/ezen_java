package ch12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolMain {

	public static void main(String[] args) {
		// ������Ǯ - �������� ������ ������ ���� ���Ͽ� ���ѵ� ������ ������ �����ϸ� �����۾��� ó���ϴ� ����
		
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		for(int i = 0 ; i< 10 ; i++) {//10�� �۾��� �۾�ť�� �Ҵ�
		
			//Runnable �������̽��� �̿��ؾ����� ������ Ǯ�� �۾��� ������ �� ����
			//�������̽��� run�޼ҵ��� ������� �۾� ť�� ���Ե� �۾��� �ȴ�. 
			Runnable runnable = new Runnable() {
			
			@Override 
			public void run() {
				
				//ThreadPoolExecutor �� ExecutorService�� �θ�
				ThreadPoolExecutor tpe = (ThreadPoolExecutor)es;
				
				int poolsize = tpe.getPoolSize(); //������ Ǯ�� �����ǰ��ִ� ������ ���� ����
				String threadName = Thread.currentThread().getName();
				
				System.out.println("�� ������ ���� : "+poolsize+", ������ �̸�" + threadName);
				
				int value = Integer.parseInt("��");
			}		
		};
			
		es.execute(runnable); // ������ Ǯ�� �۾��� �־��ִ� ���� 
		
	   }
		
		es.shutdown(); // ������ ����� �� ������ Ǯ ���� ���� 
		

	}

}
