package ch10;

import java.util.Scanner;

public class MultiCatchMain {

	public static void main(String[] args) {
		//멀티 catch처리 - 다양한 예외에 대하여 같은 실행문을 작성하는 방법
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		String[] strs = new String[1];
			try {
			System.out.println("숫자1  > ");
			String num1Str = scanner.next();
			System.out.println("숫자2  > ");
			String num2Str = scanner.next();
			
			//예외 발생 가능성이 있음 NumberFormatException
			sum += (Integer.parseInt(num1Str) + Integer.parseInt(num2Str));
			
			strs[0] = num1Str;
			strs[1] = num2Str; //예외 발생 ArrayIndexOfBoundsException
			}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
				System.out.println("예외 발생");
			}

		
		
		
		
		
		
		
		
		
		
	}

}
