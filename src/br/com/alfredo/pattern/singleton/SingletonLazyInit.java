package br.com.alfredo.pattern.singleton;

public class SingletonLazyInit {

	private volatile static SingletonLazyInit uniqueInstance;

	private SingletonLazyInit() {
	}

	private static SingletonLazyInit getInstance() {
		if (uniqueInstance == null) {
			synchronized (SingletonLazyInit.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new SingletonLazyInit();
				}
			}
		}
		return uniqueInstance;

	}

}
