package ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		//Map -> �÷���, Ű�� ���� ������ ������ map.entity��ü�� ���ҷ� �ٷ�� ���� 
		//map������ key�� set�� �����ϰ� �ߺ� ����� �ȵǹǷ� 
		//�ַ� �̹� hashcode�� equals �޼ҵ尡 ���ǵǾ� �ִ� String Ÿ���� ���� ���� ���� 
		
		
		//key -> String ,  valus -> Integer �� map.entry�� ���ҷ� �� �� �ִ�
		Map<String, Integer> map = new HashMap<>();
		
		//map.entry ��ü��  map �÷��ǿ� �߰� 
		Integer result = map.put("ȫ�浿", 17);
		System.out.println(map.size());
		
		
		//map �� key�� �ߺ��� ������� �ʱ� ������ String �� key�� Ÿ������ �δ� ��� 
		//Stirng �� �ּҰ��� �ƴ϶� �����͸� �̿��Ͽ� ���ü�� �Ǻ��ϵ��� �����ǰ� �Ǿ������Ƿ� �����Ͱ� ������ map �߰� �ȵ� 
		//hashcode�� equals �̿��ؼ� key���� �ߺ����� �˾ҳ����Ƿ� �߰� �ȵ� 
		map.put(new String("ȫ�浿"), 20);
		System.out.println(map.size());
		
		map.put("ȫ�浿2", 20);
		map.put("ȫ�浿3", 30);
		map.put("ȫ�浿4", 20);
		
		//containsKey(K k) -> ��ġ�ϴ� key��ü�� �����ϴ� ���θ� ��ȯ 
		boolean result2 = map.containsKey("ȫ�浿");
		System.out.println(result2);
		
		//containsValue(V v) - > ���Ÿ���� ���ڷ� �ѱ�� ������ value��ü�� �����ϴ��� ���� ��ȯ 
		result2 = map.containsValue("test");
		System.out.println(result2);
		
		//get(key) - > ���ڷ� �Ѿ�� key�� ��ġ�ϴ� map.entry�� value�� ��ȯ 
		Integer i = map.get("ȫ�浿");
		System.out.println(i);
		
		//map�� ���ԵǾ� �ִ� ��� key�� set���� ��ȯ 
		Set<String> keySet = map.keySet();
		
		//set�� ���ԵǾ� �ִ� ��� key�� ���ٷ� ����
		Iterator<String> iterator = keySet.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println(key+","+value);
			
		}
		
		//entrySet() - Map.entry��ü�� set���� ��ȯ
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator2 = entrySet.iterator();
		
		while(iterator2.hasNext()) {
			Map.Entry<String , Integer> entry = iterator2.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+","+value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
