package ch06;

public class ShopServiceExample {

	public static void main(String[] args) {
		//210713
		//6장 확인문제 18

		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다. ");
		}else {
			System.out.println("다른  ShopService 객체 입니다. ");
		}
		
	}

}
