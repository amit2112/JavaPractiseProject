package stringTest;

import java.util.Arrays;

public class SortArray {
	static int arr[] = {4,2,1,5,3};
	
	public static void arraySortAscending(){
		Arrays.sort(arr);
		System.out.println("Sorted Array in Ascending :- "+"\n"+Arrays.toString(arr));
	}
	
	public static void arraySortAscending1(){
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				int temp =0;
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void arraySortDescending(){
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				int temp =0;
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		arraySortAscending();
		System.out.println("Ascending array :- ");
		arraySortAscending1();
		System.out.println("\n"+"Descending array :- ");
		arraySortDescending();
	}
}
