package ch10;

public class ThrowsMain {

	public static void main(String[] args) throws Exception {
		//예외 떠넘김 키워드 -throws
		
		FileInputStream file = new FileInputStream();
		/*
		 * try { file.close(); }catch(Exception e) {
		 * System.out.println("main 받아서 처리했습니다"); }
		 */	
		//file.close();
		//System.out.println("위에서 오류가 났지만 실행");
		
		try {
		throw new NumberFormatException();
		}catch(Exception e) {
			System.out.println("예외 발생 ");
			e.printStackTrace();
		}
		
		System.out.println("위에서 오류가 났지만 실행");
		
	}

}
