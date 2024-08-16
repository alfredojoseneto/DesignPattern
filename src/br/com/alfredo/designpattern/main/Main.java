package br.com.alfredo.designpattern.main;
import br.com.alfredo.designpattern.core.Singleton;

public class Main {

	public static void main(String[] args) {
		Singleton firstSingletonInstance = Singleton.getInstance();
		
		firstSingletonInstance.printSomething("First instance");
		
		Singleton seccondSingletonInstance = Singleton.getInstance();
		seccondSingletonInstance.printSomething("Seccond instance");
	}
	
}
