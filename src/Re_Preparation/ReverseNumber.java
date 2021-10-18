package Re_Preparation;

public class ReverseNumber {
	public static long getReverseNumber(long num){
		long sum =0;
		while(num != 0){
			long lastdigit = num%10;
			sum = (sum*10)+lastdigit;
			num = num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		long num = 10;
		System.out.println(getReverseNumber(num));
	}

}
