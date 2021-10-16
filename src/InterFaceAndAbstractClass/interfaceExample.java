package InterFaceAndAbstractClass;

interface Vehicle {
	int x=10;
	void changeGear(int a);

	void speedUp(int a);

	void applyBrakes(int a);
}

class Bicycle implements Vehicle {
	int speed;
	int gear;

	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
	}

	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	public void printStates() {
		System.out.println("speed : " + speed + " gear : " + gear);
	}
}

class Car implements Vehicle {
	int speed;
	int gear;

	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
	}

	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	public void printStates() {
		System.out.println("speed : " + speed + " gear : " + gear);
	}
}

class Bike implements Vehicle {
	int speed;
	int gear;

	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
	}

	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	public void printStates() {
		System.out.println(this.getClass().getCanonicalName()+" speed : " + speed + " gear : " + gear);
	}
}

class interfaceExample {

	public static void main(String[] args) {
		Bicycle b = new Bicycle();
		b.changeGear(4);
		b.speedUp(40);
		b.applyBrakes(5);
		b.printStates();

		Car c = new Car();
		c.changeGear(5);
		c.speedUp(100);
		c.applyBrakes(10);
		c.printStates();

		Bike bk = new Bike();
		bk.changeGear(3);
		bk.speedUp(90);
		bk.applyBrakes(10);
		bk.printStates();
	}
}