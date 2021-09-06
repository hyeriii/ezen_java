package mission;

import java.util.Arrays;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		//1차원 배열이용
		//3<= N <=50 사이의 랜덤 숫자 출력 
		//첫줄에서 하나의 숫자가 빠진 숫자열 출력
		//몇번째 숫자가 빠졌는지 알아내기 
		Scanner sc = new Scanner(System.in);
		int maxNum;
		int box;
		maxNum = sc.nextInt();
		
		int nums[] = new int[maxNum];
		boolean room[] = new boolean[maxNum];
		
		int i = 0; 
		while(true) {
			box = (int)(Math.random()*maxNum)+1;
			System.out.println(i +"번째 "+ box);
			
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
				//해당 번호 숫자 제거 
				run = false;
			}
		}
		
		 */
	}
		}
