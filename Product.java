package CSC113_Proj;

//Abstract base class representing a generic product in the store.
//Demonstrates the concept of Abstraction and the root of the hierarchy.

public abstract class Product {

	private int id;
	private String name;
	private double price;
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public abstract void displayInfo() ;
	
	public  void applyDiscount(double percentage) {
		this.price = this.price - (this.price * (percentage / 100.0));	
	}

}