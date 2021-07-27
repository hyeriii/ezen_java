package ch15;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		//stack 자료구조론 - LIFO(last in first out, 후입선출)
		Stack<String> stack = new Stack<>();
		stack.push("홍");
		stack.push("길");
		stack.push("동");
		
		System.out.println(stack.size());
		String last = stack.pop();
		System.out.println("꺼내온 데이터 : "+ last);
		System.out.println(stack.size());
		
		stack.push("동");
		
		  int con = stack.size(); 
		  for(int i = 1; i<=con; i++) {
			  System.out.println(stack.pop());
		  
		  }
		
		  stack.push("홍");
		  stack.push("길");
		  stack.push("동");
			
			
		System.out.println("----------");
		while(stack.size() != 0) {
			System.out.println(stack.pop());
			if(stack.size() > 0) {
				
				//stack.size 비교하는 이유 
				//peak호출시 다음원소가 없으면 emptyStackException
				System.out.println("다음 pop대상 : "+ stack.peek());
				
			}
			
		}
		
		
		
		
		
		
	}

}
