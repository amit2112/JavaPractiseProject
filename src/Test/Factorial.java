package Test;

public class Factorial {
	
	public static void factorial(int num){
		int temp=1;
		for(int i=1; i<=num; i++){
			temp=temp*i;
		}
		System.out.println("Factorial of "+num+" is : "+temp);
	}

	public static void main(String[] args) {
		factorial(5);
	}

}
