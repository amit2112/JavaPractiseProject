package Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class HashmapTest {
	static HashMap<String,Integer> hm =  new HashMap<String, Integer>();
	
	static void getValue(){
		hm.put("Amit", 30);
		hm.put("Vinay", 35);
		hm.put("Pawan", 40);
		hm.put("Varun", 25);
		hm.put("Kajal", 35);
		
		hm.forEach((key,value) -> System.out.println("Key is : "+key+" || "+" Value is : "+value));
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(hm);
		
		
		Set entrySet = tm.entrySet();
		Iterator itr = entrySet.iterator();
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println("Key is : "+me.getKey()+" AND Value is : "+me.getValue());
		}
	}

	public static void main(String[] args) {
		getValue();
	}

}
