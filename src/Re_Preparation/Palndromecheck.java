package Re_Preparation;

public class Palndromecheck {
	public static boolean checkPalidrome1(String str){
		int j=str.length()-1;
		for(int i=0; i<str.length()/2; i++){
			if(str.charAt(i) != str.charAt(j-i)){
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkPalindrome2(String str){
		for(int i=0; i<=str.length()-1; i++){
			char temp = str.charAt(i);
			for(int j=str.length()-1; j>=0; j--){
				if(temp == str.charAt(j)){
					System.out.println(str.charAt(i)+" "+str.charAt(j));
					System.out.println(temp);
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "kanak";
		//System.out.println(checkPalidrome1(str));
		System.out.println(checkPalindrome2(str));
	}
}