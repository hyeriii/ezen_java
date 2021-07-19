package mission;

import java.util.Scanner;

public class AccountMain {

	static Account[] account = new Account[5];
	
	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		String strAno = "";
		
		
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.신규계좌개설 | 2.입금 | 3.출금 | 4.잔액 | 5.계좌해지 | 6.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택 >");
			
			String num = sc.next();
			
			if(num.equals("1")) {
				
				System.out.print("신규계좌를 개설하시겠습니까? 예:y,아니오:n");
				String yn = sc.next();
		
				if(yn.equals("y")) {
					strAno = "";
					for(int i = 0 ; i<5 ; i++) {
						int ano = (int)(Math.random()*8)+1;
						
						strAno +=  Integer.toString(ano);
						if(i == 4) {
							account[i] = new Account(strAno,0);
							System.out.println("계좌번호"+ account[i].getAno() +"생성되었습니다.");
						}
					}

				}else if(yn.equals("n")) {
				System.out.print("신규계좌개설을 취소하였습니다. ");
				}
				}else if(num.equals("2")) {

				System.out.print("입금하시겠습니까? 예:y,아니오:n");
				System.out.print("입력 > ");
				String  yn = sc.next();	
				
				if(yn.equals("y")) {
					System.out.print("계좌번호 입력 > ");
					String ano = sc.next();
					
					System.out.print("입금액 >  ");
					int money = sc.nextInt();
					System.out.print("qw1");
					Account account = findAccount(ano);
					System.out.print("qw");
					if(account != null) {
						account.setBalance(account.getBalance() + money);
						System.out.print("입금되었습니다. "+ account.getAno()+"계좌의 현재 잔액은"+account.getBalance() +"원입니다.");
					}else if(account == null){
						System.out.println("없는 계좌번호입니다.");
					}
				}else if(yn.equals("n")){
					System.out.println("입금을 취소하셨습니다.");
				}
			}else if(num.equals("3")) {
				System.out.print("출금하시겠습니까? 예:y,아니오:n");
				System.out.print("입력 > ");
				String  yn = sc.next();
				
				if(yn.equals("y")) {
					System.out.print("계좌번호 입력 > ");
					String ano = sc.next();
					
					System.out.print("출금액 >  ");
					int money = sc.nextInt();
					
					Account account = findAccount(ano);
					
					if(account != null) {
						account.setBalance(account.getBalance() - money);
						System.out.print("출금되었습니다. "+ account.getAno()+"계좌의 현재 잔액은"+account.getBalance() +"원입니다.");
					}else {
						System.out.println("일치하는 계좌가 없습니다.");
					}

				}else if(yn.equals("n")) {
				System.out.println("출금을 취소하였습니다.");
				}
			}else if(num.equals("4")) {
				System.out.print("잔액확인하시겠습니까? 예:y,아니오:n");
				System.out.print("입력 > ");
				String  yn = sc.next();
				
				if(yn.equals("y")) {
					System.out.print("계좌번호 입력 > ");
					String ano = sc.next();
					
					Account account = findAccount(ano);
					
					if(account != null) {
						System.out.print("현재"+account.getAno() +" 의 잔액은"+account.getBalance()+" 원입니다. ");
					}else {
						System.out.println("일치하는 계좌가 없습니다.");
					}
				}else if (yn.equals("n")) {
					System.out.println("잔액 조회를 취소하였습니다.");
				}
			}else if(num.equals("5")) {
				System.out.println("해지하시겠습니까? 예:y,아니오:n");
				System.out.print("입력 > ");
				String  yn = sc.next();
				
				if(yn.equals("y")) {
					System.out.print("계좌번호 입력 > ");
					String ano = sc.next();
					
					Account account = findAccount(ano);
					if(account != null) {
						account.setAno("");
						account.setBalance(0);
						System.out.println("해지되었습니다.");
					}
				}else if (yn.equals("n")) {
					System.out.println("계좌해지를 취소하셨습니다.");
				}
			}else if(num.equals("6")) {
				System.out.println("종료하시겠습니까? 예:y,아니오:n");
				System.out.print("입력 > ");
				String  yn = sc.next();
				
				if(yn.equals("y")) {
					run = false;
				}else if (yn.equals("n")) {
					run = true;
				}	
			}
			}

	}	

		
		static Account findAccount (String ano) {
			for(int i = 0 ; i<account.length;i++) {
				if(account[i].getAno().equals(ano)) {
					return account[i];
				}
			}
				return null;
			
		}
		
		
	
	

}
