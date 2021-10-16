package stringTest;

public class SortArray1 {
	static int arr[] = {4,2,1,5,3};
	
	public static void ascendingSort(){
		for(int i=0; i< arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				int temp=0;
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	
	
	
	
	
	
	public static void descendingSort(){
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				int temp = 0;
				if(arr[i] < arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Ascending sort is:- ");
		ascendingSort();
		System.out.println("\n"+"Ascending sort is:- ");
		descendingSort();
	}

}
