package AskedInInterview;

public class ReverseString {
	static String str1 = "I Am Good";
	
	public static void reverseSentence(){
		String temp[] = str1.split(" ");
		for(int i=temp.length-1; i>=0; i--){
			System.out.print(temp[i]+" ");
		}
	}
	
	public static void reverseWord(){
		String temp = "";
		for(int i=str1.length()-1; i>=0; i-- ){
			temp=temp+str1.charAt(i);
		}
		System.out.print(temp);
	}
	
	public static void main(String[] args) {
		reverseSentence();
		System.out.println("\n"+"===========================================");
		reverseWord();
	}

}
