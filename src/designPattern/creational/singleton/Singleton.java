package designPattern.singleton;

public class Singleton { 
	
	private static Singleton instance = null;
	
	public Singleton() {}
  
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			return new Singleton();
		}
		return instance;
	}
  
	public void showMessage() {
		System.out.println("Hello World!");
	}
}