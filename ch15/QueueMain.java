package ch15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		// Queue - FIFO 선입선출
		// Queue는 인터페이스 이며 구현 클래스로는 LinkedList
		
		Queue<String> qu = new LinkedList<>();
		
		qu.offer("홍");
		qu.offer("길");
		qu.offer("동");
		
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
