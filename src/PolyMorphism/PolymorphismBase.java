package PolyMorphism;

public class PolymorphismBase extends PolyMorphismOverRiding{
	
	@Override
	public void show(){
		System.out.println("This is base class call () ");
	}
	
	public static void main(String[] args) {
		PolyMorphismOverRiding pm = new PolyMorphismOverRiding();
		pm.show();
		
		PolyMorphismOverRiding pm1 = new PolymorphismBase();
		pm1.show();
		
	}
	
}
