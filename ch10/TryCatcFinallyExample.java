package ch10;

public class TryCatcFinallyExample {

	public static void main(String[] args) {
		// 10장 확인문제 6번 
		
		String[] str= {"10", "2a"};
		int value =0;
		for(int i =0 ; i<=2 ; i++) {
			try {
				value = Integer.parseInt(str[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과");
			}catch(NumberFormatException e ) {
				System.out.println("숫자 변환할 수 없음");
			}finally {
				System.out.println(i + ": "+value);
			}
		}
		

	}

}
