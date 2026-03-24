# Inventory-System-Java
To design and implement an Inventory Management System using Java that allows the  user to add, view, update, and remove products using HashMap.  This project demonstrates the use of Object-Oriented Programming concepts and  Java Collection Framework. 
Here’s a clean, professional GitHub README.md for your Inventory Management System (Java) — with full code included 👇💙

📦 Inventory Management System using Java

A simple and efficient Inventory Management System developed using Java, designed to manage product stock using HashMap and Object-Oriented Programming concepts.

🚀 Features
➕ Add new products to inventory
📊 View all available products
🔄 Update product stock quantity
🗑️ Remove products from inventory
🔍 Fast product lookup using HashMap
📋 Menu-driven user interface
🛠️ Technologies Used
Java
OOP Concepts (Classes & Objects)
Collections Framework (HashMap)
Scanner (User Input Handling)
📌 How It Works
User selects an option from the menu
Inputs product details (ID, Name, Quantity, Price)
Products are stored in a HashMap using ID as key
User can:
View all products
Update stock quantity
Remove products
System runs continuously until exit
📂 Project Structure
📁 Project Folder
 ┗ 📄 InventorySystem.java
▶️ How to Run
javac InventorySystem.java
java InventorySystem
💻 Source Code
import java.util.*; 

class Product { 
    int id; 
    String name; 
    int quantity; 
    double price; 

    Product(int id, String name, int quantity, double price) { 
        this.id = id; 
        this.name = name; 
        this.quantity = quantity; 
        this.price = price; 
    } 

    void display() { 
        System.out.println(id + " | " + name + " | Qty: " + quantity + " | Price: " + price); 
    } 
} 

class Inventory { 
    HashMap<Integer, Product> stock = new HashMap<>(); 

    void addProduct(Product p) { 
        stock.put(p.id, p); 
        System.out.println("Product added successfully."); 
    } 

    void viewProducts() { 
        if (stock.isEmpty()) { 
            System.out.println("Inventory is empty."); 
            return; 
        } 

        System.out.println("\n---- Inventory Stock ----"); 
        for (Product p : stock.values()) { 
            p.display(); 
        } 
    } 

    void updateStock(int id, int qty) { 
        if (stock.containsKey(id)) { 
            Product p = stock.get(id); 
            p.quantity += qty; 
            System.out.println("Stock updated."); 
        } else { 
            System.out.println("Product not found."); 
        } 
    } 

    void removeProduct(int id) { 
        if (stock.remove(id) != null) { 
            System.out.println("Product removed."); 
        } else { 
            System.out.println("Product not found."); 
        } 
    } 
} 

public class InventorySystem { 

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 
        Inventory inv = new Inventory(); 

        while (true) { 

            System.out.println("\n===== Inventory Menu ====="); 
            System.out.println("1. Add Product"); 
            System.out.println("2. View Products"); 
            System.out.println("3. Update Stock"); 
            System.out.println("4. Remove Product"); 
            System.out.println("5. Exit"); 

            System.out.print("Enter choice: "); 
            int ch = sc.nextInt(); 

            switch (ch) { 

                case 1: 
                    System.out.print("Enter ID: "); 
                    int id = sc.nextInt(); 

                    System.out.print("Enter Name: "); 
                    String name = sc.next(); 

                    System.out.print("Enter Quantity: "); 
                    int qty = sc.nextInt(); 

                    System.out.print("Enter Price: "); 
                    double price = sc.nextDouble(); 

                    Product p = new Product(id, name, qty, price); 
                    inv.addProduct(p); 
                    break; 

                case 2: 
                    inv.viewProducts(); 
                    break; 

                case 3: 
                    System.out.print("Enter Product ID: "); 
                    int uid = sc.nextInt(); 

                    System.out.print("Enter Quantity to Add: "); 
                    int addQty = sc.nextInt(); 

                    inv.updateStock(uid, addQty); 
                    break; 

                case 4: 
                    System.out.print("Enter Product ID to remove: "); 
                    int rid = sc.nextInt(); 

                    inv.removeProduct(rid); 
                    break; 

                case 5: 
                    System.out.println("Exiting system..."); 
                    sc.close(); 
                    return; 

                default: 
                    System.out.println("Invalid choice."); 
            } 
        } 
    } 
}
<img width="1911" height="808" alt="Screenshot 2026-03-12 135931" src="https://github.com/user-attachments/assets/626bace5-4c31-45f3-8a41-e19d738c7eec" />
<img width="1918" height="807" alt="Screenshot 2026-03-12 140003" src="https://github.com/user-attachments/assets/d18bde1d-dfc6-4e64-9204-9b7cb73886f1" />
<img width="1897" height="747" alt="Screenshot 2026-03-12 140041" src="https://github.com/user-attachments/assets/1a64fe95-f3fe-46aa-86f7-dc62210b82c7" />

📊 Sample Output
===== Inventory Menu =====
1. Add Product
2. View Products
3. Update Stock
4. Remove Product
5. Exit

Enter choice: 1
Enter ID: 101
Enter Name: Pen
Enter Quantity: 10
Enter Price: 5

---- Inventory Stock ----
101 | Pen | Qty: 10 | Price: 5.0
🎯 Learning Outcomes
Understanding HashMap for fast data storage
Applying OOP concepts in Java
Building menu-driven applications
Managing inventory data efficiently
Practicing user input handling
🙌 Conclusion

This project demonstrates how Java can be used to build a simple yet effective inventory management system using collections and object-oriented design.
