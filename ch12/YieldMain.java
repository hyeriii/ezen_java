package ch12;

public class YieldMain {
	public static void main(String[] args) {
		
		//yield() - 실행의 기회를 얻은 스레드가 다름 스레드에게  기회를 양도하는 메소드
		
		ThreadA tA = new ThreadA();
		ThreadB tB = new ThreadB();
		
		tA.start();
		tB.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		tA.work = false;
	}

}


