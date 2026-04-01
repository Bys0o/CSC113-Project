package CSC113_Proj;

//Intermediate class for electronic devices.
//Demonstrates Level 1 Inheritance from the Product class.

public class Electronics extends Product{

	private String brand;
	private int warrantyMonths;
	public Electronics(int id, String name, double price, String brand, int warrantyMonths) {
		super(id, name, price);
		this.brand = brand;
		this.warrantyMonths = warrantyMonths;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getWarrantyMonths() {
		return warrantyMonths;
	}
	public void setWarrantyMonths(int warrantyMonths) {
		this.warrantyMonths = warrantyMonths;
	}
	
	public void displayInfo() {
	    System.out.println("ID: " + getId() + ", Name: " + getName() + 
	                       ", Brand: " + brand + ", Warranty: " + warrantyMonths);
	}

}