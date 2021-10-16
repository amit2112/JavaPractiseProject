package AskedInInterview;

import java.util.Arrays;

public class StringShuffling {
	String str = "";
	
	public void sortString(String s, Integer[] indices){
		for(int i=0; i<=indices.length-1; i++){
			int temp = Arrays.asList((Integer[])indices).get(indices[i]);
			System.out.println("Temp = "+temp+", "+s.charAt(indices[temp]));
			str+=s.charAt(indices[temp]);
		}
		System.out.print(str);
	}

	public static void main(String[] args) {
		String s = "aaiougrt"; 
		Integer[] indices = {4,0,2,6,7,3,1,5};
		StringShuffling sh =  new StringShuffling();
		sh.sortString(s, indices);
	}
}