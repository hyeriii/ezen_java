package ch11;

import java.util.regex.Pattern;

public class PatternMain {

	public static void main(String[] args) {
		// ���Խ��� �̿��� ���ڿ� ���� üũ ���� 
		// ���Խ��� �̿��Ͽ� ȸ�����Խ� �Է������� ���� ���� üũ�� �Ѵ�. 
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String test ="010-123-4526";
		//pattern class ���� 
		boolean result = Pattern.matches(regExp, test);
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
