package ch15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		// Queue - FIFO ���Լ���
		// Queue�� �������̽� �̸� ���� Ŭ�����δ� LinkedList
		
		Queue<String> qu = new LinkedList<>();
		
		qu.offer("ȫ");
		qu.offer("��");
		qu.offer("��");
		
		String str = qu.poll();
		System.out.println(str);
		System.out.println(qu.size());
		System.out.println(qu.peek());
		
		
		str = qu.poll();
		System.out.println(str);
		System.out.println(qu.size());
		System.out.println(qu.peek());
		

		str = qu.poll();
		System.out.println(str);
		System.out.println(qu.size());
		System.out.println(qu.peek());
		
		
		
	}

}
