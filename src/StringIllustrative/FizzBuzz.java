package StringIllustrative;

import java.util.Scanner;

public class FizzBuzz {
	// if multiple of 3 and 5 FizzBuzz
	// if multiple of 3 Fizz
	// if multiple of 5 Buzz
	// if multiple of neither 3 nor 5
	
	public static void fizzBuzz(int n){
		for(int i=1; i<=n; i++){
			if(i%3==0 && i%5==0){
				System.out.println("FizzBuzz");
			}
			else if(i%3==0){
				System.out.println("Fizz");
			}
			else if(i%5==0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		fizzBuzz(n);
	}
}
