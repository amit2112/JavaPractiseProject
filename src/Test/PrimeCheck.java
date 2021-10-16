package Test;

public class PrimeCheck {
	static boolean isPrime=false;
	static boolean flag=false;
	static int a=1, b=10;
	
	public static void checkPrime(int num){
		for(int i=2; i<=num/2; i++){
			if(num%i==0){
				isPrime=true;
			}
		}
		if(!isPrime){
			System.out.println("Number "+num+" is prime");
		}
		else{
			System.out.println("Number "+num+" is not prime");
		}
	}

	public static void checkPrimeInRange(){
		for(int i=a; i<=b; i++){
			if(i==0 || i==1){
				continue;
			}
			flag=false;
			for(int j=2; j<=i/2; j++){
				if(i%j==0){
					flag=true;
				}
			}
			if(!flag){
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		checkPrime(4);
		checkPrimeInRange();
	}
}