package ch05;

public class Ch07 {

	public static void main(String[] args) {
		//210708
		//182p 확인문제 7번
		int max = 0 ;
		int[] array = {1,5,3,8,2};
		
		
		for(int i = 0;i<array.length;i++) {
			
			if(max<array[i]) {
				max = array[i];
			} //else max = array[i];
			
		}
		
		
		
		System.out.println("max:  "+ max);
		
		
		
	}

}
