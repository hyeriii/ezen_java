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
			System.out.println("1.�ű԰��°��� | 2.�Ա� | 3.��� | 4.�ܾ� | 5.�������� | 6.����");
			System.out.println("---------------------------------------------------");
			System.out.print("���� >");
			
			String num = sc.next();
			
			if(num.equals("1")) {
				
				System.out.print("�ű԰��¸� �����Ͻðڽ��ϱ�? ��:y,�ƴϿ�:n");
				String yn = sc.next();
		
				if(yn.equals("y")) {
					strAno = "";
					for(int i = 0 ; i<5 ; i++) {
						int ano = (int)(Math.random()*8)+1;
						
						strAno +=  Integer.toString(ano);
						if(i == 4) {
							account[i] = new Account(strAno,0);
							System.out.println("���¹�ȣ"+ account[i].getAno() +"�����Ǿ����ϴ�.");
						}
					}

				}else if(yn.equals("n")) {
				System.out.print("�ű԰��°����� ����Ͽ����ϴ�. ");
				}
				}else if(num.equals("2")) {

				System.out.print("�Ա��Ͻðڽ��ϱ�? ��:y,�ƴϿ�:n");
				System.out.print("�Է� > ");
				String  yn = sc.next();	
				
				if(yn.equals("y")) {
					System.out.print("���¹�ȣ �Է� > ");
					String ano = sc.next();
					
					System.out.print("�Աݾ� >  ");
					int money = sc.nextInt();
					System.out.print("qw1");
					Account account = findAccount(ano);
					System.out.print("qw");
					if(account != null) {
						account.setBalance(account.getBalance() + money);
						System.out.print("�ԱݵǾ����ϴ�. "+ account.getAno()+"������ ���� �ܾ���"+account.getBalance() +"���Դϴ�.");
					}else if(account == null){
						System.out.println("���� ���¹�ȣ�Դϴ�.");
					}
				}else if(yn.equals("n")){
					System.out.println("�Ա��� ����ϼ̽��ϴ�.");
				}
			}else if(num.equals("3")) {
				System.out.print("����Ͻðڽ��ϱ�? ��:y,�ƴϿ�:n");
				System.out.print("�Է� > ");
				String  yn = sc.next();
				
				if(yn.equals("y")) {
					System.out.print("���¹�ȣ �Է� > ");
					String ano = sc.next();
					
					System.out.print("��ݾ� >  ");
					int money = sc.nextInt();
					
					Account account = findAccount(ano);
					
					if(account != null) {
						account.setBalance(account.getBalance() - money);
						System.out.print("��ݵǾ����ϴ�. "+ account.getAno()+"������ ���� �ܾ���"+account.getBalance() +"���Դϴ�.");
					}else {
						System.out.println("��ġ�ϴ� ���°� �����ϴ�.");
					}

				}else if(yn.equals("n")) {
				System.out.println("����� ����Ͽ����ϴ�.");
				}
			}else if(num.equals("4")) {
				System.out.print("�ܾ�Ȯ���Ͻðڽ��ϱ�? ��:y,�ƴϿ�:n");
				System.out.print("�Է� > ");
				String  yn = sc.next();
				
				if(yn.equals("y")) {
					System.out.print("���¹�ȣ �Է� > ");
					String ano = sc.next();
					
					Account account = findAccount(ano);
					
					if(account != null) {
						System.out.print("����"+account.getAno() +" �� �ܾ���"+account.getBalance()+" ���Դϴ�. ");
					}else {
						System.out.println("��ġ�ϴ� ���°� �����ϴ�.");
					}
				}else if (yn.equals("n")) {
					System.out.println("�ܾ� ��ȸ�� ����Ͽ����ϴ�.");
				}
			}else if(num.equals("5")) {
				System.out.println("�����Ͻðڽ��ϱ�? ��:y,�ƴϿ�:n");
				System.out.print("�Է� > ");
				String  yn = sc.next();
				
				if(yn.equals("y")) {
					System.out.print("���¹�ȣ �Է� > ");
					String ano = sc.next();
					
					Account account = findAccount(ano);
					if(account != null) {
						account.setAno("");
						account.setBalance(0);
						System.out.println("�����Ǿ����ϴ�.");
					}
				}else if (yn.equals("n")) {
					System.out.println("���������� ����ϼ̽��ϴ�.");
				}
			}else if(num.equals("6")) {
				System.out.println("�����Ͻðڽ��ϱ�? ��:y,�ƴϿ�:n");
				System.out.print("�Է� > ");
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
