package Re_Preparation;

public class FibonacciSeries {
	public static void getFibonacci(int num){
		int n1 =0;
		int n2 =1;
		System.out.print(n1+" "+n2+" ");
		
		for(int i=2; i<num; i++){
			int nextnum = n1+n2;
			n1=n2;
			n2=nextnum;
			System.out.print(nextnum+" ");
		}
	}

	public static void main(String[] args) {
		int num = 5;
		getFibonacci(num);
	}

}
