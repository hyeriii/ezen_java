package ch07;

public class Home {

	public String door ;
	public String window;
	public Machine machine;
	
	public void turnOn(Machine machine) {
		machine.turnOn();
	}
	
	public void turnOff(Machine machine) {
		machine.turnOff();
	}
}
