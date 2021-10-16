package stringTest;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class RotateArray {
	/*static int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
	static int d = 2;
	static int temp[] = new int[d];

	public static void rotateArray() {
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}

		System.out.println("Original Array");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		//Shifting
		for (int i = 0; i < arr.length - d; i++) {
			arr[i] = arr[i + d];
		}
		
		for (int j=0; j<temp.length; j++) {
			int temp1 = temp[j];
			arr[(arr.length-d)] = temp1;
			d=d-1;
		}
		
		
		System.out.println("\n"+"Rotated Array");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static int arr[]= {1,2,3,4,5,6,7};
	static int d=2;
	static int temp[]= new int[d];
	
	public static void rotateArray(){
		
		for(int i=0; i<d; i++){
			temp[i] = arr[i];
		}
		
		System.out.println("OriginalArray:-");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		for(int i=0; i<arr.length-d; i++){
			arr[i] = arr[i+d];
		}
		
		for(int i=0; i<temp.length; i++){
			arr[(arr.length-d)] = temp[i];
			d=d-1;
		}
		
		System.out.println("\n"+"Rotated Array :- ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		rotateArray();
	}
}