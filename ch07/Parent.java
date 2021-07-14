package ch07;

public class Parent extends GrandMa{

	public String f = "f_parent";
	
	public String field = "parent";
	// 부모 클래스와 자식 클래스의 필드 이름이 같을때 부모 클래스 필드값을 불러오고 싶을때 super 사용하면 가능 
	public String gfield = super.field;
	// GrandMa는 기본 생성자가 없음 때문에 자식 class에서 GrandMa의 생성자를 호출해줘야 한다. 
	public Parent() {
		//자식 객체가 생성되기 위해서는 반드시 부모 객체가 먼저 생성되어야 하므로
		//부모클래스에 기본생성자가 없는 경우 자식 생성자에서 부모생성자를 호출한다
		super("GrandMa field1");
		//생성되고 있는 부모 객체의 주소값을  참고하고 있는 키워드
		//자식보다 부모가 먼저 생성되어야하기때문에 super위에 어떤한 실행문도 먼저 실해되서는 안된다. 컴파일 에러 발생
	}
	
	public String parentField1 = "parentField1";
	//default 접근제한자는 상속을 받아도 패캐지를 벗어나면 사용할 수 없음 
	String parentField2 = "parent_default";
	
	private void method1() {
		System.out.println("parent method1()!!");
	}
	
	//protected : 상속받은 자식과 같은 패키지에서 사용가능 
	protected void method2() {
		
		System.out.println("parent_method2()!!");
	}
	
	//오버라이딩 - 부모가 가지고 있는 메소그 자식쪽에서 재정의하여
	//자식의 객체 밖에서 재정의된 메소드를호출하는것
	//1.반드시 재정의하고 있는부모 메소드의 선언부와 일치해야함 
	//2. 접근제한자는 변경 불가함 : 하지만 약한 접근제찬을 강하게 변경은 불가하고 그 반대는 가능하다 
	
	@Override // 어노테이션 : 컴파일러에게 아래 메소드가 재정의 대상임을 알려줌 알려줌 
	public void  gMethod() {
		super.gMethod(); // 재정즤되기전 부모가 가지고 있는 메소드를 호출하는것
		System.out.println("method override");
	}
	
}

