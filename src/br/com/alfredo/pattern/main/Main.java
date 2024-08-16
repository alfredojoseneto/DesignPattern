package br.com.alfredo.pattern.main;
import br.com.alfredo.pattern.singleton.Singleton;

public class Main {

	public static void main(String[] args) {
		Singleton firstSingletonInstance = Singleton.getInstance();
		
		firstSingletonInstance.printSomething("First instance");
		
		Singleton seccondSingletonInstance = Singleton.getInstance();
		seccondSingletonInstance.printSomething("Seccond instance");
	}
	
}
