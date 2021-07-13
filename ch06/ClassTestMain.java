package ch06;

import ch06_1.PublicClass;

//import ch06_1.DefualtClass; : defualt 접근제한자는 자신이 속한 패키지를 벗어나서 사용 할 수 없음

public class ClassTestMain {

	public static void main(String[] args) {
		//210713
		System.out.println(PublicClass.field1);

		PublicClass pc = new PublicClass(); //public
		//PublicClass pc2 = new PublicClass(2);//default - 같은 패키지내에서만 가능 
		//PublicClass pc3 = new PublicClass("");
		
		//DefualtCalss dc = new DefualtCalss(); 
		
	}

}
