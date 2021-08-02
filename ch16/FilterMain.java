package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterMain {

	public static void main(String[] args) {
		// 1. distinct() - 중복제거 메소드, 동일객체인지 판별한다는 뜻 
		List<String> list = Arrays.asList("홍길동","홍길순","홍길민",new String("홍길동"),"홍홍홍");
		
		
		
		
		
		//distinct()는 Object의 Hashcode()가 이미 stream에 존재한다면 
		//equals()의 결과가 true이면 중복객체 
		//String 클래스는 equals()를 주소가 다르더라도 데이터가 같으면 true
		System.out.println("list size : "+list.size());
		
		//list.stream()오리지날 스트림을 이용하여 중복되는 객체를 제외한 스트림을 sStream에 담는다
		Stream<String> sStream = list.stream().distinct();
		
		sStream.forEach((s)->{System.out.println(s);});
		
		
		System.out.println("----------------------------------------");
		//Member 클래스 equals가 재정의 되지않았으므로 필드 정보가 같아도 주소가 다르면 equals의 결과가 false인 상태
		Member m1 = new Member("홍길동",Member.MALE,30);
		Member m2 = new Member("홍길순",Member.FEMALE,20);
		Member m3 = new Member("홍길동",Member.MALE,30);
		
		//m1,m3는 논리적인 필드의 데이터가 같으나 equals(재정의 안된 상태임)의 결과가 false인 상태 
		List<Member> mList = Arrays.asList(m1,m2,m3);
		
		Stream<Member> mStream = mList.stream().distinct();
		
		System.out.println(m1.equals(m3));
		
		
		mStream.forEach((m)->{System.out.println(m.getName());});
		
		//filter() - predicate()함수적 인터페이스를 이용하여 리턴이 true인 원소들을 새로운 stream을 생성해줌 
		
		
		//mList 원소들 중에서 중복되는 이름을 가진 원소를 제거한 후 여성으로만 이루어진 stream얻어오기 
		Stream<Member> fStream = mList.stream().distinct().filter((m)->{return m.getGender() == 1;});
		System.out.println("----------------------");
		fStream.forEach((m)->{System.out.println(m.getName());});
		
		System.out.println("----------------------");
		
		
		
	}

}
