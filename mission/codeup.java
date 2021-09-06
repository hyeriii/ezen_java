package mission;

import java.util.Scanner;

public class codeup {

	public static void main(String[] args) {
	//1079번 
	//q입력까지 한줄 출력 
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//System.out.println(str);
		
		String[] str2 = str.split(" ");
		
		for(int i = 0; i< str2.length ; i++) {
			System.out.println(str2[i]);
			if(str2[i].equals("q")) {
				break;
			}
		}
		
		
		sc.close();
	}

}
