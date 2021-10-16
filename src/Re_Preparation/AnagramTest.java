package Re_Preparation;

import java.util.Arrays;

public class AnagramTest {
	public static boolean isAnagram(String Str1, String Str2){
		char[] arr1 = Str1.toCharArray();
		char[] arr2 = Str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		String Str1 = "state";
		String Str2 = "taste";
		System.out.println(isAnagram(Str1, Str2));
	}
}