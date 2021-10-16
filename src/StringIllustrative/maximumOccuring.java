package StringIllustrative;

import java.util.HashMap;

import org.apache.poi.util.StringUtil;

public class maximumOccuring {
	static String str = "javaca";
	
	public static void getMaxOccurence(char character) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int temp = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == character) {
				hm.put(str.charAt(i), ++temp);
			}
		}
		
		int number = StringUtil.countMatches(str, character);
		System.out.println("Count of character "+character+" = "+number);

		hm.forEach((key, value) -> System.out.println("Key : " + key + " Value : " + value));
	}

	public static void main(String[] args) {
		getMaxOccurence('a');
	}

}
