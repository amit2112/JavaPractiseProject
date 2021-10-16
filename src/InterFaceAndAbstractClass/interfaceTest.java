package InterFaceAndAbstractClass;

interface In1 {
	final int a = 10;

	void display();
	
	default void display(String str){
		System.out.println(str);
	}
}

class interfaceTest implements In1 {
	
	@Override
	public void display() {
		System.out.println("Geek");
	}

	public static void main(String[] args) {
		interfaceTest it = new interfaceTest();
		it.display();
		System.out.println("Value of a : "+a);
		
		it.display("Hey GM!");
	}
}
