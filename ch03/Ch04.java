package ch03;

public class Ch04 {

	public static void main(String[] args) {
		int pencils =534;
		int student =30;
		
		//한명당 가질 수 있는 연필 수 
		int pencilePersudent = pencils/student ;
		System.out.println(pencilePersudent);

		int pencilsLeft = pencils%student ;
		System.out.println(pencilsLeft);
	}

	
}
