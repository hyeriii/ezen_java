package ch15;

public class Student1 implements  Comparable<Student1> {

	
	public String id;
	public int score;
	
	public Student1(String id, int score) {
		this.id = id;
		this.score = score;
	}
	@Override
	public int compareTo(Student1 o) {
		if(o.score < score) {
			return 1;
		}else if(o.score > score) {
			return -1;
		}else {

			return 0;	
		}
	}
	

}
