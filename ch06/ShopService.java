package ch06;

public class ShopService {
	//210713
	//6�� Ȯ�ι��� 18
	
	private ShopService() {
		
	}
	
	private static ShopService shopservice = new ShopService();
	
	public static ShopService getInstance() {
		return shopservice;
	}
	
}
