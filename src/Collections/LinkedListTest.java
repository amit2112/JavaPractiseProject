package Collections;

import java.util.LinkedList;

public class LinkedListTest {
	
	static LinkedList<String> ll = new LinkedList<String>();
	public static void linkedListUtils(){
		ll.add("Amit");
		ll.add(1, "Shiva");
		ll.add(2, "Arnab");
		ll.add(1, "Aman");
		ll.addFirst("Abhinav");
		ll.addLast("Vaibhav");
		
		ll.set(2, "Aman");
		
		System.out.println("Size of the linkedList is : "+ll.size()+"\n");
		ll.forEach(value -> System.out.println("Value is : "+value+" with index "+ll.indexOf(value)));
		
		System.out.println(ll.getFirst()+" AND "+ll.getLast());
		
		System.out.println("\n"+"============================="+"\n");
		ll.remove();
		ll.removeFirst();
		ll.removeLast();
		ll.remove("Aman");
		
		ll.push("Amrit");
		ll.push("Rahul");
		
		ll.poll();
		ll.pop();
		System.out.println("Size of the linkedList is : "+ll.size()+"\n");
		ll.forEach(value -> System.out.println("Value is : "+value+" with index "+ll.indexOf(value)));
		
		
		
	}

	public static void main(String[] args) {
		linkedListUtils();
	}
}