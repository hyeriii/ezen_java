package ch08;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		//���� ���α׷� �����(���¹�ȣ�� ������ 5�ڸ� ���ڷ� ������ּ���, �迭�̿�
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		String  acountarray[] = new String[100];
		String sAccount ="" ;
		int balance = 0;
		
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
					for(int i = 0 ;i<5;i++) {
		
						int account = (int)(Math.random()*8)+1;
						sAccount +=  Integer.toString(account);
						acountarray[i] = sAccount;
					}
					System.out.println("���˹�ȣ�� " + sAccount +"�����Ǿ����ϴ�.");	
					
				}else if(yn.equals("n")) {
					System.out.print("�ű԰��°����� ����ϼ̽��ϴ�.");
				}
			}else if(num.equals("2")) {
				System.out.print("�Ա��Ͻðڽ��ϱ�? ��:y,�ƴϿ�:n");
				System.out.print("�Է� > ");
				String yn2 = sc.next();	
				if(yn2.equals("y")) {
					System.out.print("���¹�ȣ �Է� > ");
					String accountinput = sc.next();
						
					for(int i =0 ; i<acountarray.length ; i++) {
						if(acountarray[i].equals(accountinput)) {
							System.out.print("�Աݾ�> ");
							balance += sc.nextInt();
							System.out.println("�ԱݵǾ����ϴ�. "+acountarray[i]+"������ ���� �ܾ��� "+balance+"���Դϴ�.");
						}
					}
					
				}else if(yn2.equals("n")) {
					System.out.print("�Ա��� ����ϼ̽��ϴ�.");		
				}	
			}else if(num.equals("3")) {
				System.out.print("����Ͻðڽ��ϱ�? ��:y,�ƴϿ�:n");
				System.out.print("�Է� > ");
				String yn2 = sc.next();
				
				if(yn2.equals("y")) {
					System.out.print("���¹�ȣ �Է� > ");
					String accountinput = sc.next();
					
					if(accountinput.equals(sAccount)) {
						System.out.print("�Աݾ�> ");
						balance -= sc.nextInt();
						System.out.println("��ݵǾ����ϴ�. "+sAccount+"������ ���� �ܾ��� "+balance+"���Դϴ�.");
					}
				}else if(yn2.equals("n")) {
					System.out.print("����� ����ϼ̽��ϴ�.");		
			}
			}else if(num.equals("4")) {
				System.out.print("�ܾ�Ȯ���Ͻðڽ��ϱ�? ��:y,�ƴϿ�:n");
				System.out.print("�Է� > ");
				String yn2 = sc.next();
			
				if(yn2.equals("y")) {
					System.out.print("���¹�ȣ �Է� > ");
					String accountinput = sc.next();

					if(accountinput.equals(sAccount)) {
					
					System.out.println("����"+sAccount+"������ �ܾ��� "+balance+"���Դϴ�.");
					}
				}else if(yn2.equals("n")) {
					System.out.print("�ܾ� ��ȸ�� ����ϼ̽��ϴ�.");		
					}
				}
				
				
				
				
				
			}
			
		}
	}

		
		


