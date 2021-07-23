package ch14;

import java.util.function.*;

public class FunctionalSampleMain {

	public static void main(String[] args) {
		// consumer 인터페이스 사용 
		//매개변수는 존재하나 리턴이 없는 함수적 인터페이스
		Consumer<String> consumer = t->{
			
			//consumer인터페이스는 accept라는 추상 메소드를 제공하며
			//타입파라미터로 결정된 타입의 매개변수 하나를 가짐
			System.out.println(t);
			
		};

		consumer.accept("안녕하세요");
		
		
		//BiConsumer<T,V> 인터페이스 선언시 타입 두개를 받아 순서대로 매개변수의 타입을 결정짓는 함수적 인터페이스
		BiConsumer<String,Integer> biConsumer;
		
		biConsumer =(String k, Integer v)->System.out.println(k+v);
		
		biConsumer.accept("안녕하세요", 10);
		
		//Supplier 함수적 인터페이스
		//매개값은  존재하지 않으나 리턴값은 존재하는 함수적 인터페이스
		Supplier<String> supplier; //String get()
		supplier =()->{return "supplier 호출 ";};
		
		System.out.println(supplier.get());
		
		
	}

}
