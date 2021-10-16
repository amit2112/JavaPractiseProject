package Test;

import java.util.Scanner;

public class PrimeInRange {
	public static int a=1, b=10, check; 
	public static boolean flag;
	
	public static void primeInRange(){
		System.out.println("Called method primeInRange() ");
		for(int i=a; i<=b; i++){
			if(i==0 || i==1){
				continue;
			}
			else{
				check=1;	
				for(int j=2; j<=i/2; j++){
					if(i%j==0){
						check=0;
						break;
					}
				}
			}
			if(check==1){
				System.out.println(i);
			}
		}
	}
	
	public static void checkPrime(int num){
		flag=false;
		for(int i=2; i<=num/2; i++){
			if(num%i==0){
				flag=true;
				break;
			}
		}
		if(!flag){
			System.out.println("Number "+num+" is a prime number");
		}
		else{
		System.out.println("Number "+num+" is not a prime number");
		}
	}

	public static void main(String[] args) {
		primeInRange();
		System.out.println("=================");

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter number to check Prime.. ");
		while ((num = sc.nextInt()) > 0) {
			checkPrime(num);
		}
		{
			System.out.println("Number not within the valid range!");
			sc.close();
			System.exit(1);
		}
	}
}