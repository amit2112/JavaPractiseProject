package Test;

public class SortArray {
	public static int[] arr = {0,1,2,0,1,2};
	static int temp=0;
	public static void sortAscending(){
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void sortDescending(){
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				int temp=0;
				if(arr[i]<arr[j]){
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		sortAscending();
		System.out.println();
		sortDescending();
	}
}