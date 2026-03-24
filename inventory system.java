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
