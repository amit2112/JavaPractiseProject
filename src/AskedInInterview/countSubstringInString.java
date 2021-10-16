package AskedInInterview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.org.apache.xalan.internal.xsltc.cmdline.Compile;

public class countSubstringInString {
	String str1 = "AABCCAAADCBBAADBBC";
	String str2 = "AA";
	int lastIndex = 0;
	int count = 0;
	
	public int getSubStringCount(){
		while(lastIndex != -1){
			lastIndex = str1.indexOf(str2, lastIndex);
			//System.out.println("LastInex = : "+lastIndex);
			
			if(lastIndex!=-1){
				count++;
				lastIndex+=str2.length();
			}
		}
		
		return count;
	}
	
	public int getCountUsingMatcher(){
		Matcher matcher = Pattern.compile(str1).matcher(str2);
		int counter=0;
		while(matcher.find()){
			counter++;
		}
		
		System.out.println("Str1 is : "+str1);
		return counter;
	}

	public static void main(String[] args) {
		countSubstringInString cs = new  countSubstringInString();
		System.out.println(cs.getSubStringCount());
		
		System.out.println("==========================================");
		System.out.println(cs.getCountUsingMatcher());
	}

}
