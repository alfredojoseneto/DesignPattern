package br.com.alfredo.pattern.singleton;

public class Singleton {
	
	private static Singleton uniqueInstance;
	
	private Singleton() {
		System.out.println("A Singleton instance was created");
	};
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	public void printSomething(String msg) {
		System.out.println("Display the text inserted:\n" + msg);
	}

}
