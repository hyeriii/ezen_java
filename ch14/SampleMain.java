package ch14;

import java.util.function.Consumer;
import java.util.function.Function;

public class SampleMain {

	public static void main(String[] args) {
		//함수적 인터페이스의 구현객체인 람다식을 사용하여 익명객체를 생성할 수 있다. 

		SampleInterface sample;
		sample = new SampleInterface() {
			@Override
			public void method2(int a) {
				System.out.println("익명객체 생성 ");
			}
		};
		
		sample.method2(10);
		
		//-------------------------------------------------
		
		
		//람다식 사용
		//람다식은 함수적 인터페이스에 대입되는 익명객체를 생성하는 방법
		/*
		 * sample = () -> {//하나만 존재하는 함수의 실행문 정의하는 곳
		 * System.out.println("람다식을 이용한 익명객체 생성후, 인터페이스 대입"); };
		 * 
		 * sample.method1();
		 */
		
		//함수적 인터페이스의 추상메소드에 매개변수가 하나만 존재하면 
		//람다식 사용시 괄호를 생략할 수 있다.
		sample = a -> {//하나만 존재하는 함수의 실행문 정의하는 곳
			System.out.println("람다식을 이용한 익명객체 생성후, 인터페이스 대입");
		};

		sample.method2(10);
		
		
		
		//매개변수2개 이상인 함수적 인터페이스의 람다식 사용 예
		//-()가 반드시 필요하면 ,를 구분하여 매개변수 선언 이때, 타입은 생략 가능 
		//(int a, String b) -> 생략가능 (a, b)
		Sample2Interface sample2;
		sample2 = (int a, String b)->{
			System.out.println(a+","+b);
		};
		
		sample2.method1(10, "test");
		
		//{} 블록을 생략할 수 있는 경우
		//-실행문이 한줄 있을 경우 생략 가능 
		sample2 = (int a, String b)->System.out.println(a+","+b);
		
		sample2.method1(10, "test");
		
		
		
		//()와 {}블럭을 모두 생략할 수 있는 경우
		//-매개변수가 하나이고 실행문이 한줄인 경우 
		sample = a -> System.out.println(a);
		
		sample.method2(10);
		
		
		//return타입이 존재하는 함수적 인터페이스 
		Sample3Interface sample3 = () ->{
			System.out.println("리턴 타입 int이므로 10리턴할 것임 ");
			return 10;
		};
		
		int result = sample3.method();
		System.out.println(result);
		
		//람다식을 이용한 return이 존재하는 추상메소드 구현시 실행문이 return 한줄인 경우 
		//{}블럭과 return 생략 가능 
		sample3 = () -> 10;
		
		result = sample3.method();
		System.out.println(result);
		
		
		//function 함수적 인페이스
		//타입 파라미터를 받아 주로 매개값을 리턴타입으로 매핑하여 반환하는 역할
		Function<String, Box<String>> function;
		function =(s)->{
			Box<String> box = new Box<String>();
			box.setObj(s);
			return box;
		};
		Box<String> box = function.apply("box 입니다");
		System.out.println(box.getObj());
		
		
		//Stirng 타입의 매개변수를 Integer 타입으로 변경하여 return
		Function<String,Integer> function2;
		function2=(s)->{
			return Integer.parseInt(s);
		};
		int result2 = function2.apply("3");
		System.out.println(result2);
		
		
		//andThen()
		//두개의 인터페이스를 연결하여 순차적으로 실행하므로 인터페이스의 타입 선언이 모두 동일해야함
		Consumer<String> consumerA;
		consumerA =s->System.out.println(s);
		
		Consumer<String> consumerB;
		consumerB =i->System.out.println(i);
		
		
		Consumer<String> consumerAB = consumerA.andThen(consumerB);
		
		//andthen() 결과를 담고있는 consumerAB는 자신의 accept는 존재하지 않고 andthen으로 선언되어 있는 
		//인터페이스들을 순차적으로 실행시키는 역할을 함다.
		consumerAB.accept("andThen 실행");
		
		//compose()
		//인자로 넘어가는 인터페이스부터 실행하고 compose 호출한 인터페이스가 나중에 실행 
		//그렇기 때문에 compose를 받는 인터페이스의 타입 파라미터는 최초 실행되는 인터페이스의 매개변수 타입이 되어야 하고 리턴
		//타입은 최종적으로 실행되느 인터페이스의 리턴타입과 일치해야한다.
		Function<String, Integer> functionA;
		functionA = s -> Integer.parseInt(s);
		
		Function<Integer, Box<Integer>> functionB;
		functionB = v->{
			Box<Integer> tempBox = new Box<Integer>();
			tempBox.setObj(v);
			return tempBox;
		};
		
		Function<String, Box<Integer>> functionAB;
		functionAB = functionB.compose(functionA);
		
		Box<Integer> newBox = functionAB.apply("3");
		System.out.println(newBox.getObj());
		
		
		
		
		
		
		
	}

}
