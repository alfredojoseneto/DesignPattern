package br.com.alfredo.pattern.singleton;

public class SingletonSynchronized {

	private static SingletonSynchronized uniqueInstance;

	private SingletonSynchronized() {
	}

	public static synchronized SingletonSynchronized getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonSynchronized();
		}
		return uniqueInstance;
	}

}
