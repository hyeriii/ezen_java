package ch06;
import java.util.Scanner;

//210714 6장 확인문제 20번 - 오혜민쌤 풀이

public class BankApplication {


	private static Account_1[] accountArray = new Account_1[100];
	private static Scanner scanner = new Scanner(System.in); 
	static int num = 0;
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.계좌생성 |2. 계좌목록|3. 예금|4.출금|5.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}
			/*else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
			*/	
		}
		
		System.out.println("프로그램 종료 ");
		
	}
	
	//계좌생성하기
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		
		Account_1 account = new Account_1("", "", 0);
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		account.setAno(ano);
		
		System.out.print("계좌주 : ");
		String owner = scanner.next();
		account.setOwner(owner);
		
		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();
		account.setBalance(balance);
		
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
		
		//생성된 정보를 배열에 넣기, 이해안감 
		accountArray[num] = new Account_1(ano, owner, balance);			
		
		num++;
		
		
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		
		for(int i =0; i<num;i++) {
			System.out.println(accountArray[i].getAno() +"      "
								+accountArray[i].getOwner()+ "      "
								+accountArray[i].getBalance());
			
		}
		
		

		
	}
/*	
	//예금하기
	private static void deposit() {
	
		//예금처리 -findAccount()사용
		//1. 계좌번호 받아오기
		//2.예금액을 입력받아오기
		//3. 입력받은 계좌번호와 일치하는 accountArray의 원소 계좌 찾기
		//4.찾은 계좌를 이용하여 입력받은 예금맥을 기존 예금액으로 더한다. 
		
	}
	
	//출금하기
	private static void withdraw() {
		
	}

	//Acount 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		int num2= 0 ;
		while(num2){
			if(ano.equals(accountArray[num].getAno())) {
				
			}
		}
		

	}
*/	
	
	}


