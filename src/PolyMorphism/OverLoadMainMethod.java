package PolyMorphism;

public class OverLoadMainMethod {
	public static void main(String[] args) {
		System.out.println("Hello from Main");
		OverLoadMainMethod.main("Geek");
	}
	
	public static void main(String arg1){
		System.out.println("Hi "+arg1);
		OverLoadMainMethod.main("Dear Geek", "My Geek");
	}
	
	public static void main(String arg1, String arg2){
		System.out.println("Hi "+arg1+", "+arg2);
	}

}
