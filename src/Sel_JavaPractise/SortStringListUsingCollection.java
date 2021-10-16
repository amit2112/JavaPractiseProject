package Sel_JavaPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Write code to sort the list of strings using Java collection?
public class SortStringListUsingCollection {
	static String arr[]={"Jatin","Arnab","Amit","Vinod","Xavier"};
	static List<String> l1= new ArrayList<String>(Arrays.asList("Jatin","Arnab","Amit","Vinod","Xavier"));
	
	public static void sortStringListUsingCollection(){
		Collections.sort(l1);
		l1.forEach(value -> System.out.println("Sorted values are :- "+value));
		
		Collections.reverse(l1);
		l1.forEach(value -> System.out.println("Reverse Sorted values are :- "+value));
		
		Collections.sort(Arrays.asList(arr));
		System.out.println("Ascending Array is :- "+Arrays.toString(arr));
		
		Collections.reverse(Arrays.asList(arr));
		System.out.println("Descending Array is :- "+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		sortStringListUsingCollection();
	}
}
