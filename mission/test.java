package mission;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
		String today = format.format(date);
		System.out.println(today);
	}

}
