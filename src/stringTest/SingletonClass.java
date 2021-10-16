package stringTest;

public class SingletonClass {
	private static SingletonClass singleton_instance = null;
	
	public String s;
	private SingletonClass(){
		s="I am inside of singleton class constructor";
	}
	
	public static SingletonClass getInstance(){
		if(singleton_instance == null){
			singleton_instance = new SingletonClass();
		}
		return singleton_instance;
	}

	public static void main(String[] args) {
		SingletonClass s = new SingletonClass();
		System.out.println(s.s);
		
		SingletonClass s1 = new SingletonClass();
		System.out.println(s.s);
		
	}
}