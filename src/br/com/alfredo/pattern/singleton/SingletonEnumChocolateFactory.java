package br.com.alfredo.pattern.singleton;

public enum SingletonEnumChocolateFactory {

	INSTANCE;

	private boolean empty;
	private boolean boiled;

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	public void fill() {
		if (this.isEmpty()) {
			this.empty = false;
			this.boiled = false;
		}
	}

	public void boil() {
		if (!this.isEmpty() && !this.isBoiled()) {
			this.boiled = true;
		}
	}

	public void drain() {
		if (!this.isEmpty() && this.isBoiled()) {
			this.empty = false;
		}
	}
}
