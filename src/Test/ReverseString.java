package Test;

public class ReverseString {
	public static String str="How are you Amit?";
	
	public static void revStringByWord(){
		String[] temp = str.split(" ");
		System.out.println(str);
		for(int i=temp.length-1; i>=0; i--){
			System.out.print(temp[i]+" ");
		}
	}
	
	public static void revStringByCharacter(){
		String temp ="";
		for(int i=str.length()-1; i>=0; i--){
			temp=temp+str.charAt(i);
		}
		System.out.print("\n"+temp);
	}

	public static void main(String[] args) {
		revStringByWord();
		revStringByCharacter();
	}

}
