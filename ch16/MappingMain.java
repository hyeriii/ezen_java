package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MappingMain {

	public static void main(String[] args) {
		List<String> sList = Arrays.asList("java program","C program","python program","html program","javascript program");

		
		sList.stream().flatMap(s->Arrays.stream(s.split(" ")))
		.forEach((s)->System.out.println(s));
		
		
		//flatMap()�� �̿��Ͽ� �� ������ ���� ���� �����Ͽ� ��Ʈ���� ������ �ߺ� �ؽ�Ʈ ����
		System.out.println("---------");
		sList.stream().flatMap(s->Arrays.stream(s.split(" "))).distinct()
		.forEach((s)->System.out.println(s));
		

		
	}

}
