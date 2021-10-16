package stringTest;

public class PrimeCheck1 {
	static boolean isPrime=false;
	
	public static void checkPrime(int n){
		for(int i=2; i<=n/2; i++){
			if(n%i==0){
				isPrime=true;
				break;
			}
		}
		
		if(!isPrime){
			System.out.println(n+" is prime");
		}
		else{
			System.out.println(n+" is not prime");
		}
	}
	
	public static void main(String[] args){
		int n=1;
		checkPrime(n);
	}

}
