package ch16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {

	public static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("ȫ�浿1");
		list.add("ȫ�浿2");
		list.add("ȫ�浿3");
		list.add("ȫ�浿4");
		
		//�ݺ��� iterator ����Ͽ� ���ҿ� �ݺ�����
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			//�÷����� ���� �ݺ� ���ٿ� �����ڰ� ���� ������ 
			String str = i.next();
			System.out.println(str);
		}
		
		//��ũ���� �̿��Ͽ� ���ҿ� �ݺ�����
		//�����ڰ� ���� �ݺ��� �������� �ʰ� �����ڴ� �ݺ� �����Ҷ� ���� ������ ������ ���ؼ��� �����ϸ�� 
		Stream<String> stream = list.stream();
		stream.forEach((str)->{System.out.println(str);});
		
		
		//intStream - ���� ������ ��Ʈ���� ������
		//1~100������ ���ڸ� �迭�� �����ڴ�
		IntStream is = IntStream.rangeClosed(1, 100);
		// IntStream.range(1, 100); -> 100������
		
		is.forEach((temp)-> {System.out.println(sum+=temp);});
		
		
		//���丮 ��� ��Ʈ�� ������
		Path path = Paths.get("D:/B_jhr/java_jhr/javaproject/src");
		try {
			//list(path)�ش� ��ο� �ִ� ��� ������ ���Ͽ� ���� ��� ������ �޼ҵ�
			Stream<Path> pStream = Files.list(path);
			//���� ���� file�� �νĵ�
			//������ fileName���� ���� �̸� ���� 
			pStream.forEach((p)->{System.out.println(p.getFileName());});
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		//��Ʈ���� �̿��ؼ� �ؽ�Ʈ ���� ���� ���پ� ������� 
		Path path2 = Paths.get("src/ch16/sample.txt");
		Stream<String> sStream ;
		 
		
		try {
			//sample.txt ���� ���پ� �о����
			//�ش� path������ ������ ã�� ��� ������ stream���� ���� 
			sStream = Files.lines(path2);
			sStream.forEach((s)->{System.out.println(s);});
			
		} catch (IOException e) {


			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
