package stringTest;

public class Factorial {
	static int n=5,val=1;	
	
	public static void factorial(){
		for(int i=1; i<=n; i++){
			val=val*i;
		}
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		factorial();
	}

}
