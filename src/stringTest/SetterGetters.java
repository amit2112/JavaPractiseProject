package stringTest;

import java.util.Random;

public class SetterGetters {
	private static int number=2;
	
	public int getNumber(){
		return this.number;
	}
	
	public void setNumber(int num){
			this.number=num;
	}

	public static void main(String[] args) {
		SetterGetters sg = new SetterGetters();
		System.out.println("old number is :- "+number);
		sg.setNumber(10);
		System.out.println("updated number is :- "+sg.getNumber());
		
		String s= "xyz";
	}

}
