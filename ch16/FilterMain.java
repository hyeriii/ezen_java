package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterMain {

	public static void main(String[] args) {
		// 1. distinct() - �ߺ����� �޼ҵ�, ���ϰ�ü���� �Ǻ��Ѵٴ� �� 
		List<String> list = Arrays.asList("ȫ�浿","ȫ���","ȫ���",new String("ȫ�浿"),"ȫȫȫ");
		
		
		
		
		
		//distinct()�� Object�� Hashcode()�� �̹� stream�� �����Ѵٸ� 
		//equals()�� ����� true�̸� �ߺ���ü 
		//String Ŭ������ equals()�� �ּҰ� �ٸ����� �����Ͱ� ������ true
		System.out.println("list size : "+list.size());
		
		//list.stream()�������� ��Ʈ���� �̿��Ͽ� �ߺ��Ǵ� ��ü�� ������ ��Ʈ���� sStream�� ��´�
		Stream<String> sStream = list.stream().distinct();
		
		sStream.forEach((s)->{System.out.println(s);});
		
		
		System.out.println("----------------------------------------");
		//Member Ŭ���� equals�� ������ �����ʾ����Ƿ� �ʵ� ������ ���Ƶ� �ּҰ� �ٸ��� equals�� ����� false�� ����
		Member m1 = new Member("ȫ�浿",Member.MALE,30);
		Member m2 = new Member("ȫ���",Member.FEMALE,20);
		Member m3 = new Member("ȫ�浿",Member.MALE,30);
		
		//m1,m3�� ������ �ʵ��� �����Ͱ� ������ equals(������ �ȵ� ������)�� ����� false�� ���� 
		List<Member> mList = Arrays.asList(m1,m2,m3);
		
		Stream<Member> mStream = mList.stream().distinct();
		
		System.out.println(m1.equals(m3));
		
		
		mStream.forEach((m)->{System.out.println(m.getName());});
		
		//filter() - predicate()�Լ��� �������̽��� �̿��Ͽ� ������ true�� ���ҵ��� ���ο� stream�� �������� 
		
		
		//mList ���ҵ� �߿��� �ߺ��Ǵ� �̸��� ���� ���Ҹ� ������ �� �������θ� �̷���� stream������ 
		Stream<Member> fStream = mList.stream().distinct().filter((m)->{return m.getGender() == 1;});
		System.out.println("----------------------");
		fStream.forEach((m)->{System.out.println(m.getName());});
		
		System.out.println("----------------------");
		
		
		
	}

}
