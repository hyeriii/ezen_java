package ch04;
import java.util.Scanner;

public class Ch07 {

	public static void main(String[] args) {
	//210707
	//134p Ȯ�ι���7��
				
	boolean run = true; 
				
	int balance =0;
				
	Scanner scanner = new Scanner(System.in);
		
	while(run) {
	System.out.println("-----------------------------");
	System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
	System.out.println("-----------------------------");
	System.out.print("����>");
					
	String text = scanner.next(); 
	//String text = scanner.nextLine(); 
		
	if(text.equals("1")) {
						
		System.out.print("���ݾ�>");
		balance += scanner.nextInt();
		//scanner.nextLine();
	}else if(text.equals("2")) {
						
		System.out.print("���>");
		balance -= scanner.nextInt();
		//scanner.nextLine();
	}else if(text.equals("3")) {
						
		System.out.print("�ܰ�>");
		System.out.println(balance);
	}else if(text.equals("4")) {
						
		run = false;
						
	}
					
	 }
		System.out.println("���α׷� ����");
				
		
	}

}
