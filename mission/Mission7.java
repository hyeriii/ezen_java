package mission;

import java.util.Scanner;

public class Mission7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int num1 = 0;
		int num2 = 0;
		
		
		while(run) {
		System.out.print("�ǿ�����1 >");
		String sNum1 = scanner.next(); 
		
		System.out.print("�ǿ�����2 >");
		String sNum2 = scanner.next();
		
		try {
			num1 = Integer.parseInt(sNum1);
			num2 = Integer.parseInt(sNum2);
			
			System.out.print("��Ģ����(+,-,*,/,%) >");
			String cal = scanner.next();

			if(cal.equals("+")) {
				int plus = Calculator.plus(num1, num2);
				System.out.println("�� ���� �� : "+plus);
			}else if(cal.equals("-")) {
				int minus = Calculator.minus(num1, num2);
				System.out.println("�� ���� �� : "+minus);
			}else if(cal.equals("*")) {
				int times = Calculator.times(num1, num2);
				System.out.println("�� ���� �� : "+times);
			}else if(cal.equals("/")) {		
				double division = Calculator.division(num1, num2);
				
				if(division != -1) {
					System.out.println("�� ���� ������ : " + division);
				}
			}else if(cal.equals("%")) {
				double remainder = Calculator.remainder(num1, num2);
				
				if(remainder != -1) {
					System.out.println("�� ���� ������ : "+remainder);
				}
			}else if(cal.equals("q")) {
				run = false ;
			}else {
				System.out.println("������ ��ȣ�� �ùٸ��� �ʽ��ϴ�.");
			}
		}catch(NumberFormatException e) {
			System.out.println("���ڰ� �ƴմϴ�. �ٽ� �����ϼ���.");
		}
	}
		System.out.println("���α׷��� ����");
		
	}

}
