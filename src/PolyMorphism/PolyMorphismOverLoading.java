package PolyMorphism;

public class PolyMorphismOverLoading {

	public static int sum(int x, int y){
		return (x+y);
	}
	public static int sum(int x, int y, int z){
		return (x+y+z);
	}
	
	public double sum(double x, double y){
		return (x+y);
	}
	
	
	public static void main(String[] args) {
		PolyMorphismOverLoading pe = new PolyMorphismOverLoading();
		System.out.println(pe.sum(10, 20));
		System.out.println(pe.sum(15, 25, 35));
		System.out.println(pe.sum(10.0, 20.5));
	}

}
