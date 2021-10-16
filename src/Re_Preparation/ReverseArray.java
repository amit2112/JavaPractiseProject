package Re_Preparation;

public class ReverseArray {
	public static void revArray(int arr[]){
		int reversedArray[] = new int[arr.length];
		System.out.println("Original Array:- ");
		for (int i : arr) {
			System.out.print(i);
		}
		
		System.out.println();
		
		System.out.println("Reversed Array:- ");
		//Working
		/*for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				int temp=0;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				reversedArray[i] = arr[j];
			}
		}*/
		
		//More efficient
		int j = arr.length-1;
		for(int i=0; i<arr.length/2; i++){
				int temp=0;
				temp = arr[i];
				arr[i] = arr[j-i];
				arr[j-i] = temp;
		}
		
		
		for (int i : arr) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,3,5,2};
		revArray(arr);
	}

}
