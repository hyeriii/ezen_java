package ch15;

import java.util.ArrayList;
import java.util.List;


public class ListMain {

	public static void main(String[] args) {
		//List 인터페이스를 사용하는 컬렉션 프레임워크
		
		//1. ArrayList 클래스
		//초기 용량 10이며 초과시 자동으로 증가
		//제네릭을 사용하여 객체 생성시 원소타입을 결정함
		ArrayList<String> sList = new ArrayList<>();
		List<String> listInterface = sList;

		//list에 객체 추가 메소드
		
		//list의 맨 뒤에 원소 추가		
		listInterface.add("1번째 원소");
		//sList에 정의된 add매소드를 이용해 "1번째 원소"값을 넣는다.
		listInterface.add("2번째 원소");
		listInterface.add("3번째 원소");
		
		String value1 = listInterface.get(0);
		//0인덱스에 저장된 String 객체를 가져온다 
		String value2 = listInterface.get(1);
		String value3 = listInterface.get(2);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//특정 인덱스에 원소 추가, 원래 있던 원소들은 뒤로 하나씩 밀린다
		listInterface.add(1,"4번째 원소");
		value2 = listInterface.get(1);
		System.out.println(value2);
		
		value3 = listInterface.get(2);
		System.out.println(value3);
		
		
		//특정 인덱스의 원소값 변경
		listInterface.set(1, "5번째 원소");
		
		value2 = listInterface.get(1);
		System.out.println(value2);
		
		value3 = listInterface.get(2);
		System.out.println(value3);
		
		
		
		//list에서 객체 검색 
		//contains(E e)
		boolean result = listInterface.contains("1번째 원소");
		System.out.println(result);
		
		
		//isEmplty() - 컬렉션이 비워있으며 true
		result = listInterface.isEmpty();
		System.out.println(result);
		
		//size() - 컬렉션의 원소 객수를 반환 
		int size = listInterface.size();
		System.out.println(size);
		
		//clear() - 컬렉션을 비워주는 메소드
		listInterface.clear();
		//확인
		size = listInterface.size();
		System.out.println(size);
		
		
		
		//list의 맨 뒤에 원소 추가		
		listInterface.add("1번째 원소");
		listInterface.add("2번째 원소");
		listInterface.add("3번째 원소");
		listInterface.add("3번째 원소");
		listInterface.add("4번째 원소");
		
		//remove(int i) - 해당 인덱스 원소의 참조를 제거하고 제거한 참조값반환
		//컬렉션은 중간에 데이터가 비워지면 뒤에서 앞으로 당여서 빈칸없이 유지
		Systrem.out.println("*********");
		String removeObj = listInterface.remove(1);
		System.out.println(removeObj);
		System.out.println(listInterface.get(1));
		
		//remove(E e) - 해당 객체가 존재하면 삭제여부 true, false 반환
		//중복되는 경우 앞에서부터 최초 객체를 삭제하고 뒤에서 앞으로 당겨준다.
		result = listInterface.remove("3번째 원소");
		if(result) {
			System.out.println(listInterface.get(1));
			System.out.println(listInterface.get(2));
		}
	
		
		
		
	}

}
