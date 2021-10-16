package AskedInInterview;

import java.util.Arrays;


//Return max occurring character which comes alphabetically first.
public class MaxOccurringChar {
	String str = "tester";
	String str1 = "";
	
	public char getDuplicate(){
		for(int i=0; i<=str.length()-1; i++){
			for(int j=i+1; j<=str.length()-1; j++){
			if(str.charAt(i) == str.charAt(j) && i!=j){
				str1+=str.charAt(j);
				System.out.println("Duplicates are : "+str.charAt(j));
				}
			}
		}
		
		char[] arr = new char[str1.length()];
		arr = str1.toCharArray();
		Arrays.sort(arr);
		
		return arr[0];
	}

	public static void main(String[] args) {
		MaxOccurringChar max = new MaxOccurringChar();
		System.out.println(max.getDuplicate());
	}
}
