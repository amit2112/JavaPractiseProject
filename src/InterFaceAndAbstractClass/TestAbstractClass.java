package InterFaceAndAbstractClass;

abstract class ABS{
	abstract void sum(int x, int y);
	
	public void product(int x, int y){
		System.out.println("Product is : "+(x*y));
	}
}

class Derived extends ABS{
	int sum;
	
	@Override
	void sum(int x, int y) {
		System.out.println("Sum is : "+(sum=x+y));
	}
}

class TestAbstractClass {

	public static void main(String[] args) {
		ABS ab = new Derived();
		ab.sum(1, 3);
		ab.product(2, 6);
		
		int i=5;
		i=i++;
		System.out.println("Result is : "+i);
	}

}
