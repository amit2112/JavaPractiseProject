package Re_Preparation;

public class RevString {
	static String newStringByWord = "";
	static String newStringByChar = "";
	public static String revStringByWord(String Str){
		String arr[] = Str.split(" ");
		for(int i=arr.length-1; i>=0; i--){
			newStringByWord+=arr[i]+" ";
		}
		return newStringByWord;
	}
	
	public static String revStringByChar(String Str){
		char arr[] = Str.toCharArray();
		for(int i=arr.length-1; i>=0; i--){
			char temp=arr[i];
			newStringByChar+=temp;
		}
		return newStringByChar;
	}
	
	public static String revUsingRecursion(String Str){
		if(Str.isEmpty()){
			return Str;
		}
		return revUsingRecursion(Str.substring(1))+Str.charAt(0);
	}

	public static void main(String[] args) {
		String Str = "Hey Amit";
		System.out.println(revStringByWord(Str));
		System.out.println(revStringByChar(Str));
		System.out.println(revUsingRecursion(Str));
	}

}
