package stringTest;

public class RevString1 {
	static String str ="How are you";
	
	public static void revString1(){
		String arr[]=str.split(" ");
		for(int i=arr.length-1; i>=0; i--){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void revString2(){
		String temp="";
		for(int i=str.length()-1;i>=0; i--){
			temp = temp+str.charAt(i);
		}
		System.out.println("\n"+temp);
	}

	public static void main(String[] args) {
		revString1();
		revString2();
	}

}
