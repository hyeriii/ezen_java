package ch05;

public class Ex01 {

	public static void main(String[] args) {
		//참조타입의 동등비교 연산자
		//-동등비교 연산자는 기본타입의 경우 값의 비교가 가능
		//-동등비교 연산자는 참조타입의 경우 값의 비교가 불가능
		//jvm stack영역 - main() method에서 선언되어있는 변수의 메모리가 할당
		//기본타입의 경우 stack메모리에 직접적으로 값이 할당 됨
		//참조타입의 경우 실제 데이터는 외부 영역에서 생성되고 stack에는 생성된 주소값을 대입하여 참조가 이루어짐.
		
		//!!동등 비교 연산자는 stack에 할당된 값을 비교하는 연산자
		//기본타입은 stack에 데이터를 직접 담고 있으므로 값의 비교가 가능하지만,
		//참조타입은 주소값을 담기때문에 값의 비교가 불가
		
		//기본타입의 동등비교 예
		int a = 10;
		int b = 20;
		int c =10;
		if(a == c) {
			System.out.println("a와c의 값은 같다");
		}
		
		
		//String 참조타입의 동등비교 예
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = new String("홍길동"); // 힙영역
		
	//	System.out.println(s1s2s3);
		
		if(s1 == s2) {//주소값이 같은지 물어보는것
			System.out.println("주소 값이 같다");
		}
		if(s1 == s3) {
			System.out.println("주소 값이 같다2");
		}
		
		
		
		
		
		
		
		
	}
}
