package stringTest;

public class pyramidPattern {
	static int i, j;

	public static void pyramidPatternRight(int n) {
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pyramidPatternDown(int n) {
		for (i = n - 1; i >=0; i--) {
			for (j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void pyramidPatternLeft(int n) {
		for (i = 0; i < n; i++) {
			for(j=2*(n-i); j>=0; j--){
			System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
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
	
	public static void pyramidPatternFullReverse(int n) {
		for (i = 0; i <=n-1; i++) {
			for(j=0; j<=i; j++){
			System.out.print(" ");
			}
			for (j = 0; j <=n-1-i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println("\n"+"Right pyramid");
		pyramidPatternRight(n);
		System.out.println("\n"+"Down Pyramid");
		pyramidPatternDown(n);
		System.out.println("\n"+"Left Pyramid");
		pyramidPatternLeft(n);
		System.out.println("Full Pyramid");
		pyramidPatternFull(n);
		System.out.println("Full Pyramid Reverse");
		pyramidPatternFullReverse(n);
	}
}
