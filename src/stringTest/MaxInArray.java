package stringTest;

public class MaxInArray {
	static int arr[] = {1,4,2,78,9,0};
	static int max = arr[0];
	public static void maxValue(){
		for(int i=1; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("Maximum value is:- "+max);
	}
	
	public static void minValue(){
		for(int i=1; i<arr.length; i++){
			if(arr[i]<max){
				max = arr[i];
			}
		}
		System.out.println("Maximum value is:- "+max);
	}
	
	public static void main(String[] args) {
		maxValue();
		minValue();
	}

}
