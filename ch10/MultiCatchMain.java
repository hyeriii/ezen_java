package ch10;

import java.util.Scanner;

public class MultiCatchMain {

	public static void main(String[] args) {
		//��Ƽ catchó�� - �پ��� ���ܿ� ���Ͽ� ���� ���๮�� �ۼ��ϴ� ���
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		String[] strs = new String[1];
			try {
			System.out.println("����1  > ");
			String num1Str = scanner.next();
			System.out.println("����2  > ");
			String num2Str = scanner.next();
			
			//���� �߻� ���ɼ��� ���� NumberFormatException
			sum += (Integer.parseInt(num1Str) + Integer.parseInt(num2Str));
			
			strs[0] = num1Str;
			strs[1] = num2Str; //���� �߻� ArrayIndexOfBoundsException
			}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
				System.out.println("���� �߻�");
			}

		
		
		
		
		
		
		
		
		
		
	}

}
