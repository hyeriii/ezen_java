package mission;

import java.util.Scanner;

public class mission_0718_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.print("�ǿ�����1 >");
			int num1= scanner.nextInt();
			System.out.print("�ǿ�����2 >");
			int num2= scanner.nextInt();
			
			System.out.print("�����ڼ���(+,-,*,/,%) > ");
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
			System.out.println("���ڸ� �Է��Ͽ���");
		}
		 

	}

}
