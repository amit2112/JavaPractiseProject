package TestWork;

public class ReverseString {
	
	public String revStringByWord(String str){
		String arr[]= str.split(" ");
		String temp =""; 
		System.out.println("Array length : "+arr.length);
		for(int i=arr.length-1; i>=0; i--){
			temp=temp+arr[i]+" ";
		}
		System.out.println("Reversed String : "+temp);
		return temp;
	}
	
	public String revStringByChar(String str){
		String temp = "";
		StringBuilder res = new StringBuilder();
		for(int i=str.length()-1; i>=0; i--){
			temp=temp+str.charAt(i);
			char temp2=str.charAt(i);
			int a = str.indexOf(temp);
			res.append((a != -1) ? str.charAt(a) : temp);
		}
		System.out.println("Reversed String : "+temp);
		//System.out.println("Mirror String : "+res);
		return res.toString();
	}
	
	public void M1(){
		String string="whatever";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println(string);
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		String str= "Hello";
		ReverseString rev = new ReverseString();
		rev.revStringByWord(str);
		System.out.println(rev.revStringByChar(str));
	}

}
