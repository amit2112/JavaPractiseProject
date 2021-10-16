package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapTest {
	public static HashMap<String, Integer> hm = new HashMap<String, Integer>();
	
	public static void mapUtility(){
		hm.put("Sachin", 25);
		hm.put("Amit", 30);
		hm.put("Arnab", 27);
		hm.put("Anjan", 35);
		hm.put("Sunil", 52);
		hm.put("Alex", 32);
		hm.put("Scott", 21);
		
		System.out.println(hm);
		hm.replace("Arnab", 27, 38);
		System.out.println(hm);
		hm.replace("Sachin", 22);
		System.out.println(hm);
		
		for (Map.Entry<String, Integer> i : hm.entrySet()) {
			System.out.println(i.getKey()+" hashcode :- "+i.hashCode());
		}
		
		hm.forEach((key, value)-> System.out.println(key+"Key = "+"Value "+value));
		
		System.out.println("Check if Hashmap is empty : "+hm.isEmpty());
	}

	public static void main(String[] args) {
		
		mapUtility();
	}
}