package Test;

public class PatternPrinting {
	
	public static void rightPattern(int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void downPattern(int n){
		for(int i=n-1; i>=0; i--){
			for(int j=0; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void leftPattern(int n){
		for(int i=0; i<n; i++){
			for(int j=2*(n-i); j>=0; j--){
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void fullPyramidPattern(int n){
		for(int i=0; i<n; i++){
			for(int j=(n-i); j>=1; j--){
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void fullPyramidReverse(int n){
		for(int i=0; i<=n-1; i++){
			for(int j=0; j<=i; j++){
				System.out.print(" ");
			}
			for(int k=0; k<=n-1-i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		int n=10;
		rightPattern(n);
		
		System.out.println("====================");
		downPattern(n);
		
		System.out.println("====================");
		leftPattern(n);
		
		System.out.println("====================");
		fullPyramidPattern(n);
		
		System.out.println("======================");
		fullPyramidReverse(n);
	}

}
