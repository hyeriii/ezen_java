package ch11;

import java.util.regex.Pattern;

public class PatternMain {

	public static void main(String[] args) {
		// 정규식을 이용한 문자열 패턴 체크 예제 
		// 정규식을 이용하여 회원가입시 입력정보에 대한 패턴 체크를 한다. 
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String test ="010-123-4526";
		//pattern class 선언 
		boolean result = Pattern.matches(regExp, test);
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
