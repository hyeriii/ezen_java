package ch06;

public class MethodSampleMain {

	public static void main(String[] args) {
		//210712
		MethodSample ms = new MethodSample();
		ms.m1();
		//ms.m1("");// 실행시 오류, parseInt는 공백을 숫자로 바꿀수가 없어서
		ms.m1("", 0);
		

	}

}
