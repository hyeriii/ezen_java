package ch12;

public class PriorityMain {

	public static void main(String[] args) {
		
		Thread thread1 = new ThreadPriority1();
		Thread thread2 = new ThreadPriority2();
		
		
		//priority를 이용하면 동시성을 띄는 스레드의 경우 우선순위를 설정해 줄 수 있으며 높은 수를 가질수록 더
		//많은 실행의 기회를 얻어 먼저 종료될 수 있가
		//하지만 cpu의 각 코어의 스레드 할당은 개발자가 제어할 수 없으므로 우선순위를 주어도 병렬성을 띄는 경우 적용되지 않을 수 있다. 
		thread2.setPriority(10);
		thread1.setPriority(1);
		
		thread1.start();
		thread2.start();
	}

}
