import java.util.Hashtable;
class Product {
    private int productId;
    private String name;
    private String category;
    private double price;

    // Constructor
    public Product(int productId, String name, String category, double price) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to print product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
    }
}


 class ProductInventory {
    private Hashtable<Integer, Product> productTable;

    // Constructor
    public ProductInventory() {
        productTable = new Hashtable<>();
    }

    // Method to add a product
    public boolean addProduct(Product product) {
        if (productTable.containsKey(product.getProductId())) {
            return false; // Product ID already exists
        }
        productTable.put(product.getProductId(), product);
        return true;
    }

    // Method to remove a product by productId
    public boolean removeProduct(int productId) {
        return productTable.remove(productId) != null;
    }

    // Method to show the price of a product by productId
    public String showProductPrice(int productId) {
        Product product = productTable.get(productId);
        if (product != null) {
            return "Price for product ID " + productId + ": $" + product.getPrice();
        }
        return "Product not found.";
    }

    // Method to print all products
    public void printAllProducts() {
        for (Product product : productTable.values()) {
            product.displayProductDetails();
        }
    }
}
public class Map_HAshTable{
    public static void main(String[] args) {
        ProductInventory inventory = new ProductInventory();

        // Adding products
        Product product1 = new Product(1, "Laptop", "Electronics", 999.99);
        Product product2 = new Product(2, "Smartphone", "Electronics", 499.99);
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Printing all products
        System.out.println("All Products:");
        inventory.printAllProducts();

        // Showing product price
        System.out.println(inventory.showProductPrice(1));

        // Removing a product
        System.out.println("Removing Product with ID 1: " + inventory.removeProduct(1));

        // Printing all products after removal
        System.out.println("All Products after removal:");
        inventory.printAllProducts();
    }
}

