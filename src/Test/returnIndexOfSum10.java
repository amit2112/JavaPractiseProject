package Test;

public class returnIndexOfSum10 {
	static int arr[]={1,2,3,4,5,6,7,8,9};
	
	public static void returnIndex(){
		for(int i=0; i<=arr.length; i++){
			for(int j=0; j<=arr.length; j++){
				if(i+j==10){
					System.out.println("Index which has sum of 10 are : "+i+","+j);
				}
			}
		}
	}

	public static void main(String[] args) {
		returnIndex();
	}
}