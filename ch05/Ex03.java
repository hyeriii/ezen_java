package ch05;

public class Ex03 {

	public static void main(String[] args) {
		//210708
		//�迭(����Ÿ��) - ���� Ÿ������ �̷���� �����͵��� ����
		
		//1. int Ÿ�� �迭
		int[] intArray = null;
		
		int intArray2[] = null;
		
		//2.intŸ�� �迭�� ���ͷ��� �迭 �� �ʱ�ȭ
		int[] intArray3 = {1,2,3,4,5};
		System.out.println(intArray3[2]);
		intArray3[3]= 10 ;
		System.out.println(intArray3[3]);
		
		
		int i =0;
		for(i=0;i<intArray3.length;i++) {
		
			System.out.println("�迭��"+i+"��° ���Ұ���"+intArray3[i]);
		}//��� �� : �Խñ� 10���� �ҷ����°� ���

		
		//�ٸ� Ÿ�� �迭 ����

		String[] strArray = {"java","html","php"};
		double[] doubleArray = null;
		
		//�迭�� ���̿� ���Ҹ� �˰� �������� ���ͷ��� �迭�� ������ �� �ִ�.
		
		//�迭�� ������ ���� �迭 ������ �Ҵ� -new ������ ����ؾ��� 
		//doubleArray = {3.14,5.23 ,2.36 ,5.0 };
		
		//new�����ڴ� ȣ��Ǹ� heap�� �����͸� �����ϰ� �ּҰ��� �����ش�. 
		doubleArray = new double[] {3.14,5.23 ,2.36 ,5.0}; 
		
		//�迭�� ���̴� ������ ���Ұ��� �𸦶� �迭 ���� 
		String[] strArray2 = new String[5];
		System.out.println(strArray2[0]);
		
		intArray = new int[10];
		System.out.println(intArray[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
