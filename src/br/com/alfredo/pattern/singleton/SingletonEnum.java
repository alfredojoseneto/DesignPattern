package br.com.alfredo.pattern.singleton;

public enum SingletonEnum {

	INSTANCE;

	int value;

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

}
