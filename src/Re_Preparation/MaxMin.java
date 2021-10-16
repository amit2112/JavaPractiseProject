package Re_Preparation;

public class MaxMin {
	public static int getMax(int[] arr){
		int max = arr[0];
		for(int i=0; i<arr.length; i++){
			if(max < arr[i]){
				max=arr[i];
			}
		}
		
		return max;
	}
	
	public static int getMin(int[] arr){
		int min = arr[0];
		for(int i=0; i<arr.length; i++){
			if(min > arr[i]){
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int arr[] = {1,4,2,5,3};
		System.out.println(getMax(arr));
		System.out.println(getMin(arr));
	}

}
