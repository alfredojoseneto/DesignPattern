package br.com.alfredo.pattern.singleton;

public enum SingletonEnumChocolateFactory {

	INSTANCE;

	private int containerNumber;
	private boolean empty;
	private boolean boiled;

	public void setContainerNumber(int containerNumber) {
		this.containerNumber = containerNumber;
	}

	public int getContainerNumber() {
		return this.containerNumber;
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	public void fill() {
		System.out.printf("The container %d was filled\n", this.containerNumber);
		if (this.isEmpty()) {
			this.empty = false;
			this.boiled = false;
		}
	}

	public void boil() {
		System.out.printf("The container %d content was boiled\n", this.containerNumber);
		if (!this.isEmpty() && !this.isBoiled()) {
			this.boiled = true;
		}
	}

	public void drain() {
		System.out.printf("The container %s was emptied and the content is already boiled and finished\n",
				this.containerNumber);
		if (!this.isEmpty() && this.isBoiled()) {
			this.empty = false;
		}
	}
}
