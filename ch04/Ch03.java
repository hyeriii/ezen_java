package ch04;

public class Ch03 {

	public static void main(String[] args) {
		// 134p Ȯ�ι��� 3��
		int sum = 0;
		for(int i = 1;i<=100;i++) {
			System.out.println(i);
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println("1~100������ 3�� ��� ���� : "+sum);

	}

}
