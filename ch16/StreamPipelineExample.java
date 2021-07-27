package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamPipelineExample {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("김나리", Member.FEMALE, 20),
				new Member("신용권", Member.MALE, 45),
				new Member("박수미", Member.FEMALE, 27)
				);
		
		//스트림 파이프라인을 이용하여 list 남자 평균 나이 구하기
		//1.파이프라인 사용 X
		Stream<Member> s = list .stream();
		//filer() 호출한 스트림에서 true를 리턴하는 원소들로 새로운 스트림 반환 
		Stream<Member>fs = s.filter((m)->{
			if(m.getGender()==0) {
				 return true;
			}else {
				return false;
			}
		
	});

		//남자인 member의 나이값만 구해오기
				DoubleStream ds =  fs.mapToDouble((m1)->{return m1.getAge();});
				
				//평균 구하기
				double result = ds.average().getAsDouble();
				
				System.out.println(result);
				
		
	}
	
}
