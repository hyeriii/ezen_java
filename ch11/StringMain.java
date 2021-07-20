package ch11;

public class StringMain {

	public static void main(String[] args) {
		String str1 = "ABC";
		String str2 = new String("ABC");
		
		System.out.println(str1 == str2);
		
		byte[] bytes = new byte[10];
		bytes[0] = 65;
		bytes[1] = 66;
		bytes[2] = 67;
		
		String str3 = new String(bytes);
		
		System.out.println(str3);
		
		bytes[0] = 72;
		bytes[1] = 101;
		bytes[2] = 108;
		bytes[3] = 108;
		bytes[4] = 111;
		bytes[5] = 13; // \r
		bytes[6] = 10; // \n
		

		String str4 = new String(bytes);
		
		System.out.println(str4);
		System.out.println("test \t test");
		
		String str5 = new String(bytes, 0, 5);
		System.out.println(str5);
		
		//*************************************
		//getBytes() - 문자열을 byte배열로 얻어오는 메소드
		//*************************************
		
		String str6 = "안녕하세요";
		byte[] bytes2 = new byte[10];
		
		try{
			bytes2 = str6.getBytes("EUC-KR");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//문자열 한글자에 1바이트
		System.out.println(bytes2.length);
		
		for(int i = 0 ; i<bytes2.length;i++) {
			System.out.print(bytes2[i]+ ",");
		}
		
		System.out.println();
		
		String str7 = new String(bytes2);
		System.out.println(str7);
		
		
		
		//*************************************
		//indexOf() - 배열 또는 문자열 검색시 사용하는 메소드
		//일치하는 값이 없을때 -1 반환 
		//*************************************
		
		String str8 = "자바 프로그래밍";
		int index = str8.indexOf("프");
		System.out.println(index);
		
		
	
		//*************************************
		//replace()- 일치하는 문자열 찾아 다른 문자열로 치환
		//*************************************
		
		String newStr = str8.replace("자바", "JAVA");
		System.out.println(newStr);
		System.out.println(str8);

		//*************************************
		//substring() - 문자열 잘라내는 메소드
		//회원가입시 연락처 받아올때 - 있을때 사용하게됨 
		//*************************************
		String str9 = "111111-000000";
		String sub1 = str9.substring(0,6);
		System.out.println(sub1);
	
		String sub2 = str9.substring(7);
		System.out.println(sub2);
		
		
		//*************************************
		//trim() - 문자열의 앞뒤 공백 제거 
		//*************************************
		String str10 = "                    java programing          ";
		System.out.println(str10.trim() );
		
		

		//*************************************
		//valueOf() - 기본타입 데이터를 문자열 데이터로 변환해주는 메소드
		//          - 오버로딩이 되어있기 떄문에 타입을 다르게 같은 메소드를 호출 할 수 있다. 
		//*************************************
		String str11 = "10";
		int num =Integer.parseInt(str11);
		String numString  = String.valueOf(num);
		

		//*************************************
		//split() - 문자열에 구분자를 정해서 잘라내서 배열로 반환해주는 메소드
		//*************************************
		String str12 = "111-111-111";
		String[] arrayStr12 = str12.split("-");
		System.out.println(arrayStr12.length);
		
		//*************************************
		//StringBulider 클래스 - 문자열 담는 임시 저장소
		//사용이유 문자열 연산자를 사용하여 문자열을 이어붙이면 기존 객체를 사용하는 것이 아니라 새로운 객체를 생성하므로
		//시간 및 메모리 사용에 효율적이지 않다.
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("java");
		System.out.println(sb);
		
		sb.append("   pro");
		System.out.println(sb);
		
		sb.delete(0, 2);
		System.out.println(sb);
		
		
	}

}
