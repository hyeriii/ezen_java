package ch14;

import java.util.function.Consumer;
import java.util.function.Function;

public class SampleMain {

	public static void main(String[] args) {
		//�Լ��� �������̽��� ������ü�� ���ٽ��� ����Ͽ� �͸�ü�� ������ �� �ִ�. 

		SampleInterface sample;
		sample = new SampleInterface() {
			@Override
			public void method2(int a) {
				System.out.println("�͸�ü ���� ");
			}
		};
		
		sample.method2(10);
		
		//-------------------------------------------------
		
		
		//���ٽ� ���
		//���ٽ��� �Լ��� �������̽��� ���ԵǴ� �͸�ü�� �����ϴ� ���
		/*
		 * sample = () -> {//�ϳ��� �����ϴ� �Լ��� ���๮ �����ϴ� ��
		 * System.out.println("���ٽ��� �̿��� �͸�ü ������, �������̽� ����"); };
		 * 
		 * sample.method1();
		 */
		
		//�Լ��� �������̽��� �߻�޼ҵ忡 �Ű������� �ϳ��� �����ϸ� 
		//���ٽ� ���� ��ȣ�� ������ �� �ִ�.
		sample = a -> {//�ϳ��� �����ϴ� �Լ��� ���๮ �����ϴ� ��
			System.out.println("���ٽ��� �̿��� �͸�ü ������, �������̽� ����");
		};

		sample.method2(10);
		
		
		
		//�Ű�����2�� �̻��� �Լ��� �������̽��� ���ٽ� ��� ��
		//-()�� �ݵ�� �ʿ��ϸ� ,�� �����Ͽ� �Ű����� ���� �̶�, Ÿ���� ���� ���� 
		//(int a, String b) -> �������� (a, b)
		Sample2Interface sample2;
		sample2 = (int a, String b)->{
			System.out.println(a+","+b);
		};
		
		sample2.method1(10, "test");
		
		//{} ����� ������ �� �ִ� ���
		//-���๮�� ���� ���� ��� ���� ���� 
		sample2 = (int a, String b)->System.out.println(a+","+b);
		
		sample2.method1(10, "test");
		
		
		
		//()�� {}���� ��� ������ �� �ִ� ���
		//-�Ű������� �ϳ��̰� ���๮�� ������ ��� 
		sample = a -> System.out.println(a);
		
		sample.method2(10);
		
		
		//returnŸ���� �����ϴ� �Լ��� �������̽� 
		Sample3Interface sample3 = () ->{
			System.out.println("���� Ÿ�� int�̹Ƿ� 10������ ���� ");
			return 10;
		};
		
		int result = sample3.method();
		System.out.println(result);
		
		//���ٽ��� �̿��� return�� �����ϴ� �߻�޼ҵ� ������ ���๮�� return ������ ��� 
		//{}���� return ���� ���� 
		sample3 = () -> 10;
		
		result = sample3.method();
		System.out.println(result);
		
		
		//function �Լ��� �����̽�
		//Ÿ�� �Ķ���͸� �޾� �ַ� �Ű����� ����Ÿ������ �����Ͽ� ��ȯ�ϴ� ����
		Function<String, Box<String>> function;
		function =(s)->{
			Box<String> box = new Box<String>();
			box.setObj(s);
			return box;
		};
		Box<String> box = function.apply("box �Դϴ�");
		System.out.println(box.getObj());
		
		
		//Stirng Ÿ���� �Ű������� Integer Ÿ������ �����Ͽ� return
		Function<String,Integer> function2;
		function2=(s)->{
			return Integer.parseInt(s);
		};
		int result2 = function2.apply("3");
		System.out.println(result2);
		
		
		//andThen()
		//�ΰ��� �������̽��� �����Ͽ� ���������� �����ϹǷ� �������̽��� Ÿ�� ������ ��� �����ؾ���
		Consumer<String> consumerA;
		consumerA =s->System.out.println(s);
		
		Consumer<String> consumerB;
		consumerB =i->System.out.println(i);
		
		
		Consumer<String> consumerAB = consumerA.andThen(consumerB);
		
		//andthen() ����� ����ִ� consumerAB�� �ڽ��� accept�� �������� �ʰ� andthen���� ����Ǿ� �ִ� 
		//�������̽����� ���������� �����Ű�� ������ �Դ�.
		consumerAB.accept("andThen ����");
		
		//compose()
		//���ڷ� �Ѿ�� �������̽����� �����ϰ� compose ȣ���� �������̽��� ���߿� ���� 
		//�׷��� ������ compose�� �޴� �������̽��� Ÿ�� �Ķ���ʹ� ���� ����Ǵ� �������̽��� �Ű����� Ÿ���� �Ǿ�� �ϰ� ����
		//Ÿ���� ���������� ����Ǵ� �������̽��� ����Ÿ�԰� ��ġ�ؾ��Ѵ�.
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
