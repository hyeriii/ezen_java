package ch05;

public class Ex04 {

	public static void main(String[] args) {
		//210708
		//2���� �迭 
		
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
		//System.out.println(intArray[1][3]); // �������� ���� �ε��� ���ٽ� ���� �߻��� 
		
		//2���� �迭���� ���� ����
		System.out.println(intArray2.length);
		
		//2���� �迭���� 1�� �ε��� ���� ����
		System.out.println(intArray2[1].length);
		//Q. ���� �ٸ���� ���������� �����Ⱚ�� ������?
		
		for(int i =0 ;i<intArray2.length;i++) {
			for(int j=0 ;j<intArray2[i].length;j++) {
				System.out.print(intArray2[i][j]+" ");
			}
			System.out.println();
		}
		
		//��� ���� ���̸� �˰� �ִ� 2���� �迭 ����
		int[][] intArray3 = new int[3][5];
		/*
		 {
		 		{0,0,0,0,0},
		 		{0,0,0,0,0},
		 		{0,0,0,0,0}
		 }
		 */
		
		//*2���� �迭�� Ư�� ���� ���̸� ������ ���� ���ο� �迭�� �����Ͽ� �ּҸ� �Ҵ����ش�. 
		intArray3[2] = new int[3];
		
		//2���� �迭���� ���� ���̸� �ʱ�ȭ �ϰ� ���� ���� ������ ����δ� ���
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
		//System.out.println(intArray3[0][1]); //����
		
		intArray3[0] = new int[]{1,2,3};
		System.out.println(intArray3[0][1]);
		
		
		
		
		
		
		
		
		
		
		
	}

}
