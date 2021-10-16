package Strings;

import java.util.Scanner;

public class ReverseString {
	static String str1 = "Hello Everyone";
	
	public static void revStringByWord(String str){
		String temp[] = str.split(" ");
		for(int i=temp.length-1; i>=0; i--){
			System.out.print(temp[i]+" ");
		}
		System.out.println();
	}
	
	public static void revStringByChar(String str){
		char temp[] = str.toCharArray();
		for(int i=temp.length-1; i>=0; i--){
			System.out.print(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		revStringByWord(str);
		
		revStringByChar(str);
	}

}
