package ch05;

public class Ex05 {

	public static void main(String[] args) {
		// 210708
		//배열 복사
		
		//int[] a = {1,2,3};
		//이상황에서 원소 4를 추가하고싶은데 그럴 방법이 java에서는 없음 -> 배열 복사이용
		
		
		//for문 이용한 배열 복사
		int[] intArray = {1,2,3};
		
		int[] copyArray = new int[4];
		
		for(int i=0;i<intArray.length;i++) {
			copyArray[i] = intArray[i];
		}
		
		copyArray[copyArray.length-1] = 4;

		for(int i=0;i<copyArray.length;i++) {
			System.out.println(copyArray[i]);
		}
	
		
		
		
		
		//System.arrayCopy()메소드 이용한 배열 복사
		//(oldArray,복사 시작 인데스,newArray,new의 복사 시작 인데스, 복사 갯수)
		
		intArray = new int[] {1,2,3,4,5};
		int[] newArray = new int[10];
		
		System.arraycopy(intArray, 1, newArray, 3, 3);
		//newArray = > {0,0,0,0,0,0,0,0,0,0} -----------> {0 0 0 2 3 4 0 0 0 0}
		
		for(int i =0;i<newArray.length;i++) {
			System.out.print(newArray[i]+ " ");
		}
		
		
		//향상된 for문
		//인덱스에 대한 정보를 for문 블럭에서 사용하지 않을때 편리
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
