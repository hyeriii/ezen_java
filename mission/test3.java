package mission;

public class test3 {
	public static int sum(int num1,int num2) {
		return num1+num2;
	}
	
	public static int minus(int num1, int num2) {
		return num1-num2;
	}
	
	public static int gob(int num1,int num2) {
		return num1*num2;
	}
	
	public static double nanugi(int num1,int num2) {
		return (double)num1/num2;
	}
	
	public static int namarge(int num1,int num2)throws ArithmeticException {
		return num1%num2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double result4 = test3.nanugi(10,0);
		
		if(!Double.isInfinite(result4)) {
			System.out.println(result4);
		}else {
			System.out.println("0으로 나눌수 없습니다.");
		}
		
		try {
			int result5 = test3.namarge(10, 0);
			System.out.println(result5);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
	}

}
