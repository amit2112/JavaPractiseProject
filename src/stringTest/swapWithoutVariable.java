package stringTest;

public class swapWithoutVariable {
	static int a=5, b=4;
	public static void swap(){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is :- "+a+" b is :- "+b);
	}

	public static void main(String[] args) {
		swap();
	}

}
