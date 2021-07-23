package ch14;

import java.util.function.*;

public class FunctionalSampleMain {

	public static void main(String[] args) {
		// consumer �������̽� ��� 
		//�Ű������� �����ϳ� ������ ���� �Լ��� �������̽�
		Consumer<String> consumer = t->{
			
			//consumer�������̽��� accept��� �߻� �޼ҵ带 �����ϸ�
			//Ÿ���Ķ���ͷ� ������ Ÿ���� �Ű����� �ϳ��� ����
			System.out.println(t);
			
		};

		consumer.accept("�ȳ��ϼ���");
		
		
		//BiConsumer<T,V> �������̽� ����� Ÿ�� �ΰ��� �޾� ������� �Ű������� Ÿ���� �������� �Լ��� �������̽�
		BiConsumer<String,Integer> biConsumer;
		
		biConsumer =(String k, Integer v)->System.out.println(k+v);
		
		biConsumer.accept("�ȳ��ϼ���", 10);
		
		//Supplier �Լ��� �������̽�
		//�Ű�����  �������� ������ ���ϰ��� �����ϴ� �Լ��� �������̽�
		Supplier<String> supplier; //String get()
		supplier =()->{return "supplier ȣ�� ";};
		
		System.out.println(supplier.get());
		
		
	}

}
