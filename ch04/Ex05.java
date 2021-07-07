package ch04;
import java.util.Scanner; // scanner 

public class Ex05 {

	public static void main(String[] args) {
		//210707
		//while문
		
		int i = 1 ;
		while(i<=10) {
			System.out.println(i);
			++i;
			//System.out.println("후위연산후:"+i);
			
		}
		
		i = 1;
		while(true) {
			if(i>5) {
				System.out.println("if문의 "+i);
				break;
			}
			i++;
		}
		
		
		System.out.println("===========================================");
		//사용자가q를 입력할 때까지 출력하는 sys 구현
		
		//사용자에게 입력 받기-import 필요 
		Scanner scanner = new Scanner(System.in);
		
		//String text = scanner.nextLine(); // 콘솔화면에 사용자가 입력한 값을 text 변수에 할당		
		
		//System.out.println(text);
		
		boolean flag = true;
		while(flag){
			System.out.println("메시지를 입력할 수 있습니다.");
			System.out.println("입력->");
			
			String text = scanner.nextLine(); // 콘솔화면에 사용자가 입력한 값을 text 변수에 할당		
			//scanner는 값을 입력할때 까지 대기
			
			if(text.equals("q")) {
				flag = false;
				System.out.println("done");
			}else System.out.println(text);	
		}
		
		
		
		//do-while문
		
		System.out.println("=====================do-while문======================");
		
		flag = false;
		while(flag) {
			System.out.println("조건이 거짓이면 한번도 실행하지 않음");
		}
		
		do {
			System.out.println("조건이 거짓이라도 한번은 실행됨");
		}while(flag);
		
		
		
		
		
		
		
		
		
		
	}

}
