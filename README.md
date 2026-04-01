# 🛒 Smart Electronics Store System

## 📝 Project Overview
This is our Java project for **CSC 113 (Phase 1)**. We developed a "Smart Electronics Store" management system that allows users to handle an inventory of tech products. The program supports adding items (Laptops and Smartphones) to a shopping cart, searching for products, removing items, and calculating the final bill using advanced OOP techniques.

## 🚀 Key Features
- **Cart Operations:** Users can add products, search for specific items by ID, and remove products from their cart.
- **Dynamic Pricing:** We used **Recursion** to calculate the total price of all items in the cart automatically.
- **Discount Management:** Integrated a discount system for different customer memberships (Gold and Silver) through a specialized interface.
- **Hardware Tracking:** The system tracks specific hardware details like Processor types, RAM size, and Battery capacity.

## 🛠️ OOP Concepts Implemented
To meet the project requirements, we implemented the following:
* **Inheritance (2 Levels):** `Product` (Abstract) -> `Electronics` -> `Laptop` & `Smartphone`.
* **Abstraction:** The `Product` class is abstract with an abstract method `displayInfo()` for polymorphism.
* **Encapsulation:** All attributes are private/protected with proper getters and setters.
* **Interfaces:** The `Discountable` interface was implemented by the `Customer` class to handle membership discounts.
* **Relationships:**
    * **Composition:** The `Laptop` class "has-a" `Processor` object.
    * **Aggregation:** The `ShoppingCart` class manages an array of `Product` objects.
* **Recursion:** The `calculateTotalRecursive` method handles the sum of prices without using loops.

## 📊 Class Diagram (UML)
Below is our project's design structure:

👉 **[Click here to view the UML Diagram (PDF)](./CSC_Proj_UML.pdf)**
*(Note: If the image doesn't appear, please check the UML.png file in the repository.)*

## 📂 Project Structure
- `Product.java`: The abstract base class.
- `Electronics.java`: Level 1 subclass for tech devices.
- `Laptop.java` & `Smartphone.java`: Level 2 subclasses (Specific products).
- `Processor.java`: Component class for the Laptop (Composition).
- `ShoppingCart.java`: The manager class (Handles Array & Recursion).
- `Customer.java`: Implements the `Discountable` interface.
- `Discountable.java`: The interface for discount logic.
- `TestStore.java`: The main tester class with the menu-driven system.

## 👥 Team Members
* **[Salman Mislat AL-Mutairi]** - (ID: [446102848])
* **[Abdulaziz Mazen AL-Aushan]** - (ID: [446104638])

## 💻 How to Run
1. Download or clone this repository.
2. Compile all `.java` files in the `CSC113_Proj` package.
3. Run `TestStore.java` and follow the menu instructions (Options 1-5).
