package inheritance;

public class ParentClass {
	public int num1,num2;
	public String greet="Good Morning from Parent Class !";
	public ParentClass(int x, int y){
		this.num1=x;
		this.num2=y;
	}
	
	public void greetings(){
		System.out.println(greet);
	}
	
	public void sum(){
		System.out.println("Sum is : "+(num1+num2));
	}
}
