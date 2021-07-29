package mission;

public class Calculator {

	
	public static int plus(int num1, int num2) {
		return num1+num2;
	}
	
	public static int minus(int num1, int num2) {
		return num1-num2;
	}
	
	public static int times(int num1, int num2) {
		return num1*num2;
	}
	
	public static double division(int num1, int num2) {
		double result = (double)num1/num2;
		if(Double.isInfinite(result)) {
			System.out.println("값 산출 불가");
			return -1;
		}else {
			return result;
		}
	}
	
	public static double remainder(int num1, double num2) {
		double result = (double)num1%num2;
		if(Double.isNaN(result)) {
			System.out.println("값 산출 불가");
			return -1;
		}else {
			return result;	
		}		
	}
	
}
