package Defaults;

public class Main {

	public static void main(String[] args) {
		
		Vehicle v1 = new Bike();
		v1.horns();
		Vehicle.speed();
		
		Vehicle v2 = new Car();
		v2.horns();
		Vehicle.speed();

	}

}
