package TestWork;

public class Pattern {
	
	public static void leftPattern(int n){
		for (int i=0; i<n; i++){
			// outer loop for rows
			for (int y = 2*(n-i); y>= 0; y--) {
				System.out.print(" ");
				}
				// inner loop for columns
				for (int z = 0; z <= i; z++) {
					// To prints stars
					System.out.print("* ");
				}
				// Cursor goes to the new line after printing each line.
				System.out.println();
			}
	}
	
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
	
	public static void fullPattern(int n){
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
	
	public static void main(String args[]) {
		// x for rows, y for columns, and row denotes the number of rows to
		// print
		int n = 5;
		Pattern.leftPattern(n);
		System.out.println("=================================");
		Pattern.rightPattern(n);
		System.out.println("=================================");
		Pattern.downPattern(n);
		System.out.println("=================================");
		Pattern.fullPattern(n);
	}
	
}