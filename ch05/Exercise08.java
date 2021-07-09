package ch05;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum =0;
		double avg = 0.0;
		//2차원 배열의 합과 평균 구하기
		int length = 0;
		for(int[] row : array) {
			for(int data: row) {
				sum += data;
			}
			length += row.length;
		}
		avg = (double)sum/length;
		
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);
		
	}
}
