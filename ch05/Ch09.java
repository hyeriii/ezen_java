package ch05;

import java.util.Scanner;

public class Ch09 {

	public static void main(String[] args) {
		//210708
		//5�� Ȯ�ι��� 9��
		
		boolean run = true;
		int studentNum = 0;
		int[] score = null;
		Scanner scanner = new Scanner(System.in);

		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("------------------------------------------");
			System.out.print("����>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				System.out.print("�л���>");
				studentNum += scanner.nextInt();
				
			}else if(selectNo == 2) {
				
				for(int i =0 ;i<studentNum;i++ ) {
				
					System.out.print("score" +"["+i+"]"+ ">");
					score= new int[] {		};
					
					//+= scanner.nextInt();
					
					
				}
				
				
			}else if(selectNo == 3) {
				
			}else if(selectNo == 4) {
				
			}else if(selectNo == 5) {
				run = false;
			}
			
		}
		
		System.out.println("���α׷� ����");
		
		
		
		
		
		
		
	}

}
