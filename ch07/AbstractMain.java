package ch07;

public class AbstractMain {

	public static void main(String[] args) {
		
		//추상클래스 선언 방법 abstract 키워드 추가 
	
		Tv2 tv2=new Tv2();
		tv2.brand = "LG";
		tv2.model="65inch";
		tv2.no = "12566";
		

		tv2.trunOn();
		tv2.trunOff();
		
/*
		Radio2 rd2=new Radio2();
		rd2.brand = "sony";
		rd2.model="15inch";
		rd2.no = "165";
	
*/
	}

}
