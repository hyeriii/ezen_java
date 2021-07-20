package ch11;

import java.util.Date;

public class ObjectMain {

	public static void main(String[] args) {
		NewClass newclass = new NewClass();
		
		//Object 클래스는 모든 클래스의 최상위 클래스이므로 자동형변환이 되다.
		Object obj = newclass;
		
		//부모 객체를 자식 객체에 담기위해서는 강제 형변환이 필요하다.
		newclass = (NewClass)obj;
		
		newclass.method();
		
		
		boolean result = obj.equals(newclass);

		
		System.out.println(result);
		
		NewClass newclass2 = new NewClass();
		newclass2.field = 20;
		
		if(newclass2.equals(newclass)) {
			System.out.println("구성하고 있는 필드값이 같다");
		}else {
			System.out.println("구성하고 있는 필드값이 다르다.");
		}
		
		//******************************************************************
		if(newclass2.equals(obj)) {
			System.out.println("두 객체는 논리적으로 같습니다.");
		}else {
			System.out.println("두 객체는 논리적으로 다릅니다.");
		}
		
		//******************************************************************
		//hashCode() - obj가 가지는 주소값을 정수로 변환해서 출력
		//******************************************************************
		System.out.println(obj.hashCode());
		System.out.println(newclass.hashCode());
		
		//******************************************************************
		//toString() 
		//******************************************************************
		System.out.println(obj.toString());
		System.out.println(newclass.toString());
		
		
		//toString() 확인 
		EntityCalss e1 = new EntityCalss(10,20,"a","b",true);
		System.out.println(e1.toString());
		
		Date today = new Date(); // 객체가 생성되는 시점의 시간정보를 갖는 객체 
		System.out.println(today.toString());
		
	
		
		
	}

}
