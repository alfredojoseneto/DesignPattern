package br.com.alfredo.pattern.main;
import br.com.alfredo.pattern.singleton.*;

public class Main {

	public static void main(String[] args) {
//		Singleton firstSingletonInstance = Singleton.getInstance();
//		
//		firstSingletonInstance.printSomething("First instance");
//		
//		Singleton seccondSingletonInstance = Singleton.getInstance();
//		seccondSingletonInstance.printSomething("Seccond instance");
		SingletonEnumChocolateFactory chocFactory = SingletonEnumChocolateFactory.INSTANCE;
		

		chocFactory.setContainerNumber(1);

		chocFactory.fill();
		chocFactory.boil();
		chocFactory.drain();
	}
	
}
