package ch12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolMain {

	public static void main(String[] args) {
		// 스레드풀 - 무한적인 스레드 폭증을 막기 위하여 제한된 스레드 개수를 유지하며 병렬작업을 처리하는 수단
		
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		for(int i = 0 ; i< 10 ; i++) {//10개 작업을 작업큐에 할당
		
			//Runnable 인터페이스를 이용해야지만 스레드 풀의 작업을 생성할 수 있음
			//인퍼테이스의 run메소드의 실행블럭이 작업 큐에 대입될 작업이 된다. 
			Runnable runnable = new Runnable() {
			
			@Override 
			public void run() {
				
				//ThreadPoolExecutor 는 ExecutorService의 부모
				ThreadPoolExecutor tpe = (ThreadPoolExecutor)es;
				
				int poolsize = tpe.getPoolSize(); //스레드 풀에 유지되고있는 스래드 갯수 얻어옴
				String threadName = Thread.currentThread().getName();
				
				System.out.println("촐 스래드 갯수 : "+poolsize+", 스래드 이름" + threadName);
				
				int value = Integer.parseInt("삼");
			}		
		};
			
		es.execute(runnable); // 스레드 풀에 작업을 넣어주는 과정 
		
	   }
		
		es.shutdown(); // 메인이 종료된 후 스레드 풀 강제 종료 
		

	}

}
