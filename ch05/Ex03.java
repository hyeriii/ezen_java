package ch05;

public class Ex03 {

	public static void main(String[] args) {
		//210708
		//배열(참조타입) - 같은 타입으로 이루워진 데이터들의 집합
		
		//1. int 타입 배열
		int[] intArray = null;
		
		int intArray2[] = null;
		
		//2.int타입 배열에 리터럴로 배열 값 초기화
		int[] intArray3 = {1,2,3,4,5};
		System.out.println(intArray3[2]);
		intArray3[3]= 10 ;
		System.out.println(intArray3[3]);
		
		
		int i =0;
		for(i=0;i<intArray3.length;i++) {
		
			System.out.println("배열의"+i+"번째 원소값은"+intArray3[i]);
		}//사용 예 : 게시글 10개씩 불러오는거 등등

		
		//다른 타입 배열 생성

		String[] strArray = {"java","html","php"};
		double[] doubleArray = null;
		
		//배열의 길이와 원소를 알고 있을때는 리터럴로 배열을 생성할 수 있다.
		
		//배열이 생성된 이유 배열 데이터 할당 -new 연산자 사용해야함 
		//doubleArray = {3.14,5.23 ,2.36 ,5.0 };
		
		//new연사자는 호출되면 heap에 데이터를 생성하고 주소값을 돌려준다. 
		doubleArray = new double[] {3.14,5.23 ,2.36 ,5.0}; 
		
		//배열의 길이는 알지만 원소값을 모를때 배열 생성 
		String[] strArray2 = new String[5];
		System.out.println(strArray2[0]);
		
		intArray = new int[10];
		System.out.println(intArray[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
