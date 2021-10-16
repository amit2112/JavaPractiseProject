package StringIllustrative;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {
	static String str = "malyalam";

	public static void printDuplicate(){
		StringBuilder sb = new StringBuilder();
		//char arr[] = str.toCharArray();
		//Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<str.length(); i++){
			for(int j=0; j<str.length(); j++){
				if(i!=j && str.charAt(i)==str.charAt(j)){
					sb.append(str.charAt(i));
				}
			}
		}
		
		System.out.println("Duplicated String is : "+sb);
	}
	
	public static void main(String[] args) {
		printDuplicate();
	}

}
