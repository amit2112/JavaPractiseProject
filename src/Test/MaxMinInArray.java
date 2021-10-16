package Test;

public class MaxMinInArray {
	public static int[] arr = {1,6,3,7,4};
	static int temp=arr[0];
	public static void minValue(){
		for(int i=0; i<arr.length; i++){
				if(arr[i]<temp){
					temp=arr[i];
			}
		}
		System.out.println("Minimum value is :- "+temp);
	}
	
	public static void maxValue(){
		for(int i=0; i<arr.length; i++){
				if(arr[i]>temp){
					temp=arr[i];
			}
		}
		System.out.println("Maximum value is :- "+temp);
	}

	public static void main(String[] args) {
		minValue();
		maxValue();
	}

}
