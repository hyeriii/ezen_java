package mission;

public class Calurator {

	static int a=0;
	static int b=0;
	
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static int subtraction(int a, int b) {
		return a-b;
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	public static int division(int a, int b) {
		if(!Double.isFinite(b)) {
			return a/b;	
		}else {
			System.out.println("0으로 나눌 수 없습니다");
			return 0;
		}
		
	}
	
	public static int  Remainder(int a, int b) {
		return a%b;
	}
}
