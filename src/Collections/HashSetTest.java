package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	public static HashSet<String> hs = new HashSet<String>();
	
	public static void setUtility(){
		hs.add("Amit");
		hs.add("Sachin");
		hs.add("Aman");
		
		hs.remove("Aman");
		hs.add("Saurabh");
		
		//hs.forEach((key)-> System.out.println("Keys are : "+hs));
		
		Iterator<String> it =  hs.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}

		System.out.println("\n"+"Verify if element is present : "+hs.contains("Amit"));
		
		//hs.clear();
		System.out.println("HashSet elements are : "+hs);
		System.out.println("Check if HashSet is empty : "+hs.isEmpty());
	}
	
	public static HashSet<Integer> hs1 = new HashSet<Integer>();
	public static HashSet<Integer> hs2 = new HashSet<Integer>();
	public static void setEquality(){
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);

		hs2.add(1);
		hs2.add(2);
		hs2.add(3);
		
		System.out.println("Verify if the two sets are equal : "+hs1.equals(hs2));
	}

	public static void main(String[] args) {
		setUtility();
		System.out.println();
		
		setEquality();
	}

}
