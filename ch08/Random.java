package ch08;

public class Random {

	public static void main(String[] args) {
		//  �����Լ��� Ȱ���Ͽ� ��ǻ�Ϳ� 3�� 2������ ���������� ����
	
		//1 ���� 2 �� 3 ����

		int num = 0 ;
		
		for(int i = 1 ; i<4; i++ ) {
			
			System.out.println(i+"��° ��� !!");
			
			int computer = (int)( (Math.random()*2)+1) ; 
			int me = (int)( (Math.random()*2)+1) ; 
			
			if(computer == 1) {
				
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				
				if(me == 2) {
					System.out.println("���� ���� �½��ϴ�.");
				}else if(me == 3) {
					System.out.println("���� ������ �½��ϴ�.");
					num++;
				}else if(me == 1) {
					System.out.println("���� ������ �½��ϴ�.");
					
				}
			}else if(computer == 2) {
				
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
				
				if(me == 1) {
					System.out.println("���� ������ �½��ϴ�.");
					num++;
				}else if(me == 3) {
					System.out.println("���� ������ �½��ϴ�.");
				}else if(me == 2) {
					System.out.println("���� ���� �½��ϴ�.");
				}
			}else if(computer == 3) {
				
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				
				if(me == 1) {
					System.out.println("���� ������ �½��ϴ�.");
				}else if(me == 2) {
					System.out.println("���� ���� �½��ϴ�.");
					num++;
				}else if(me == 3) {
					System.out.println("���� ������ �½��ϴ�.");
			
				}
			}
			

		}
		
		if(num >= 2) {
			System.out.println("��� ��� : 3�� �� "+ num +"�̰����Ƿ� �̰���ϴ�.");
		}else {
			System.out.println("��� ��� : 3�� �� "+ num +"�̰����Ƿ� �����ϴ�.");
		}
		
		
		
		}

}
