package ch15;

public class Student {

	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override 
	public int hashCode() {
		//정수값 출력됨 
		
		return studentNum; 
	}
	
	/*
	 * @Override public boolean equals(Object obj) {
	 * 
	 * 
	 * if(obj instanceof Student) {
	 * 
	 * 
	 * if() {
	 * 
	 * } } }
	 */
	
	
}
