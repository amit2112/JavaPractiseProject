package inheritance;

public class ChildClass extends ParentClass {
	public String greet = "Good Morning from Base Class !";
	public ChildClass(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void greetings(){
		System.out.println(greet);
	}

	public static void main(String[] args) {
		ParentClass p1 = new ParentClass(1,5);
		p1.greetings();
		p1.sum();
		
		System.out.println("=================");
		ParentClass p2 =  new ChildClass(1,7);
		p2.greetings();
		p2.sum();
	}
}