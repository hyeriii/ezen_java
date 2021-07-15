package ch07;

public class Car {
	
		Tire tire;
		
		Car(Tire tire){
			this.tire =tire;
		}

		public void run() {
			tire.run();
		}
}
