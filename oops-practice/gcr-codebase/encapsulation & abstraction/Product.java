public class Product {
    private String productId;
    private String productName;
    private double price;
    private int quantity;
    private String category;

    public Product(String productId, String productName, double price, int quantity, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be positive!");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println("Added " + amount + " units. New quantity: " + quantity);
        } else {
            System.out.println("Invalid quantity!");
        }
    }

    public void removeStock(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
            System.out.println("Removed " + amount + " units. New quantity: " + quantity);
        } else {
            System.out.println("Invalid quantity or insufficient stock!");
        }
    }

    public String getCategory() {
        return category;
    }

    public double calculateTotalValue() {
        return price * quantity;
    }

    public void applyDiscount(double discountPercent) {
        if (discountPercent > 0 && discountPercent <= 100) {
            price = price * (1 - discountPercent / 100);
            System.out.println("Discount applied! New price: Rs. " + price);
        } else {
            System.out.println("Invalid discount percent!");
        }
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + category);
        System.out.println("Total Value: Rs. " + calculateTotalValue());
    }
}
