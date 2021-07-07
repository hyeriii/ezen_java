package ch04;

import java.util.Scanner;

public class Ch07_1 {

	public static void main(String[] args) throws Exception {
		
		
		boolean run = true; 
		
		int balance =0;
				
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택>");
					
			int m = scanner.nextInt(); 
		
					if( m == 1) {
						
						System.out.print("예금액>");
						balance += scanner.nextInt();
						
		
					}else if(m == 2) {
						
						System.out.print("출금>");
						balance -= scanner.nextInt();
						
					}else if(m == 3) {
						
						System.out.print("잔고>");
						System.out.println(balance);
						
					}else if(m == 4) {
						
						run = false;
						
					}
					
					
					
				}
		System.out.println("프로그램 종료");
				
		
		
		}
				
	}


