package ch08;

import java.util.Scanner;

public class SumMain {

	public static void main(String[] args) {
		//�� ���� �Է¹޾� �� ���� �� �� ���ϱ�

		int sum = 0;
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �Է� >");
		a = sc.nextInt();
		
		System.out.print("���� �� �Է� >");
		b = sc.nextInt();
		
		int i = 0;
		for(i=a ;i<=b;i++) {
			sum +=i;
		}
		
		
		System.out.print(a + "���� "+b+"������ ���� "+sum +"�Դϴ�.");
		
		
		
		
		
		
		
	}

}
