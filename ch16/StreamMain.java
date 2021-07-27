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
		
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		
		//반복자 iterator 사용하여 원소에 반복접근
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			//컬렉션의 원소 반복 접근에 개발자가 직접 관여함 
			String str = i.next();
			System.out.println(str);
		}
		
		//스크립을 이용하여 원소에 반복접근
		//개발자가 직접 반복에 관여하지 않고 개발자는 반복 접근할때 무슨 실행을 할지에 대해서만 지시하면됨 
		Stream<String> stream = list.stream();
		stream.forEach((str)->{System.out.println(str);});
		
		
		//intStream - 숫자 범위의 스트림을 얻어오기
		//1~100까지의 숫자를 배열로 얻어오겠다
		IntStream is = IntStream.rangeClosed(1, 100);
		// IntStream.range(1, 100); -> 100미포함
		
		is.forEach((temp)-> {System.out.println(sum+=temp);});
		
		
		//디렉토리 목록 스트림 얻어오기
		Path path = Paths.get("D:/B_jhr/java_jhr/javaproject/src");
		try {
			//list(path)해당 경로에 있는 모든 폴더와 파일에 대한 목록 얻어오는 메소드
			Stream<Path> pStream = Files.list(path);
			//폴더 역시 file로 인식됨
			//때문에 fileName으로 폴더 이름 얻어옴 
			pStream.forEach((p)->{System.out.println(p.getFileName());});
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		//스트림을 이용해서 텍스트 파일 내용 한줄씩 열어오기 
		Path path2 = Paths.get("src/ch16/sample.txt");
		Stream<String> sStream ;
		 
		
		try {
			//sample.txt 파일 한줄씩 읽어오기
			//해당 path정보에 파일을 찾아 모든 라인을 stream으로 얻어옴 
			sStream = Files.lines(path2);
			sStream.forEach((s)->{System.out.println(s);});
			
		} catch (IOException e) {


			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
