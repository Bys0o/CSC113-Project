package CSC113_Proj;

import java.util.Scanner;

//The main tester class providing a menu-driven interface for system interaction.

public class TestStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ShoppingCart cart = new ShoppingCart(10); 
        
        Laptop macbook = new Laptop(101, "MacBook Pro", 8000.0, "Apple", 24, 16, "M5");
        Smartphone iphone = new Smartphone(102, "iPhone 17", 4500.0, "Apple", 12, 5000, "iOS");        
        int choice = 0;
        
        System.out.println(" Welcome to the Smart Electronics Store ");
        
        while (choice != 5) {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Add Default Products to Cart");
            System.out.println("2. Search for a Product (by ID)");
            System.out.println("3. Remove a Product (by ID)");
            System.out.println("4. Show Cart & Total Amount");
            System.out.println("5. Checkout & Exit");
            System.out.println("===============================");
            System.out.print("Enter your choice (1-5): ");
            
            choice = input.nextInt(); 
            
            switch (choice) {
                case 1:
                    cart.addProduct(macbook);
                    cart.addProduct(iphone);
                    System.out.println("Products added successfully!");
                    break;
                    
                case 2:
                    System.out.print(" Enter Product ID to search: ");
                    int searchId = input.nextInt();
                    cart.searchProduct(searchId);
                    break;
                    
                case 3:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = input.nextInt();
                    cart.removeProduct(removeId);
                    break;
                    
                case 4:
                    cart.showCart(); 
                    break;
                    
                case 5:
                    System.out.println(" Thank you for shopping with us! Goodbye.");
                    break;
                    
                default:
                    System.out.println(" Invalid choice! Please enter a number between 1 and 5.");
            }
        }
        
        input.close(); 
    }

}