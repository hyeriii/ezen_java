package ch06;

public class MemberServiceExample {

	public static void main(String[] args) {
		//210712
		//6�� Ȯ�ι��� 16

		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong","12345");
		
		if(result) {
		System.out.println("�α��� �Ǿ����ϴ�.");
		memberService.logout("hong");
		
		}else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
		
		
		
	}

}
