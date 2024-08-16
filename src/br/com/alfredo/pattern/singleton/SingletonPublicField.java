package br.com.alfredo.pattern.singleton;

public class SingletonPublicField {

	public static SingletonPublicField uniqueInstance = new SingletonPublicField();

	private SingletonPublicField() {
	}

}
