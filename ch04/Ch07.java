package ch04;
import java.util.Scanner;

public class Ch07 {

	public static void main(String[] args) {
	//210707
	//134p 확인문제7번
				
	boolean run = true; 
				
	int balance =0;
				
	Scanner scanner = new Scanner(System.in);
		
	while(run) {
	System.out.println("-----------------------------");
	System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
	System.out.println("-----------------------------");
	System.out.print("선택>");
					
	String text = scanner.next(); 
	//String text = scanner.nextLine(); 
		
	if(text.equals("1")) {
						
		System.out.print("예금액>");
		balance += scanner.nextInt();
		//scanner.nextLine();
	}else if(text.equals("2")) {
						
		System.out.print("출금>");
		balance -= scanner.nextInt();
		//scanner.nextLine();
	}else if(text.equals("3")) {
						
		System.out.print("잔고>");
		System.out.println(balance);
	}else if(text.equals("4")) {
						
		run = false;
						
	}
					
	 }
		System.out.println("프로그램 종료");
				
		
	}

}
