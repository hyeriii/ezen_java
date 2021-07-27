package ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamPipelineExample {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", Member.MALE, 30),
				new Member("�質��", Member.FEMALE, 20),
				new Member("�ſ��", Member.MALE, 45),
				new Member("�ڼ���", Member.FEMALE, 27)
				);
		
		//��Ʈ�� ������������ �̿��Ͽ� list ���� ��� ���� ���ϱ�
		//1.���������� ��� X
		Stream<Member> s = list .stream();
		//filer() ȣ���� ��Ʈ������ true�� �����ϴ� ���ҵ�� ���ο� ��Ʈ�� ��ȯ 
		Stream<Member>fs = s.filter((m)->{
			if(m.getGender()==0) {
				 return true;
			}else {
				return false;
			}
		
	});

		//������ member�� ���̰��� ���ؿ���
				DoubleStream ds =  fs.mapToDouble((m1)->{return m1.getAge();});
				
				//��� ���ϱ�
				double result = ds.average().getAsDouble();
				
				System.out.println(result);
				
		
	}
	
}
