package stringTest;

public class FullPyramidPattern {

	static int i,j,n;
	public static void pyramidPatternFull(int n) {
		for (i = 0; i < n; i++) {
			for(j=n-i; j>=1; j--){
			System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pyramidPatternFull1(int n) {
		for (i = 0; i < n; i++) {
			System.out.println();
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		n=10;
		pyramidPatternFull(n);
		
		System.out.println("================================");
		
		pyramidPatternFull1(5);
	}

}
