package ch07;

public class Tv2 extends Machine2 {

	@Override
	public void trunOn() {
		System.out.println("tv on");
	}
	
	@Override
	public void trunOff() {
		System.out.println("tv off");
	}
}
