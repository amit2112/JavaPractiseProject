package Strings;

public class StringUtility {
	
	static String str = "fluffytuba";

	public static void stringUtils(){
		System.out.println("Size of the String : "+str.length());
		System.out.println("Character at 5th index : "+str.charAt(5));
		System.out.println("Substring : "+str.substring(4, 7));
		System.out.println("Concatenation : "+str.concat("_PWD"));
		System.out.println("Index of character y is : "+str.indexOf('y'));
		System.out.println("Last index of f : "+str.lastIndexOf('f'));
		System.out.println("UpperCase : "+str.toUpperCase());
		System.out.println("LowerCase : "+str.toLowerCase());
		System.out.println("Replace character t : "+str.replace('t', 'M'));
		System.out.println("Hashcode of the String : "+str.hashCode());
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reversed String is : "+sb.reverse());
	}
	
	public static void main(String[] args) {
		stringUtils();
	}

}
