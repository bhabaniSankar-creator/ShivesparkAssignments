package practice;

public abstract class Vechile {
	public abstract void showWheels();
	
	public static void main(String[] args) {
		Vechile vechile = new Bus();
		vechile.showWheels();
	}

}
class Bike extends Vechile{

	@Override
	public void showWheels() {
		System.out.println("Bike has 2 wheels");
	}

}
class Bus extends Vechile{

	@Override
	public void showWheels() {
		System.out.println("Bus has 4 wheels");
		
	}

}

class Auto extends Vechile{

	@Override
	public void showWheels() {
		System.out.println("Auto has 3 wheels");
	}

}

class Car extends Vechile{

	@Override
	public void showWheels() {
		System.out.println("Car has 4 wheels");
	}

}

class Main{
	
}

