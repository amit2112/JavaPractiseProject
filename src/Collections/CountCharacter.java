package Collections;

import java.util.HashMap;

public class CountCharacter {
	
	public static void countChar(String str){
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] Characters = str.toLowerCase().toCharArray();
		for(char c: Characters){
		if(hm.containsKey(c)){
			hm.put(c, hm.get(c)+1);
			}
		else{
			hm.put(c, 1);
			}
		}
		
		hm.forEach((Key,Value)-> System.out.println(Key+" : "+Value));
	}

	public static void main(String[] args) {
		String str =  "GeeksforGeeks";
		countChar(str);
	}

}
