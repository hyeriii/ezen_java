package mission;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		//1���� �迭 �̿� 
		
		//[�Է� ȭ��]
		//���� 10�� ���ʴ�� �Է�, �������� ����  
		//��°�ٿ� k�� �Է� 
		
		//[��� ȭ��]
		//k��° ���ڰ� �������� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		String strNum;
		int inputK = 0;
		
		// 10�� �Է¹޾Ƽ� strNum�� ����  
		//next() ���� �������� ���� nextLine() ��� 
		strNum = sc.nextLine(); 
		
		System.out.println("input num : "+strNum);
		
		inputK = sc.nextInt(); // ����ϰ��� �ϴ� k��° �Է� 
		String[] num = strNum.split(" ");// ���� ���� 

		int[] numArray = new int[num.length];
		
		for(int i =0 ; i<num.length;i++) {
			try {
				numArray[i] = Integer.parseInt(num[i]); // int �� ��ȯ 				
			}catch(Exception e) {
				//int������ ��ȯ�� �� ���� ��츦 ���� ����ó�� 
				System.out.println("unable to pare string to int");
				e.printStackTrace();
			}
		}
		
		for(int i= 0; i<numArray.length; i++) {
			if(i == inputK-1) {
				System.out.println((i+1)+"��° ���ڴ� " + num[i]);
				break;
			}
		}
		
		
		

	}

}
