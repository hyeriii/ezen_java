package ch05;

public class Ex05 {

	public static void main(String[] args) {
		// 210708
		//�迭 ����
		
		//int[] a = {1,2,3};
		//�̻�Ȳ���� ���� 4�� �߰��ϰ������ �׷� ����� java������ ���� -> �迭 �����̿�
		
		
		//for�� �̿��� �迭 ����
		int[] intArray = {1,2,3};
		
		int[] copyArray = new int[4];
		
		for(int i=0;i<intArray.length;i++) {
			copyArray[i] = intArray[i];
		}
		
		copyArray[copyArray.length-1] = 4;

		for(int i=0;i<copyArray.length;i++) {
			System.out.println(copyArray[i]);
		}
	
		
		
		
		
		//System.arrayCopy()�޼ҵ� �̿��� �迭 ����
		//(oldArray,���� ���� �ε���,newArray,new�� ���� ���� �ε���, ���� ����)
		
		intArray = new int[] {1,2,3,4,5};
		int[] newArray = new int[10];
		
		System.arraycopy(intArray, 1, newArray, 3, 3);
		//newArray = > {0,0,0,0,0,0,0,0,0,0} -----------> {0 0 0 2 3 4 0 0 0 0}
		
		for(int i =0;i<newArray.length;i++) {
			System.out.print(newArray[i]+ " ");
		}
		
		
		//���� for��
		//�ε����� ���� ������ for�� ������ ������� ������ ��
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
