package ch11;

//Object는 상속 선언을 해주지 않아도 자동으로 상속되는 클래스이다.
public class NewClass {
	public int field = 0;
	public void method() {
		System.out.println("NewClass 메소드");
	}
	
	
	//Object 클래스가 가지는 equals 메소드 역할은 객체의 물리적 동등비교 주소값이 같은지를 비교하는 역할
	@Override
	public boolean equals(Object obj) {
		//논리적 동등비교란? 두 객체간의 실제 구성하고 있는 데이터가 같은지를 비교하는것을 의미함
		//Object 클래스의 equals 메소드를 재정의하여 사용한다. 
		boolean result = false;
	
		if(obj instanceof NewClass) {
			NewClass nObj = (NewClass)obj;
			
			if(this.field == nObj.field) {
				result = true;
			}
		}
		
		return result;
	}
	
	
	
	
	
			
}
