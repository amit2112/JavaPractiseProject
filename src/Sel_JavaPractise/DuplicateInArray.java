package Sel_JavaPractise;

import java.util.ArrayList;
import java.util.List;

//Write code to filter duplicate elements from an array and print as a list?
public class DuplicateInArray {
	static int arr[]={1,4,2,4,2,1};
	static List<Integer> l1 = new ArrayList<Integer>();
	static int temp;
	public static void returnListOFDuplicate(){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
			if(arr[i]==arr[j] && i!=j){
				temp=arr[j];
				}
			}
			if(l1.contains(temp)){
				
			}
			else{
				l1.add(temp);
			}
		}
		
		l1.forEach(value -> System.out.println("Value is :- "+value));
	}

	public static void main(String[] args) {
		returnListOFDuplicate();
	}
}
