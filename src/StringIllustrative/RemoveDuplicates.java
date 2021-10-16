package StringIllustrative;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	static String str = "java";
	
	public static void removeDuplicates(){
		char ch[] = str.toCharArray();
		StringBuilder str1 = new StringBuilder();
		Set<Character> s =  new LinkedHashSet<Character>();
		for (char c : ch) {
			if(s.add(c)){
				str1.append(c);
			}
		}
		
		System.out.println("Non-Duplicate string is : "+str1);
	}

	public static void main(String[] args) {
		removeDuplicates();
	}

}
