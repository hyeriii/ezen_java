package ch10;

import java.util.Scanner;

public class MultiException {

	public static void main(String[] args) {
		//���� catch ó��
		int[] a =new int[10];
		Scanner scanner = new Scanner(System.in);
		int i =0;
		
		while(true) {
			if(i == 11) {
				break;
			}
			System.out.println("���� �Է��ϼ���");
			String str = scanner.next();
			int num = Integer.parseInt(str);
			
			a[i] = num;
			i++;
			
		}
		for(int temp : a) {
			System.out.println(temp);
		}
		

	}

}
