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
		System.out.println("The container was filled");
		if (this.isEmpty()) {
			this.empty = false;
			this.boiled = false;
		}
	}

	public void boil() {
		System.out.println("The container content was boiled");
		if (!this.isEmpty() && !this.isBoiled()) {
			this.boiled = true;
		}
	}

	public void drain() {
		System.out.println("The container was emptied and the content is already boiled and finished");
		if (!this.isEmpty() && this.isBoiled()) {
			this.empty = false;
		}
	}
}
