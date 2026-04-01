package CSC113_Proj;

//Helper class used to demonstrate Composition within the Laptop class.

public class Processor {

private String brand;
private String model;
public Processor(String brand, String model) {
	super();
	this.brand = brand;
	this.model = model;
}
public void displayProcessor() {
	System.out.println("Processor: " + brand + " | Model: " + model);
}

}
