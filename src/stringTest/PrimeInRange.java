package stringTest;

public class PrimeInRange {
	static int a=1, b=10,i,j,flag;
	
	public static void checkPrime(){
		for(i=a; i<=b; i++){
			if(i==0 || i==1)
			continue;
			
			flag=1;
			for(j=2; j<=i/2; j++){
				if(i%j==0){
					flag=0;
					break;
				}
			}
			if(flag==1){
				System.out.println(i);
				}
		}
	}

	public static void main(String[] args) {
		checkPrime();
	}

}
