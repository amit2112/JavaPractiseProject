package stringTest;

public class patternNew {
	static int i,j,n;
	
	public static void rightTraiangle(int n){
		for(i=0; i<n;i++){
			for(j=0; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void downTriangle(int n){
		for(i=n-1;i>=0;i--){
			for(j=0; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void leftTriangle(int n){
		for(i=0; i<n; i++){
			for(j=2*(n-i); j>=0; j--){
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public static void fullPyramid(int n){
		for(int i=0; i<n; i++){
			for(j=(n-i); j>=0; j--){
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		n=10;
		rightTraiangle(n);
		System.out.println("\n"+"========================"+"\n");
		downTriangle(n);
		System.out.println("\n"+"========================"+"\n");
		leftTriangle(n);
		System.out.println("\n"+"========================"+"\n");
		fullPyramid(n);
	}

}
