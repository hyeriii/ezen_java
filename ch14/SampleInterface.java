package ch14;


//@FunctionalInterface - 컴파일러가 해당 인터페이스에 추상메소드가 하나만 존재하는지 강력한 컴파일을 해준다
//추상메소드가 하나만 존재하느 interface를 함수적 인터페이스라 부른다
//함수적 인터페이스의 구현객체인 람다식을 사용하여 익명객체를 생성할 수 있다. 
@FunctionalInterface
public interface SampleInterface {
	
	//void method1();
	void method2(int a);

	
}
