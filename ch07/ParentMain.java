package ch07;

public class ParentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandMa gm = new GrandMa();
		gm.gMethod();
		
		Parent p = new Parent();
		p.gMethod();

		//java에서 부모에는 모든 자식 객체가 자동 형변환되어 대입된다.
		gm = p ;
		
		//다형성 구현 
		//상속에서의 다형성으 부모에 어떤 자식이 대입되어 있느냐에 따라 같은 메소드이지마 재정의 되어있는 자식 메소드가 호출되면서 다른 내용이 출력되는것을 의미한다. 
		gm.gMethod();
		
		//자식객체를 부모타입의 변수에서 대입했을 경우 해당 부모 타입 변수를 이용하여
		//사용할수 있는 멤버의 범위는 자식객체가 참조하고있는 부모 객체까지이다
		//System.out.printn(gm.f);
		
	}

}
