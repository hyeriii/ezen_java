package ch08;

public class Random {

	public static void main(String[] args) {
		//  랜덤함수를 활용하여 컴퓨터와 3판 2선승제 가위바위보 게임
	
		//1 가위 2 보 3 바위

		int num = 0 ;
		
		for(int i = 1 ; i<4; i++ ) {
			
			System.out.println(i+"번째 대결 !!");
			
			int computer = (int)( (Math.random()*2)+1) ; 
			int me = (int)( (Math.random()*2)+1) ; 
			
			if(computer == 1) {
				
				System.out.println("컴퓨터는 가위를 냈습니다.");
				
				if(me == 2) {
					System.out.println("나는 보를 냈습니다.");
				}else if(me == 3) {
					System.out.println("나는 바위를 냈습니다.");
					num++;
				}else if(me == 1) {
					System.out.println("나는 가위를 냈습니다.");
					
				}
			}else if(computer == 2) {
				
				System.out.println("컴퓨터는 보를 냈습니다.");
				
				if(me == 1) {
					System.out.println("나는 가위를 냈습니다.");
					num++;
				}else if(me == 3) {
					System.out.println("나는 바위를 냈습니다.");
				}else if(me == 2) {
					System.out.println("나는 보를 냈습니다.");
				}
			}else if(computer == 3) {
				
				System.out.println("컴퓨터는 바위를 냈습니다.");
				
				if(me == 1) {
					System.out.println("나는 가위를 냈습니다.");
				}else if(me == 2) {
					System.out.println("나는 보를 냈습니다.");
					num++;
				}else if(me == 3) {
					System.out.println("나는 바위를 냈습니다.");
			
				}
			}
			

		}
		
		if(num >= 2) {
			System.out.println("대결 결과 : 3판 중 "+ num +"이겼으므로 이겼습니다.");
		}else {
			System.out.println("대결 결과 : 3판 중 "+ num +"이겼으므로 졌습니다.");
		}
		
		
		
		}

}
