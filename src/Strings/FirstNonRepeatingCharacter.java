package Strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FirstNonRepeatingCharacter {
	static String str = "geeksforgeeks";

	public static void firstNonRepatingChar(){
		for(int i=0; i<str.length(); i++){
			boolean unique=true;
			for(int j=0; j<str.length(); j++){
				if(i!=j && str.charAt(i)==str.charAt(j)){
					unique=false;
					break;
				}
			}
			
			if(unique){
				System.out.println(str.charAt(i)+" is the first non-repeating character");
				//break;
			}
		}
	}
	
	public static void firstNonRepeatingUsingList(){
		//LinkedList<Character> l1 = new LinkedList<Character>();
		List<Character> l1 = new ArrayList<Character>();
		l1.add(str.charAt(0));

		for(int i=1; i<str.length(); i++){
			if(l1.contains(str.charAt(i))){
				l1.remove(l1.indexOf(str.charAt(i)));
			}
				l1.add(str.charAt(i));
		}
		System.out.println(l1.get(0)+" is the first non repeating character");
	}
	
	public static void main(String[] args) {
		firstNonRepatingChar();
		System.out.println("=========================");
		firstNonRepeatingUsingList();
	}

}
