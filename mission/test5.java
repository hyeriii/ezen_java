package mission;

import java.util.Arrays;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		//1���� �迭�̿�
		//3<= N <=50 ������ ���� ���� ��� 
		//ù�ٿ��� �ϳ��� ���ڰ� ���� ���ڿ� ���
		//���° ���ڰ� �������� �˾Ƴ��� 
		Scanner sc = new Scanner(System.in);
		int maxNum;
		int box;
		maxNum = sc.nextInt();
		
		int nums[] = new int[maxNum];
		boolean room[] = new boolean[maxNum];
		
		int i = 0; 
		while(true) {
			box = (int)(Math.random()*maxNum)+1;
			System.out.println(i +"��° "+ box);
			
			if(!room[box-1]) {
				room[box-1] = true;
				nums[i] = box;
				i++;
			}
			System.out.println(Arrays.toString(nums));
		}
		
		
		/*boolean run = true;
		int i =0;
		while(run) {
			box = (int)(Math.random()*maxNum)+1;
			if(nums[i]==box) {
				room[box] = false;
				nums[i] = 0;
				//�ش� ��ȣ ���� ���� 
				run = false;
			}
		}
		
		 */
	}
		}
