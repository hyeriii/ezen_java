package ch06;
import java.util.Scanner;

//210714 6�� Ȯ�ι��� 20�� - �����ν� Ǯ��

public class BankApplication {


	private static Account_1[] accountArray = new Account_1[100];
	private static Scanner scanner = new Scanner(System.in); 
	static int num = 0;
	
	public static void main(String[] args) {
		
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
		
		System.out.println("���α׷� ���� ");
		
	}
	
	//���»����ϱ�
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("���»���");
		System.out.println("---------");
		
		Account_1 account = new Account_1("", "", 0);
		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		account.setAno(ano);
		
		System.out.print("������ : ");
		String owner = scanner.next();
		account.setOwner(owner);
		
		System.out.print("�ʱ��Աݾ� : ");
		int balance = scanner.nextInt();
		account.setBalance(balance);
		
		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
		
		
		//������ ������ �迭�� �ֱ�, ���ؾȰ� 
		accountArray[num] = new Account_1(ano, owner, balance);			
		
		num++;
		
		
	}
	
	//���¸�Ϻ���
	private static void accountList() {
		System.out.println("---------");
		System.out.println("���¸��");
		System.out.println("---------");
		
		for(int i =0; i<num;i++) {
			System.out.println(accountArray[i].getAno() +"      "
								+accountArray[i].getOwner()+ "      "
								+accountArray[i].getBalance());
			
		}
		
		

		
	}
/*	
	//�����ϱ�
	private static void deposit() {
	
		//����ó�� -findAccount()���
		//1. ���¹�ȣ �޾ƿ���
		//2.���ݾ��� �Է¹޾ƿ���
		//3. �Է¹��� ���¹�ȣ�� ��ġ�ϴ� accountArray�� ���� ���� ã��
		//4.ã�� ���¸� �̿��Ͽ� �Է¹��� ���ݸ��� ���� ���ݾ����� ���Ѵ�. 
		
	}
	
	//����ϱ�
	private static void withdraw() {
		
	}

	//Acount �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		int num2= 0 ;
		while(num2){
			if(ano.equals(accountArray[num].getAno())) {
				
			}
		}
		

	}
*/	
	
	}


