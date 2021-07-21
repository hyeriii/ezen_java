package ch12;

public class JoinMain {

	public static void main(String[] args) {
		
		//*********************************
		//join() 호출된 스레드의 실행이 종료될때까지 호출한 스레드에서 일시정지 상태로 기다리는 메소드
		//주로 통계 작업을 할 떄 많이 사용됨
		//*********************************
		JoinThread join = new JoinThread();
		join.start();
		try{
			join.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
		for(int i =0 ; i< 100; i++) {
			System.out.println("main"+i);
		}
		System.out.println("main 종료");
	}

}
