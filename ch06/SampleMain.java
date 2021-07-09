package ch06;

public class SampleMain {

	public static void main(String[] args) {
		//210709
		//new연산자는 클래스이름() 으로 된 생성자를 호출하여 클래스 이름으로 된 클래스를 이용하여 힙에 객체를 생성하고
		//그에 대한 주소값을 new를 호출한 위치에 리턴함 
		
		//생성된 객체를 담을 클래스 변수의 데이터 타입은 반드시 생성된 객체의 클래스와 같아야 한다.
		
		Sample sample = new Sample();
		
		System.out.println(sample);
		
		//외부에서 생성된 객체의 필드에 접근하는 방법
		//name값 출력
		System.out.println(sample.name);
		System.out.println(sample.number);
		
		sample.number = 10;
		System.out.println(sample.number);
		
		Sample_a sa= new Sample_a(10);
		
		//컴파일러는 소스파일에 하나이상의 생성자가 존재하는 경우
		//기본생성자를 생성해주지 않는다. 
		//Sample_a sa2= new Sample_a();
	
		System.out.println("sa의 filed값"+sa.filed1);
	
		A ex = new A("A", "B", 10);
	
		System.out.println("A클래스의 필드갑 >"+ ex.title + ", "+ex.writer+ ", "+ex.type+ ","+ ex.hit);
	
	
		//오버로딩 확인
		Test test1= new Test();
		
		//해당 생성자가 선언된적 없으므로 컴파일 에러 발생함
		//Test test2= new Test("가", 10, true);
	
		//method EX
		A a = new A("tite","writer",10);
		
		a.method1();
		
		int result = a.method2();
		System.out.println(result);
		
		//A에  sum 메소드 정의
		int result2 = a.sum(1,10);
		System.out.println("1~10사이의 합 : "+result2);
		
	}

}
