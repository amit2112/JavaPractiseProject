package stringTest;

public class DuplicateArray {
	static int arr[] = {1,2,1,3,2,5};
	
	public static void duplicateValues() {
		for(int i=0; i<arr.length-1; i++){
			for(int j = i; j < arr.length; j++) {
				if(arr[i]==arr[j] && (i!=j)){
					System.out.println(arr[j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Duplicate values are:- ");
		duplicateValues();
	}

}
