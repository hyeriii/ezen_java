package ch05;

public class Ex04 {

	public static void main(String[] args) {
		//210708
		//2차원 배열 
		
		int[][] intArray = {
				{11,12,13,14},
				{21,22,23},
				{31,32,33,34,35},
				{41,42,43},
				{51,52}
		};
		
		int[][] intArray2 = null;
		intArray2 = new int[][] {
			{11,12,13,14},
			{21,22,23},
			{31,32,33,34,35},
			{41,42,43},
			{51,52}
			
		};
		//System.out.println(intArray[1][3]); // 존재하지 않은 인덱스 접근시 에러 발생함 
		
		//2차원 배열에서 행의 길이
		System.out.println(intArray2.length);
		
		//2차원 배열에서 1번 인덱스 열의 길이
		System.out.println(intArray2[1].length);
		//Q. 길이 다를경우 나머지에는 쓰레기값이 들어가는지?
		
		for(int i =0 ;i<intArray2.length;i++) {
			for(int j=0 ;j<intArray2[i].length;j++) {
				System.out.print(intArray2[i][j]+" ");
			}
			System.out.println();
		}
		
		//행과 열의 길이만 알고 있는 2차원 배열 생성
		int[][] intArray3 = new int[3][5];
		/*
		 {
		 		{0,0,0,0,0},
		 		{0,0,0,0,0},
		 		{0,0,0,0,0}
		 }
		 */
		
		//*2차원 배열의 특정 행의 길이를 변경할 때는 새로운 배열을 생성하여 주소를 할당해준다. 
		intArray3[2] = new int[3];
		
		//2차원 배열에서 행의 길이만 초기화 하고 열에 대한 정보는 비워두는 방법
		intArray3 = new int[5][];
		/*
		 {
		 		{},
		 		{},
		 		{},
		 		{},
		 		{}
		 }
		 */
		//System.out.println(intArray3[0][1]); //에러
		
		intArray3[0] = new int[]{1,2,3};
		System.out.println(intArray3[0][1]);
		
		
		
		
		
		
		
		
		
		
		
	}

}
