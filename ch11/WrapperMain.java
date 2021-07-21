package ch11;

public class WrapperMain {

	public static void main(String[] args) {
		
		//기본타입들의 포장 클래스
		//Wrapper클래스들은 생성자에 문자열 값을 넘기면 문자열을 해당 클래스의 기본타입으로 값을 유지하며
		//기본타입 변수에 자동 형변환이 된다
		Byte bObj = new Byte("10");
		byte b = bObj;
		System.out.println(b);
		
		Integer iObj = new Integer(10);
		int i = iObj;
		System.out.println(i);
		
		b= Byte.parseByte("10");
		
	
		i = Integer.valueOf("10");
		System.out.println(i);
		
		//박싱 
		Integer iBox = Integer.valueOf(i);
		
		//언박싱
		i = iBox.intValue();
		
		//박싱 - 기본타입을 객체로 변환, parseInt or valueOf 사용 
		//언박싱 - 객체를 기본타입으로 변환, 변수.Value()
		//두 작업을 Wrapper 클래스를 이용하여 진행한다 
		
		
		
		
		
		
	}

}
