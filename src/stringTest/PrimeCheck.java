package stringTest;

public class PrimeCheck {
	static int n=2;
	static boolean flag =false;
	
	public static void checkPrime(){
		for(int i=2; i<=n/2; i++){
			if(n%i==0){
				flag=true;
				break;
			}
		}
		
		if(!flag){
			System.out.println("Number "+n+" is prime.");
		}
		else{
			System.out.println("Number "+n+" is not prime.");
		}
	}

	public static void main(String[] args) {
		checkPrime();
	}

}
