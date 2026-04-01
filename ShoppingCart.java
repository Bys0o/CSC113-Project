package CSC113_Proj;

//Manager class that handles an array of Product objects.
//Demonstrates Aggregation and the use of Recursion for total price calculation.

public class ShoppingCart {

    private Product[] item;
    private int count;

    public ShoppingCart(int capacity) {
        item = new Product[capacity];
        this.count = 0;
    }

 // Method to add a Product object to the items array (Aggregation)
    public void addProduct(Product p) {
        if (count < item.length) {
            item[count] = p;
            count++;
            System.out.println("Added: " + p.getName());
        } else {
            System.out.println("Cart is full!");
        }
    }

    public double calculateTotal() {
        return calculateTotalRecursive(0);
    }

 // Recursive method to calculate the total price of all items in the cart
    private double calculateTotalRecursive(int index) {
        if (index == count) {
            return 0;
        }
        return item[index].getPrice() + calculateTotalRecursive(index + 1);
    }

    public void showCart() {
        System.out.println("\n--- Shopping Cart Content ---");
        for (int i = 0; i < count; i++) {
            item[i].displayInfo();
            System.out.println("-----------------------------");
        }
        System.out.println("Total Amount: " + calculateTotal() + " SAR");
    }

 // Method to find a product in the cart using its ID and display its information
    public void searchProduct(int searchId) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (item[i].getId() == searchId) {
                System.out.println("\n--- Product Found ---");
                item[i].displayInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found");
        }
    }

 // Method to search for and remove a product from the array by its unique ID
    public void removeProduct(int removeId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (item[i].getId() == removeId) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                item[i] = item[i + 1];
            }
            count--;
            System.out.println("Product removed successfully");
        } else {
            System.out.println("Product not found to remove");
        }
    }

}
