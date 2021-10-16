package StringIllustrative;

public class StringInIncreasingOrderSizeBased {
	static String str = "This is a house";
	
	public static void sortStringAsc(){
		String arr[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				String temp=arr[i];
				if(arr[i].length() > arr[j].length()){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			sb.append(" "+arr[i]);
		}
		System.out.println("Sorted String based on size : "+sb);
	}
	
	public static void sortStringDesc(){
		String arr[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				String temp=arr[i];
				if(arr[i].length() < arr[j].length()){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			sb.append(" "+arr[i]);
		}
		System.out.println("Sorted String based on size : "+sb);
	}

	public static void main(String[] args) {
		System.out.println("Actual String is : "+str);
		sortStringAsc();
		sortStringDesc();
	}
}