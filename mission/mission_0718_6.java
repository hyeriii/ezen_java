package mission;

import java.util.Scanner;

public class mission_0718_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.print("피연산자1 >");
			int num1= scanner.nextInt();
			System.out.print("피연산자2 >");
			int num2= scanner.nextInt();
			
			System.out.print("연산자선택(+,-,*,/,%) > ");
			String operator = scanner.next();
			
			if(operator.equals("+")) {
				Calurator.plus(num1,num2);
			}else if(operator.equals("-")) {
				Calurator.subtraction(num1,num2);
			}else if(operator.equals("*")) {
				Calurator.multiply(num1,num2);
			}else if(operator.equals("/")) {
				Calurator.division(num1,num2);
			}else if(operator.equals("%")) {
				Calurator.Remainder(num1,num2);
			}  
			
		}catch(Exception e) {
			System.out.println("숫자를 입력하에요");
		}
		 

	}

}
