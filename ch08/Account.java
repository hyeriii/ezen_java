package ch08;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		//은행 프로그램 만들기(계좌번호는 랜덤한 5자리 숫자로 만들어주세요, 배열이용
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		String  acountarray[] = new String[100];
		String sAccount ="" ;
		int balance = 0;
		
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
					for(int i = 0 ;i<5;i++) {
		
						int account = (int)(Math.random()*8)+1;
						sAccount +=  Integer.toString(account);
						acountarray[i] = sAccount;
					}
					System.out.println("계죄번호는 " + sAccount +"생성되었습니다.");	
					
				}else if(yn.equals("n")) {
					System.out.print("신규계좌개설을 취소하셨습니다.");
				}
			}else if(num.equals("2")) {
				System.out.print("입금하시겠습니까? 예:y,아니오:n");
				System.out.print("입력 > ");
				String yn2 = sc.next();	
				if(yn2.equals("y")) {
					System.out.print("계좌번호 입력 > ");
					String accountinput = sc.next();
						
					for(int i =0 ; i<acountarray.length ; i++) {
						if(acountarray[i].equals(accountinput)) {
							System.out.print("입금액> ");
							balance += sc.nextInt();
							System.out.println("입금되었습니다. "+acountarray[i]+"계좌의 현재 잔액은 "+balance+"원입니다.");
						}
					}
					
				}else if(yn2.equals("n")) {
					System.out.print("입금을 취소하셨습니다.");		
				}	
			}else if(num.equals("3")) {
				System.out.print("출금하시겠습니까? 예:y,아니오:n");
				System.out.print("입력 > ");
				String yn2 = sc.next();
				
				if(yn2.equals("y")) {
					System.out.print("계좌번호 입력 > ");
					String accountinput = sc.next();
					
					if(accountinput.equals(sAccount)) {
						System.out.print("입금액> ");
						balance -= sc.nextInt();
						System.out.println("출금되었습니다. "+sAccount+"계좌의 현재 잔액은 "+balance+"원입니다.");
					}
				}else if(yn2.equals("n")) {
					System.out.print("출금을 취소하셨습니다.");		
			}
			}else if(num.equals("4")) {
				System.out.print("잔액확인하시겠습니까? 예:y,아니오:n");
				System.out.print("입력 > ");
				String yn2 = sc.next();
			
				if(yn2.equals("y")) {
					System.out.print("계좌번호 입력 > ");
					String accountinput = sc.next();

					if(accountinput.equals(sAccount)) {
					
					System.out.println("현재"+sAccount+"계좌의 잔액은 "+balance+"원입니다.");
					}
				}else if(yn2.equals("n")) {
					System.out.print("잔액 조회를 취소하셨습니다.");		
					}
				}
				
				
				
				
				
			}
			
		}
	}

		
		


