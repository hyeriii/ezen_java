package ch07;

public class Radio extends Machine {
	String brand;
	String model;
	String no;
	
	public void turnOn() {
		System.out.println("radio on");
	}

	public void turnOff() {
		System.out.println("radio off");
	}
}
