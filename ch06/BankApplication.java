package ch06;
import java.util.Scanner;


public class BankApplication {


	private static Account_1[] accountArray = new Account_1[100];
	private static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.���»��� |2. ���¸��|3. ����|4.���|5.����");
			System.out.println("-------------------------------------------------");
			System.out.print("���� > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				
			}else if(selectNo == 3) {
				
			}else if(selectNo == 4) {
				
			}else if(selectNo == 5) {
				run = false;
			}
				
		}
		
		System.out.println("���α׷� ���� ");
		
	}
	
	private static void createAccount() {
		
	}

}
