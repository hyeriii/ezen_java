package ch06;

public class CalculatorMain {

	public static void main(String[] args) {

		//210712
		//static
		
		//�޼ҵ� ������ class�� ��ϵɶ� static ����� ����ǹǷ� main���� ���� �Ҵ��ϴ� �������� ���� �����
		System.out.println("Calculator.num2 -> " + Calculator.num2);
		
		Calculator.num1 = 10;
		Calculator.num2 = 20;
		
		
		System.out.println("num1->" + Calculator.num1);
		System.out.println("num2->" + Calculator.num2);
		
		Calculator cal = new Calculator();
		cal.num1 = 20;
		cal.num2 = 30;
	
		System.out.println("cal.num1->" + cal.num1);
		System.out.println("cal.num2->" + cal.num2);
	
		int result = Calculator.add(10, 20);
		System.out.println(result);
		
		//*******************************************************
		//1. �ν��Ͻ� �ʵ带 �����ؾ� �ϴ� ���
		//-class�� ������ ��ü���� �ٸ� ���� ���ϰ� ������ ��ü�� ���ؼ� �����ϴ°��� ���� ���
		//�����ʵ�� �����ؾ��ϴ� ���
		//���赵�� Ŭ������ ������ �Ӽ��� ��� �����ʵ�� ����
		
		
	}

}
