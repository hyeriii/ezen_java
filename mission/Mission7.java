package mission;

import java.util.Scanner;

public class Mission7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int num1 = 0;
		int num2 = 0;
		
		
		while(run) {
		System.out.print("피연산자1 >");
		String sNum1 = scanner.next(); 
		
		System.out.print("피연산자2 >");
		String sNum2 = scanner.next();
		
		try {
			num1 = Integer.parseInt(sNum1);
			num2 = Integer.parseInt(sNum2);
			
			System.out.print("사칙연산(+,-,*,/,%) >");
			String cal = scanner.next();

			if(cal.equals("+")) {
				int plus = Calculator.plus(num1, num2);
				System.out.println("두 수의 합 : "+plus);
			}else if(cal.equals("-")) {
				int minus = Calculator.minus(num1, num2);
				System.out.println("두 수의 차 : "+minus);
			}else if(cal.equals("*")) {
				int times = Calculator.times(num1, num2);
				System.out.println("두 수의 곱 : "+times);
			}else if(cal.equals("/")) {		
				double division = Calculator.division(num1, num2);
				
				if(division != -1) {
					System.out.println("두 수의 나누기 : " + division);
				}
			}else if(cal.equals("%")) {
				double remainder = Calculator.remainder(num1, num2);
				
				if(remainder != -1) {
					System.out.println("두 수의 나머지 : "+remainder);
				}
			}else if(cal.equals("q")) {
				run = false ;
			}else {
				System.out.println("연산의 기호가 올바르지 않습니다.");
			}
		}catch(NumberFormatException e) {
			System.out.println("숫자가 아닙니다. 다시 시작하세요.");
		}
	}
		System.out.println("프로그램ㄴ 종료");
		
	}

}
