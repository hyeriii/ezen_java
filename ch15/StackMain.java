package ch15;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		//stack �ڷᱸ���� - LIFO(last in first out, ���Լ���)
		Stack<String> stack = new Stack<>();
		stack.push("ȫ");
		stack.push("��");
		stack.push("��");
		
		System.out.println(stack.size());
		String last = stack.pop();
		System.out.println("������ ������ : "+ last);
		System.out.println(stack.size());
		
		stack.push("��");
		
		  int con = stack.size(); 
		  for(int i = 1; i<=con; i++) {
			  System.out.println(stack.pop());
		  
		  }
		
		  stack.push("ȫ");
		  stack.push("��");
		  stack.push("��");
			
			
		System.out.println("----------");
		while(stack.size() != 0) {
			System.out.println(stack.pop());
			if(stack.size() > 0) {
				
				//stack.size ���ϴ� ���� 
				//peakȣ��� �������Ұ� ������ emptyStackException
				System.out.println("���� pop��� : "+ stack.peek());
				
			}
			
		}
		
		
		
		
		
		
	}

}
