package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MappingMain {

	public static void main(String[] args) {
		List<String> sList = Arrays.asList("java program","C program","python program","html program","javascript program");

		
		sList.stream().flatMap(s->Arrays.stream(s.split(" ")))
		.forEach((s)->System.out.println(s));
		
		
		//flatMap()를 이용하여 각 원소의 공백 기준 분할하여 스트림을 얻어오고 중복 텍스트 제거
		System.out.println("---------");
		sList.stream().flatMap(s->Arrays.stream(s.split(" "))).distinct()
		.forEach((s)->System.out.println(s));
		

		
	}

}
