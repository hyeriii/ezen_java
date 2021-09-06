package mission;

public class test2 {
	protected int Avg=0;
	
	public test2(int a, int b, int c) {
		int sum = a+b+c;
		Avg = sum/3;
	}
	public int getAve() {
		return Avg;
	}
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		
		test2 s = new test2(a,b,c);
		System.out.println(s.getAve());
	}
}
