package ex_11_Class.util;

public class Car2 {
	public String model;
	private String owner;

	private Car2() {
	}

	public Car2(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	private void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
