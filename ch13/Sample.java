package ch13;

public class Sample<T extends Parent> {

	//<T extends ClassName > 에서 extends의 역학은 
	//타입 파라미터로 들어올 수 있는 타입을 제한할 때 사용
	//해당 ClassName 타입으로 포함 하위되어 있는 타입만 파라미터로 대입 할 수 있다 
	
	
	//와일드 카드 
	//매개변수로 타입 파라미터를 사용하는 객체를 받을때 
	//매개변수에 올 수 있는 타입 파라미터의 제한을 의미함 
	public void method(Box<?> box) {
		//? - 모든 타입으로 생성된 box를 받겠다
		
		box.getObj();
		
	}
	
	public void method2(Box< ? extends Child> box) {
		//? extends ClassName -> ClassName 포함 하위로 생성된 객체만을 받을 수 있음 
	}
	
	public void method3(Box<? super Child> box) {
		//? super ClassName - > ClassName 포함 상위 타입으로 생성된 객체만 매개변수값으로
		//생성된 객체만 매개값으로 받을 수 있다. 
	}
	
	
	
	
	
	
	
	
	
} 
