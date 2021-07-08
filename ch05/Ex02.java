package ch05;

public class Ex02 {

	public static void main(String[] args) {
		//210708
		//null 과 nullPointerException
		//null은 참조타입 변수에 참조값이 없을 때 대입하는 값
		
		String str1 = null;
		System.out.println(str1);
		String str2 = null;
		System.out.println(str1==str2);
		
		//nullPointerException
		//-참조변수에 주소값이 할당되지잇지 않은 상태에서 해당 타입이 가지는 속성, 동작에 접근( ex) .length() )하려고 할때 발생하는 오류 
		str1 = "java";
		System.out.println("str1길이 ->"+str1.length());
	//	System.out.println("str2길이 ->"+str2.length()); //nullPointerException 발생
		
		

		
		
	}

}
