package ch06;

public class MemberServiceExample {

	public static void main(String[] args) {
		//210712
		//6장 확인문제 16

		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong","12345");
		
		if(result) {
		System.out.println("로그인 되었습니다.");
		memberService.logout("hong");
		
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		
		
	}

}
