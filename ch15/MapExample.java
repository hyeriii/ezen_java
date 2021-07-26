package ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		
		//������, ��� ���� ��� 
		//�ְ� ������ �ش� ���̵� ��� 
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			if(value > maxScore) {
				maxScore = value ;
				name = key;
				
			}
			totalScore += value;
		}
		
		System.out.println("������� : "+ totalScore/3 );
		System.out.println("�ְ����� : "+ maxScore );
		System.out.println("�ְ������� ���� ���̵� : "+ name );
		
	}

}
