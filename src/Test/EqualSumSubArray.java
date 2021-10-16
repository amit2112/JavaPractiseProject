package Test;

public class EqualSumSubArray {
	static int arr[]={2, 4, 5, 1, 2, 3};
	static int subLeft[]= new int[arr.length];
	static int subRight[]= new int[arr.length];
	
	
	public static void getIndexOfEqualSumSubArray(){
		int temp=0;
		for(int i=0; i<arr.length; i++){
			temp=temp+arr[i];
			subLeft[i]=temp;
		}
		
		int temp1=subLeft[subLeft.length-1];
		subRight[0]=temp1;
		for(int j=0; j<arr.length-1; j++){
			temp1=temp1-arr[j];
			subRight[j+1]=temp1;
		}
		
		System.out.println();
		System.out.print("Parent Array is : ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.print("Sub-Left Array is : ");
		for (int i : subLeft) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.print("Sub-Right Array is : ");
		for (int i : subRight) {
			System.out.print(i+" ");
		}
		
		for(int i=0; i<subLeft.length; i++){
			for(int j=0; j<subRight.length; j++){
				if(i==j && subLeft[i]==subRight[i]){
					System.out.println();
					System.out.println("Index for the equal sub-array is : "+i+" having value : "+arr[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		getIndexOfEqualSumSubArray();
	}
}