package ch04;
import java.util.Scanner; // scanner 

public class Ex05 {

	public static void main(String[] args) {
		//210707
		//while��
		
		int i = 1 ;
		while(i<=10) {
			System.out.println(i);
			++i;
			//System.out.println("����������:"+i);
			
		}
		
		i = 1;
		while(true) {
			if(i>5) {
				System.out.println("if���� "+i);
				break;
			}
			i++;
		}
		
		
		System.out.println("===========================================");
		//����ڰ�q�� �Է��� ������ ����ϴ� sys ����
		
		//����ڿ��� �Է� �ޱ�-import �ʿ� 
		Scanner scanner = new Scanner(System.in);
		
		//String text = scanner.nextLine(); // �ܼ�ȭ�鿡 ����ڰ� �Է��� ���� text ������ �Ҵ�		
		
		//System.out.println(text);
		
		boolean flag = true;
		while(flag){
			System.out.println("�޽����� �Է��� �� �ֽ��ϴ�.");
			System.out.println("�Է�->");
			
			String text = scanner.nextLine(); // �ܼ�ȭ�鿡 ����ڰ� �Է��� ���� text ������ �Ҵ�		
			//scanner�� ���� �Է��Ҷ� ���� ���
			
			if(text.equals("q")) {
				flag = false;
				System.out.println("done");
			}else System.out.println(text);	
		}
		
		
		
		//do-while��
		
		System.out.println("=====================do-while��======================");
		
		flag = false;
		while(flag) {
			System.out.println("������ �����̸� �ѹ��� �������� ����");
		}
		
		do {
			System.out.println("������ �����̶� �ѹ��� �����");
		}while(flag);
		
		
		
		
		
		
		
		
		
		
	}

}
