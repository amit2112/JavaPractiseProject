package Test;

public class DuplicateInArray {
	public static int[] arr = { 1, 3, 7, 1, 7,2,3,2, };

	public static void duplicatValue() {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j] && (i != j)) {
					System.out.println("duplicate is : " + arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		duplicatValue();
	}

}
