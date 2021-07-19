package ch09;

public class A {
	
	testIn t ; 
	//바깥쪽 클래스의 인스턴스 멤버로 사용할 수 있는 중첩클래스 범위
	//인스턴스 멤버 클래스와 정적멤버 클래스 모두 사용 가능 
	//인스턴스 멤버는 이미 객체가 생성된 후이기 때문에
	
	//바깥쪽 클래스의 정적 멤버로 사용할 숭 있는 중첩클래스 범위
	//정적 멤버 클래스는 main이 실행되기 전에 로드 되며 인스턴스 멤버 클래스는 객체에 종속적이므로
	//바깥쪽 클래승의 정적 멤버 데이터로는 인스턴스 멤버 클래스 타입의 객체는 올수 없음 
	
	class B{
		//클래스 선언 블럭 안에서 선언된 클래스를 중첩 클래스 or innerclass라고 부른다. 
		
		//인스턴스 멤버 클래스로 선언이 되어있는 중첩클래스는 정적멘버를 가질수 없다. 
		//객체에 종속적이다.
		
		B(){
			System.out.println("B클래스 기본 생성자");
			
		}
		
		int a = 10;
		
		public void method() {
			System.out.println("B 클래스의 내부메소드"); 
		}
	}
	
	static class C{
		//정적 멤버 클래스 선언 
		//구성요소 - 생성자, 인스턴스 멤버, 정적 멤버 모두 올 수 있음 
		C(){
			System.out.println("정적 멤버 C 생성자");
		}
		int field = 10;
		static int field2 = 10;
		void me() {
			System.out.println("인스턴스 멤버 메소드");
		}
		static void me2() {
			System.out.println("정적 멤버 메소드");
		}
		
	}
	
	void method() {
		//로컬 클래스 - 메소드 실행 블럭 안쪽에 정의 되어있는 클래스 의미
		//해당 블럭 벗어나면 사용할 수 없음
		//정적멤버는 구성요소로 올 수없음 
	
		int tempNum = 10;
		
		class D{
			D(){
				System.out.println("로컬 클래스 D 생성자");
			}
			
			int field =10;
			void method() {
				System.out.println("로컬 클래스 D 인스턴스 메소드"+tempNum);
			}
		}
		D d = new D();
		d.field = 3;
		d.method();
		//클래스에서 구성 값이 변경되는 경우는 객체 생성시 외부에서 대입받은 값만 가능하다
		//로컬 클래스에서 해당 메소드의 로컬변수를 구성값으로 가지는 경우 특정 시점에
		//로컬변수 값이 변경되었을때 이를 클래스에 ㅂ나영할 수 없으므로 final 특성을 가진다
	}
	
	interface testIn{
		void test();
	}
}
