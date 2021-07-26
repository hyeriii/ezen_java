package ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		//Map -> 컬렉션, 키와 값을 쌍으로 가지는 map.entity객체를 원소로 다루는 구조 
		//map에서는 key는 set과 동일하게 중복 허용이 안되므로 
		//주로 이미 hashcode와 equals 메소드가 정의되어 있는 String 타입이 가장 많이 사용됨 
		
		
		//key -> String ,  valus -> Integer 인 map.entry가 원소로 올 수 있다
		Map<String, Integer> map = new HashMap<>();
		
		//map.entry 객체를  map 컬렉션에 추가 
		Integer result = map.put("홍길동", 17);
		System.out.println(map.size());
		
		
		//map 의 key는 중복을 허용하지 않기 때문에 String 을 key의 타입으로 두는 경우 
		//Stirng 은 주소값이 아니라 데이터를 이용하여 동등객체를 판별하도록 재정의가 되어있으므로 데이터가 같으면 map 추가 안됨 
		//hashcode와 equals 이용해서 key값이 중복임을 알았냈으므로 추가 안됨 
		map.put(new String("홍길동"), 20);
		System.out.println(map.size());
		
		map.put("홍길동2", 20);
		map.put("홍길동3", 30);
		map.put("홍길동4", 20);
		
		//containsKey(K k) -> 일치하는 key객체가 존재하는 여부를 반환 
		boolean result2 = map.containsKey("홍길동");
		System.out.println(result2);
		
		//containsValue(V v) - > 모든타입을 인자로 넘길수 있으며 value객체가 존재하는지 여부 반환 
		result2 = map.containsValue("test");
		System.out.println(result2);
		
		//get(key) - > 인자로 넘어가느 key와 일치하는 map.entry의 value값 반환 
		Integer i = map.get("홍길동");
		System.out.println(i);
		
		//map에 대입되어 있는 모든 key를 set으로 반환 
		Set<String> keySet = map.keySet();
		
		//set에 대입되어 있는 모든 key를 한줄로 정렬
		Iterator<String> iterator = keySet.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println(key+","+value);
			
		}
		
		//entrySet() - Map.entry객체를 set으로 반환
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
