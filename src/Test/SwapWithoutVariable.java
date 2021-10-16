package Test;

public class SwapWithoutVariable {
	public static void swapNumbers(){
		int a=10, b=15;
		System.out.println("Previously, a is :- "+a+" and b is :- "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Afterwards, a is :- "+a+" and b is :- "+b);
	}

	public static void main(String[] args) {
		swapNumbers();
	}

}
